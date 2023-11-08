public class Ej51 {
    public static void main(String[] args) {
    System.out.print("Introduzca un número entero (mayor que nueve): ");
    int numero = Integer.parseInt(System.console().readLine());
    int vuelta = 0;
    boolean numeroComido = false;

    while (numero > 0) {
        if ((numero % 10 != 0) && (numero % 10 != 8)) {
        vuelta = (vuelta * 10) + (numero % 10);
        } else {
        numeroComido = true;
        }
        numero /= 10;
    }


    numero = vuelta;
    vuelta = 0;

    while (numero > 0) {
        vuelta = (vuelta * 10) + (numero % 10);
        numero /= 10;
    }

    if (numeroComido) {
        System.out.println("Después de haber sido comido por el gusano numérico el número se queda en "+vuelta);
    } else {
        System.out.println("El gusano numérico no se ha comido ningún dígito.");
        }
    }
}
