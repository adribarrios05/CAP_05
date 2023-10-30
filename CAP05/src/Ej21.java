public class Ej21 {
    public static void main(String[] args) {
        System.out.println("Este programa te pide números hasta que introduzcas uno negativo");
        System.out.println("Introduce los números");
        int a = 0;
        int maxPares = Integer.MIN_VALUE;
        double suma = 0;
        int impares = 0;
        while(a>=0){
            try {
                a  =Integer.parseInt(System.console().readLine());
                if(a<0){
                    if(a%2==0 && a>maxPares)
                        maxPares = a;
                    if (a/2!=0){
                        suma+=a;
                        impares++;
                    }
                }
            } catch (Exception e) {
                System.out.println("Error. Introduce un número válido");
            }

        }
        System.out.printf("Ha introducido %d números positivos%n", suma);
        System.out.printf("La media de los impares es %.2f %n",impares);

    }
}
