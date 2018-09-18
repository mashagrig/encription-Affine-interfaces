package encoding.affine.iall;

public class EnDialog implements Dialog {
	
	@Override
	public String encode(String text) {
		PrintEncode print = new EnGetEncoding();
		String encode = print.printEncode(text);
		return encode;
	}
	
	@Override
	public String decode(String text) {
		PrintDecode print = new EnGetDecoding();
		String decode = print.printDecode(text);
		return decode;
	}
}
