public class Ej32 {
    public static int longitud(int valor){
        int retorno = 0;
        boolean salida = false;
        while(!salida){
            retorno++;
            if(valor<10)
                salida = true;
            else
                valor = valor/10;
        }
        return retorno;
    }
    public static void imprimePares(int valor){
        boolean salida = false;
        int numerosPares = 0;
        while(!salida){
            int actual = valor*10;
            if (actual%2==0)
                System.out.print(actual+" ");
            numerosPares++;
            if(valor<10)
                salida = true;
            else
                valor = valor*10;
        }
    }
    
    public static void main(String[] args) {
        System.out.print("introduzca un número entero: ");
        int valor = Integer.parseInt(System.console().readLine());
        imprimePares(valor);
        longitud(valor);
    }
}