public class Ej32 {
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
    public static String imprimePares(long valor){
        String res="";
        boolean salida = false;
        while(!salida){
            int digito = (int)(valor%10);
            if(digito%2 == 0){
                res+=digito+" ";
                valor = valor/10;
            }
            else
                valor = valor/10;
            if (valor==0)
                salida = true;
            }
        return res;
        }
    public static long solicitaValor(){
        boolean validado = false;
        long valor = 0;
        while(!validado){
            try {
                System.out.print("Por favor, introduzca un número entero: ");
                valor = Integer.parseInt(System.console().readLine());
                validado = true;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        return valor;
    }
    public static int sumarPares(long valor){
        int res=0;
        boolean salida = false;
        while(!salida){
            int digito = (int)(valor%10);
            if(digito%2 == 0){
                res+=digito;
                valor = valor/10;
            }
            else
                valor = valor/10;
            if (valor==0)
                salida = true;
            }
        return res;
        }
    public static void main(String[] args) {
        long valor = solicitaValor();
        valor = voltea(valor);
        System.out.printf("Digitos pares: %s%n", imprimePares(valor));
        System.out.printf("Suma de los dígitos pares: %d", sumarPares(valor));
    }
}