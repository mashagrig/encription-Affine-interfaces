package encoding.affine.iall;

public class RuEncoding implements Encoding {
	Parameters param = new RuParameters();
	private String base = param.GetBase();
	private int a = param.aGet();
	private int b = param.bGet();
	private int m = param.mGet();
	
	@Override
	public String encoding( String text) {
		
			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < text.length(); i++) {
				char ch = text.charAt(i);
				
				if (Character.isLetter(ch)) {
					int indEncode =( a * base.indexOf(ch) + b)% m;
					ch = base.charAt(indEncode);
				}
				builder.append(ch);
			}
			String encodeText =  builder.toString();
			return encodeText;
	}
}
