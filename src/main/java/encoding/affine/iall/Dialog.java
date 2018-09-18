package encoding.affine.iall;

public interface Dialog {
	public String encode(String text);
	public String decode(String text);
	public default void Dialog(){
		
		System.out.println("Чтобы произвести шифрование, нажмите Ш, чтобы произвести дешифрование, нажмите Д: ");
		
		String textLocal = TextGet.textGet();
		
		if (textLocal.equalsIgnoreCase("Ш")) {
			
			System.out.println("Введите слово для шифрования: ");
			String text = TextGet.textGet();
			System.out.println("Вы ввели: " + text);
			
			String encode = encode(text);
			String decode = decode(encode);
			
			System.out.println("Ваше слово зашифровано: " + encode);
			System.out.println("Ваше слово дешифровано: " + decode);
		}
		if (textLocal.equalsIgnoreCase("Д")) {
			System.out.println("Введите слово для дешифрования: ");
			String text = TextGet.textGet();
			System.out.println("Вы ввели: " + text);
			
			String decode = decode(text);
			
			System.out.println("Ваше слово дешифровано: " + decode);
		}
	}
}
