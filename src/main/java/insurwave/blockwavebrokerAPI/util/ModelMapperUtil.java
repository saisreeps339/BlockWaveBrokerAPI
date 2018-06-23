package insurwave.blockwavebrokerAPI.util;

import java.util.HashMap;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration.AccessLevel;
import org.modelmapper.convention.MatchingStrategies;

/**
 * Utility class to configure and cache ModelMapper configurations.
 * 
 * @author saisree
 *
 */
public class ModelMapperUtil {

	private static Map<String, ModelMapper> modelMapperMap = new HashMap<String, ModelMapper>();

	/**
	 * Hide from public usage.
	 */
	private ModelMapperUtil() {
	}

	/**
	 * Gets the ModelMapper instance for the given source, destination and typeMap
	 * name.
	 * 
	 * @param source
	 * @param target
	 * @param typeMapName
	 * @return
	 */
	public static <S, D> ModelMapper getModelMapper(Class<S> source, Class<D> target, String typeMapName) {

		ModelMapper modelMapper = modelMapperMap.get(typeMapName);

		if (modelMapper == null) {
			modelMapper = new ModelMapper();
			modelMapper.getConfiguration().setAmbiguityIgnored(true);
			modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
			modelMapper.getConfiguration().setFieldMatchingEnabled(true).setFieldAccessLevel(AccessLevel.PRIVATE);
			// create the typemap
			modelMapper.typeMap(source, target, typeMapName);
			modelMapperMap.put(typeMapName, modelMapper);

		}
		return modelMapper;
	}

}
