public class Ej12 {
    public static void main(String[] args) {
        System.out.println("Este programa muestra los n primeros números de la serie de Fibonacci");
        System.out.print("Por favor, introduzca n: ");
        long valores = Integer.parseInt(System.console().readLine());
        System.out.print("0 1 ");
        long n1 = 0;
        long n2 = 1;
        for(int i = 1; i<=valores;i++){
            System.out.print((n1+n2)+" ");
            long aux = n1;
            n1 = n2;
            n2 = aux+n2;
        };
    }
}
