package encoding.affine.iall;

public class EnParameters implements Parameters {
	private static String base = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static int a = 3;
	private static int b = 4;
	private static int m = base.length();
	@Override
	public String GetBase() {
		return base;
	}
	
	@Override
	public int aGet() {
		return a;
	}
	
	@Override
	public int bGet() {
		return b;
	}
	
	@Override
	public int mGet() {
		return m;
	}
}
