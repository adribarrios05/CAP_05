public class Ej25 {
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
        System.out.print("Introduzca un número entero: ");
        int valor = Integer.parseInt(System.console().readLine());
        System.out.printf("Si le damos la vuelta a %d tenemos el ",valor);
        voltea(valor);
    }
}
