public class MathUtils {
	public static int factorial(int n){
		if(n < 0 || n > 16) {
			throw new IllegalArgumentException("Bilangan negatif tidak memiliki nilai faktorial");
		}else {
			int fac = 1;
			for (int i=n; i>0; i--)
				fac *= i;
			return fac;
		}
	}
}
