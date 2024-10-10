import java.util.Scanner;

public class AppParImpar {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.println("Introduzca numero entero: ");
		n = sc.nextInt();
		if(n % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
    }
}
