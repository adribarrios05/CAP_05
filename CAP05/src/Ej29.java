public class Ej29 {
    public static void main(String[] args) {
        System.out.println("Este programa escribe los números positivos menores a uno introducido y que no sea divisor de ese mismo número");
        System.out.print("Introduzca un número: ");
        int a = Integer.parseInt(System.console().readLine());
        for (int i = 1;i<=a;i++){
            if (a % i !=0)
            System.out.print(i+" ");

        }
    }
}
