public class Ej23 {
    public static void main(String[] args) {
        System.out.println("Este programa pide números hasta llegar a 10000, los suma y hace la media");
        System.out.println("Introduzca números");
        int suma = 0;
        int valores = 0;
        while(suma<10000){
            try {
                int valor = Integer.parseInt(System.console().readLine());
                suma+=valor;
                valores++;
            } catch (Exception e) {
                System.out.println("Error. Introduce un número válido");
            }
        }
        System.out.printf("ha introducido un total de %d números%n", valores);
        System.out.printf("La suma total es %d%n", suma);
        System.out.printf("La media es %f", (double)suma/valores);
    }
}