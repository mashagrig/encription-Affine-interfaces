package encoding.affine.iall;

import java.math.BigInteger;

public class RuDecoding implements Decoding {
	Parameters param = new RuParameters();
	private String base = param.GetBase();
	private int a = param.aGet();
	private int b = param.bGet();
	private int m = param.mGet();
	
	@Override
	public String decoding(String text) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			
			BigInteger inverse = BigInteger.valueOf(a).modInverse(BigInteger.valueOf((long) m));
			int aInv = inverse.intValue();
			
			if (Character.isLetter(ch)) {
				int x = base.indexOf(ch);
				int indDecod =	( aInv )* ( x - b + m)% m;
				ch = base.charAt(indDecod);
			}
			builder.append(ch);
		}
		String decodeText =  builder.toString();
		return decodeText;
	}
}
