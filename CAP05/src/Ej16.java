public class Ej16 {
    public static boolean esDivisor(int a, int b){
        return (b % a)==0;
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
    public static void main(String[] args) {
        System.out.println("Este programa calcula si un número es primo");
        System.out.print("Introduce un número: ");
        int a = Integer.parseInt(System.console().readLine());
        if (esPrimo(a))
                    System.out.println(a+" es primo");
                else
                    System.out.println(a+" no es primo");
    }
}
