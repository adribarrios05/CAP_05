import java.util.Scanner;

public class Ej28 {
    public static Scanner sc = null;

    public static void iniciar(){
        sc = new Scanner(System.in);
    }
    public static void finalizar(){
        sc.close();
    }
    public static long fact(int valor){
        long fact = 1;
        for (int i=1;i <= valor;i++)
            fact*=i;
        return fact;
        
    }
    public static void main(String[] args) {
        iniciar();
        System.out.print("Introduzca el número a factorializar: ");
        int a = sc.nextInt();
        long fact = fact(a);
        System.out.println("El factorial de "+a+" es "+fact);
        finalizar();
    }
}