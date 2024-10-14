import java.util.Scanner;

public class AppMayorDeTres {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el primer numero: ");
		int num1 = sc.nextInt();
		System.out.print("Introduzca el segundo numero: ");
		int num2 = sc.nextInt();
		System.out.print("Introduzca el tercer numero: ");
		int num3 = sc.nextInt();
		if(num1 > num2) {
			if(num1 > num3){
				System.out.print("El numero mayor es: " + num1);
			} else {
				System.out.print("El numero mayor es: " + num3);
			}
		} else {
			if(num2 > num3) {
				System.err.print("El numero mayor es: " + num2);
			} else {
				System.err.print("El numero mayor es: " + num3);
			}
		}
		
    }
}
