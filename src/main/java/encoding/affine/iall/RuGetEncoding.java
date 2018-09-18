package encoding.affine.iall;
/**
 * Возвращает зашифрованную строку
 */
public class RuGetEncoding implements PrintEncode {
	@Override
	public String printEncode(String text) {
		Encoding ruEncoding = new RuEncoding();
		String encod = ruEncoding.encoding(text);
		return encod;
	}
}
