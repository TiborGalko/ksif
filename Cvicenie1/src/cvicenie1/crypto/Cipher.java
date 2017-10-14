package cvicenie1.crypto;

public interface Cipher {		
	public String sifrovanie(Key kluc, String retazec);
	public String desifrovanie(Key kluc, String retazec);

}
