package encoding.affine.iall;

public class RuDialog implements Dialog {
	
	@Override
	public String encode(String text) {
		PrintEncode print = new RuGetEncoding();
		String encode = print.printEncode(text);
		return encode;
	}
	
	@Override
	public String decode(String text) {
		PrintDecode print = new RuGetDecoding();
		String decode = print.printDecode(text);
		return decode;
	}
}
