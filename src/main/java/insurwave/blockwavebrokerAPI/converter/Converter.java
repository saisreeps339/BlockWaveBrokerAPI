package insurwave.blockwavebrokerAPI.converter;

/**
 * Interface to be implemented for conversion from given source S to given
 * destination D.
 * 
 * @author saisree
 *
 * @param <S>
 * @param <D>
 */
public interface Converter<S, D> {

	/**
	 * Converts from given source type S to destination D.
	 * 
	 * @param source
	 * @return
	 */
	public D convert(S source);

}
