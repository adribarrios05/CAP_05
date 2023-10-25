public class Ej9 {
    public static long longitudDeUnNumero(long num){
        long longitud = 0;
        while(num/10!=0){
        num = num/10;
        longitud++;
    }
        return ++longitud;
    }
    public static void main(String[] args) {
        boolean correcto = false;
        long num = 0;
        while (!correcto){
            try {
            System.out.print("Introduzca un número entero y le diré cuantos dígitos tiene: ");
            num = Integer.parseInt(System.console().readLine());
            correcto = true;
            } catch (Exception e) {
            System.out.println("Lo siento, no le he entendido. pruebe otra vez.");
            }
        }
        System.out.printf("%d tiene %d dígito/s", num, longitudDeUnNumero(num));
    }
}
