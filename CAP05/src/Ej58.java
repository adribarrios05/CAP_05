public class Ej58 {
    public static double separaDigitos(long valor){
        int digito = 0;
        int contador = 0;
        while(valor>=10){
            digito=digito+(int)valor%10;
            valor/=10;
            contador++;
        }
        double media = digito/contador;
        System.out.printf("Media: %.1f",media);
        return media;
    }
    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        long valor = Long.parseLong(System.console().readLine());
            separaDigitos(valor);
    }
}
