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
            for(int j=1;j<=altura;j++){
                if((i==altura || j==1 || j==altura) || (i!=altura && j!=1))
                    System.out.print("*");
                else if ((i==altura && j==1) || (i==altura && j==altura))
                    System.out.print(" ");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int altura = solicitaValor("Introduzca la altura", null);
        pintarU(altura);
    }
}
