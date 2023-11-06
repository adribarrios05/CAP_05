public class Ej49 {
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
        boolean salir = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double media = 0;
        int contador = 0;
        System.out.println("Vaya introduciendo números: ");
        while (!salir) {
            int valor = Integer.parseInt(System.console().readLine());
            if(esPrimo(valor))
                salir = true;
            else {
                contador++;
                if (valor>max)
                    max = valor;
                if (valor<min)
                    min = valor;
                media+=valor;
            }
        }
        System.out.printf("Ha introducido %d números no primos%n", contador);
        System.out.printf("Máximo: %d%n", max);
        System.out.printf("Mínimo: %d%", min);
        System.out.printf("Media: %f%n", ((double)contador/media));
    }
}
