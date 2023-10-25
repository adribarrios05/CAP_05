import java.util.Scanner;

public class Divisor {
    public static Scanner sc = null;
public static int escogeOpcion(){
    return Integer.parseInt(System.console().readLine());
    }
public static void menu(){
    System.out.println("1. Divisor");
    System.out.println("2. Múltiplo");
    System.out.println("3. Primo");
    System.out.println("4. n Primeros primos");

}

    /**
     * Comprueba si un número es divisor de otro
     * @param a El valor que tengo que comprobar si es divisor
     * @param b El valor que se supone es múltiplo del anterior
     * @return true si es divisor, false en caso contrario
     */
    public static boolean esDivisor(int a, int b){
        return (b % a)==0;
    }
    /**
     *  Comprueba si un número es múltiplo de otro
     * @param a El valor que tengo que comprobar si es múltiplo
     * @param b El valor que se supone es múltiplo del anterior
     * @return true si es múltiplo, false en caso contrario
     */
    public static boolean esMultiplo(int a, int b){
        return (a % b)==0;
    }

    public static boolean esPrimo(int a){
        if(a<2)
            return false;
        boolean primo=true;
        for (int i=2; i<=a/2 && primo;i++){
            if(esDivisor(i, a))
                primo = false;
        }
        return primo;
    }

    public static int nPrimerosPrimos(int a){
        for (int i=1;i<=a-1;i++){
            if(esPrimo(i))
            return i;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos números: ");
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        System.out.println("Escoge una opoción: ");
        menu();
        int opcion = escogeOpcion();
        switch (opcion) {
            case 1:
                if (esDivisor(a, b))
                    System.out.println(a+" es divisor de "+b);
                else { 
                    System.out.println(a+" no es divisor de "+b);
                }
            break;
            case 2:
                if (esMultiplo(a, b))
                    System.out.println(b+" es múltiplo de "+a);
                else
                    System.out.println(b+" no es múltiplo de "+a);
            break;
            case 3:
                if (esPrimo(a))
                    System.out.println(a+" es primo");
                else
                    System.out.println(a+" no es primo");
            break;
            case 4:
            int i = 0;
                int contador = 0;
                while(contador <= a){
                    if(esPrimo(i)){
                        contador++;
                        System.out.print(i+", ");
                    }
                i++;
                }
            break;
            default:
                System.out.println("Opción incorrecta");
        }
        sc.close();
    }
}