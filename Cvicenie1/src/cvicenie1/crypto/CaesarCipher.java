package cvicenie1.crypto;

public class CaesarCipher implements Cipher {
	
	

	@Override
	public String sifrovanie(Key kluc, String retazec) {
		CaesarKey key = (CaesarKey)kluc;
		char[] charRetazec = retazec.toCharArray();	
		for(int i = 0; i < retazec.length(); i++) {			
			int n = charRetazec[i] - 'a';	
			n += key.posun;
			n %= 26;
			charRetazec[i] = (char) (n + 'a');			
		}
		String vysledkok = new String(charRetazec);
		return vysledkok;
	}

	@Override
	public String desifrovanie(Key kluc, String retazec) {
		CaesarKey key = (CaesarKey)kluc;
		char[] charRetazec = retazec.toCharArray();	
		for(int i = 0; i < retazec.length(); i++) {			
			int n = charRetazec[i] - 'a';				
			n -= key.posun;
			n += 26;
			n %= 26;				
			charRetazec[i] = (char) (n + 'a');			
		}
		String vysledkok = new String(charRetazec);
		return vysledkok;
	}

}
