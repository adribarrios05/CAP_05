public class Ej17 {
    public static void main(String[] args) {
        System.out.println("Este programa suma los 100 números siguientes al introducido");
        System.out.print("Introduzca un número positivo: ");
        int a = Integer.parseInt(System.console().readLine());
        int suma = 0;
        if (a>=0){
            for(int i=a;i<=a+100;i++){
                suma+=i;
            }
        System.out.printf("La suma de los 100 números siguientes a %d es %d" ,a, suma);
        } else {
            System.out.println("Número incorrecto. Introduzca un número positivo");
        }

    }
}
