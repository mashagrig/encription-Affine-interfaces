package encoding.affine.iall;
/**
 * Возвращает расшифрованную строку
 */
public class RuGetDecoding implements PrintDecode {
	
	@Override
	public String printDecode(String text) {
		Decoding ruDecoding = new RuDecoding();
		String decod = ruDecoding.decoding(text);
		return decod;
	}
}
