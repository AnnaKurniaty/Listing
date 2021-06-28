import java.util.Scanner;
public class Factorials{
	public static void main(String[] args){
		String keepGoing = "y";
		Scanner scan = new Scanner(System.in);
		while (keepGoing.equals("y") || keepGoing.equals("Y")){
			try {
				System.out.print("Enter an integer: ");
				int val = scan.nextInt();
				System.out.println("Factorial(" + val + ") = "+ MathUtils.factorial(val));
				System.out.print("Another factorial? (y/n) ");
				keepGoing = scan.next();
			}catch(Exception e){
				System.out.println("Bilangan negatif tidak memiliki nilai faktorial");
				System.out.println("Maksimal faktorial yang bisa direpresentasikan oleh type integer adalah 16!");
				System.out.println("Silahkan input angka dengan benar!!");
			}
		}
		scan.close();
	}
}