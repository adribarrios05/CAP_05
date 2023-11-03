public class Ej36 {
    public static long solicitaValor(String question, String error){
        boolean validado = false;
        long valor = 0;
        while(!validado){
            try {
                System.out.print(question);
                valor = Long.parseLong(System.console().readLine());
                validado = true;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        return valor;
    } 
    public static long voltea (long valor){
        long alreves = 0;
        boolean salida = false;
        while(!salida){
            int digito = (int)valor%10;
            System.out.print(digito);
            if(valor<10)
                salida = true;
            else
                valor = valor/10;
        }
        return alreves;
    }   
    public static void main(String[] args) {
        boolean validado = false;
        long valor = 0;
        while(!validado){
            valor = solicitaValor("Por favor, introduzca un número entero positivo: ", "Error");
            if(valor < 0)
                System.out.println("Error");
            else
                validado = true;
        }
        System.out.printf("El %d %s", valor, valor==voltea(valor)?"es capicúa":"no es capicúa");
    }
}
