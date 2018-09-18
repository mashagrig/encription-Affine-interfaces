package encoding.affine.iall;

import java.util.Scanner;

public class AffineMain {
	
	public static void main(String args[]) {
		
		System.out.println("Укажите язык шифрования. Русский - введите Р, английский - введите А ");
	/*	TextG st = new TextG();
		TextGet stget = TextGet::textGet;
		String textEnter = stget.toString();
		String textEnter = st.textGet();*/
	
		String textEnter = TextGet.textGet();
		
	
		if (textEnter.equalsIgnoreCase("Р")) {
			RuDialog ruDialog = new RuDialog();
			ruDialog.Dialog();
			
		}
		if (textEnter.equalsIgnoreCase("А")) {
			EnDialog enDialog = new EnDialog();
			enDialog.Dialog();
		}
	}
}
