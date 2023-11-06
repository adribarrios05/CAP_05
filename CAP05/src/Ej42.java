public class Ej42 {
    
    public static boolean esPrimo(int a){
            if(a<2)
                return false;
            boolean primo=true;
            for (int i=2; i<=a/2 && primo;i++){
                if(a%i==0)
                    primo = false;
            }
            return primo;
        }
        public static void imprimeSigPrimos(int valor, int n){
            for(int i=valor; i<valor+n;i++){
                System.out.printf("%d %s%n",i, (esPrimo(valor)?"es primo":"no es primo"));
            }
        }
    public static void main(String[] args) {
        System.out.print("Intoduce un número entero positivo: ");
        int valor = Integer.parseInt(System.console().readLine());
        imprimeSigPrimos(valor, 5);
    }
}
