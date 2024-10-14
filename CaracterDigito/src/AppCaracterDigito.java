
public class AppCaracterDigito {
    public static void main(String[] args) throws Exception {
        System.out.print("Introduzca el caracter: ");
		char car = (char)System.in.read();
		//if(Character.isDigit(car)) {
		if(car >= '0' && car <= '9') {
			System.out.println("Es nu numero");
		} else {
			System.out.println("No es un numero");
		}
    }
}
