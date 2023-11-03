public class Ej33 {
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
    public static void pintarU(int altura){
        for(int i=1; i<=altura; i++){
            System.out.println("* ");
            for(int j=1;j<=altura;j++){
                System.out.print(" ");
            }
            System.out.print("* ");
        }
    }
    public static void main(String[] args) {
        int altura = solicitaValor("Introduzca la altura", null);
    }
}
