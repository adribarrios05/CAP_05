public class Ej37 {
    public static int voltea (int valor){
        int alreves = 0;
        boolean salida = false;
        while(!salida){
            int digito = valor%10;
            alreves = alreves*10+digito;
            if(valor<10)
                salida = true;
            else
                valor = valor/10;
        }
        return alreves;
    }
    public static int solicitaValor(String question, String error){
        boolean validado = false;
        int valor = 0;
        while(!validado){
            try {
                System.out.print(question);
                valor = Integer.parseInt(System.console().readLine());
                validado = true;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        return valor;
    }
    public static void main(String[] args) {
        boolean validado = false;
        int valor = voltea(solicitaValor("Introduce un número: ", "Error"));
        int digito = 0;
        while (!validado){
            if(valor<0)
                System.out.print("Error");
            else
                validado = true;
                boolean salida = false;
        while(!salida) {
            if(valor>=0){
                digito=valor%10;
                for(int i=1;i<=digito;i++){
                    digito = valor%10;
                    valor = valor/10;
                    for(int j=1;j<=digito;j++){
                        System.out.print("|");
                    }
                    if (i <= digito && valor>0) {
                        System.out.print("-");
                    }
                }
                
            } 
            else
                salida = true;
        }
        }
    }
}
