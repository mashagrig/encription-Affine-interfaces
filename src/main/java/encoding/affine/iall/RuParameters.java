package encoding.affine.iall;

public class RuParameters implements Parameters {
	private static String base = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
	private static int a = 4;
	private static int b = 3;
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
