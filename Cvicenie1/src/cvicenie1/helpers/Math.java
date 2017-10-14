package cvicenie1.helpers;

public class Math {
	public static boolean isPrime(int input) {		
		if(input == 1) {
			return false;
		}
		for(int i = 2; i <= java.lang.Math.sqrt(input); i++) {
			if((input % i) == 0 && input != i) {
				return false;
			}
		}
		return true;
	}

}
