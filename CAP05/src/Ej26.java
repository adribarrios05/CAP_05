public class Ej26 {
    public static void imprimePosiciones(int valor, int digito){
        boolean salida = false;
        int posicion = 1;
        while(!salida){
            int actual = valor%10;
            if (actual == digito)
                System.out.print(posicion+" ");
            posicion++;
            if(valor<10)
                salida = true;
            else
                valor = valor/10;
        }
    }
    public static int voltea (int valor){
        int alreves = 0;
        boolean salida = false;
        while(!salida){
            int digito = valor%10;
            System.out.print(digito);
            if(valor<10)
                salida = true;
            else
                valor = valor/10;
        }
        return alreves;
    }
    public static void main(String[] args) {
        System.out.print("introduzca un número entero: ");
        int valor = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce un dígito: ");
        int digito = Integer.parseInt(System.console().readLine());
        System.out.printf("Contando de izquierda a derecha, el "+digito+" aparece");
        System.out.print("en las posiciones :");
        imprimePosiciones(valor, digito);

    }
}
