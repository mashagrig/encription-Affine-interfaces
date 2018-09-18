package encoding.affine.iall;

/**
 * Возвращает расшифрованную строку
 */
public class EnGetDecoding implements PrintDecode {
	@Override
	public String printDecode(String text) {
		Decoding enDecoding = new EnDecoding();
		String decod = enDecoding.decoding(text);
		return decod;
	}
}
