package encoding.affine.iall;

import java.util.Scanner;

public interface TextGet {
	public static String textGet(){
		System.out.println("Введите текст: ");
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		return text;
	}
}
