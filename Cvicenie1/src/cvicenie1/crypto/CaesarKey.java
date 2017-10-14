package cvicenie1.crypto;

public class CaesarKey implements Key {
	public int posun;
	public char[] abeceda;	
	
	public CaesarKey(int posun) {
		this.posun = posun;
	}
}
