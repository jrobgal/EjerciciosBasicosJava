import java.util.Scanner;

public class AppMeses {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el número del mes: ");
		int mes = sc.nextInt();
		if(mes < 1 || mes > 12) {
			System.out.print("Mes incorrecto");
		} else {
			switch (mes) {
				case 1:
					System.out.println("Enero");
					break;
				case 2:
					System.out.println("Febrero");
					break;
				case 3:
					System.out.println("Marzo");
					break;
				case 4:
					System.out.println("Abril");
					break;
				case 5:
				System.out.println("Mayo");
					break;
				case 6:
					System.out.println("Junio");
					break;
				case 7:
					System.out.println("Julio");
					break;
				case 8:
					System.out.println("Agosto");
					break;
				case 9:
					System.out.println("Septiembre");
					break;
				case 10:
					System.out.println("Octubre");
				break;
				case 11:
					System.out.println("Noviembre");
					break;
				case 12:
					System.out.println("Diciembre");
					break;
				default:
					break;
			}
			if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				System.out.println("Es un mes de 30 días");
			} else {
				if(mes == 2) {
					System.out.println("Es un mes de 28 días");
				} else {
					System.out.println("Es un mes de 31 días");
				}
			}
		}
	}
}