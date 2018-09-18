package encoding.affine.iall;

public class EnEncoding implements Encoding{
	Parameters param = new EnParameters();
	private String base = param.GetBase();
	private int a = param.aGet();
	private int b = param.bGet();
	private int m = param.mGet();

	
	@Override
	public String encoding(String text) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			
			if (Character.isLetter(ch)) {
				ch = (char) ((a * (ch - 'A') + b) % m + 'A');
			}
			builder.append(ch);
		}
		String encodeText =  builder.toString();
		return encodeText;
	}
}
