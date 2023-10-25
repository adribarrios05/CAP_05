public class Ej13 {
    public static void main(String[] args) {
        System.out.println("Introduce 10 números:");
        int positivos = 0;
        int negativos = 0;
        for (int i = 1; i <= 10; i++) {
                int numero = Integer.parseInt(System.console().readLine());
            if (numero < 0) 
                negativos++;
            else
                positivos++;
        }
        System.out.println("Ha introducido "+positivos+" números positivos y "+negativos+" negativos");
    }
}
