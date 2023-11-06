public class Ej52 {
    public static long voltea (long valor){
        int alreves = 0;
        boolean salida = false;
        while(!salida){
            int digito = (int)valor%10;
            alreves = alreves*10+digito;
            if(valor<10)
                salida = true;
            else
                valor = valor/10;
        }
        return alreves;
    }
    public static long izqda(long valor){
        valor = voltea(valor);
        int contador = 1;
        long res = 0;
        while(valor!=0 && contador<=1){
            res = res*10+(valor%10);
            contador++;
            valor/=10;
        }
        return res;
    }
    public static long dcha(long valor){
        valor = valor*10+1;
        valor = voltea(valor);
        int contador = 0;
        long res = 0;
        while(valor!=0){
            if (contador>=1)
            res = res*10+(valor%10);
            contador++;
            valor/=10;
        }
        return res/10;
    }
    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        long valor = Long.parseLong(System.console().readLine());
        System.out.printf("El número resultante es %d%d", dcha(valor),izqda(valor));
    }
}
