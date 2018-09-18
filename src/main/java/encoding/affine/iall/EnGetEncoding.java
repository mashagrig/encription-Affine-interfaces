package encoding.affine.iall;

/**
 * Возвращает зашифрованную строку
 */
public class EnGetEncoding implements PrintEncode {

	@Override
	public String printEncode(String text) {
		
		Encoding enEncoding = new EnEncoding();
		String encod = enEncoding.encoding(text);
		return encod;
	}
}
