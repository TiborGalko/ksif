package cvicenie1;

import cvicenie1.crypto.CaesarCipher;
import cvicenie1.crypto.CaesarKey;

public class Main {

	public static void main(String[] args) {
		/*for(int i = 1; i < 100; i++) {
			if(cvicenie1.helpers.Math.isPrime(i)) {
				System.out.println(i);
			}			
		}*/
		
		CaesarKey caesarKey = new CaesarKey(4);
		CaesarCipher caesarCipher = new CaesarCipher();
		
		String retazec = "ahelloworld";
		String sifrovanyRetazec = caesarCipher.sifrovanie(caesarKey, retazec);
		System.out.println(sifrovanyRetazec);
		
		String povodnyRetazec = caesarCipher.desifrovanie(caesarKey, sifrovanyRetazec);
		System.out.println(povodnyRetazec);
		
	}

}
