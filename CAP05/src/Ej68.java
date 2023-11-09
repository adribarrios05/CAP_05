public class Ej68 {
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
    public static long disloca(long valor){
        valor=voltea(valor);
        long ret = 0;
        while(valor!=0){
            int digito = (int)valor%10;
            if(digito%2==0)
                digito++;
            else    
                digito--;
            ret = ret*10+digito;
            
        }
        return ret;
    }
    public static void main(String[] args) {
        System.out.print("Introduce un número");
        long valor = Long.parseLong(System.console().readLine());
        System.out.printf("Dislocando el %d es igual a %d", valor, disloca(valor));
    }
}
