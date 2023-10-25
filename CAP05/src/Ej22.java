public class Ej22 {
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
        System.out.println("Este programa calcula todos los primos entre el 2 y el 100");
        for(int a=2;a<=100;a++){
            if(esPrimo(a)){
                System.out.println(a+" es primo");
            }
        }

    }
}
