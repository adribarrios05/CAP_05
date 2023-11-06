public class Ej41 {
    public static int nPares(long valor){
        int contador = 0;
        while(valor!=0){
            if((valor%10)%2==0)
                contador++;
            valor/=10;
        }
        return contador;
    }
    public static int nImpares(long valor){
        int contador = 0;
        while(valor!=0){
            if((valor%10)%2!=0)
                contador++;
            valor/=10;
        }
        return contador;
    }
    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        long valor = Long.parseLong(System.console().readLine());
        System.out.printf("El número tiene %d dígitos pares y %d dígitos impares", nPares(valor), nImpares(valor));
    }
}
