public class Ej35 {
    public static int solicitaValor(String question, String error){
        boolean validado = false;
        int valor = 0;
        while(!validado){
            try {
                System.out.print(question);
                valor = Integer.parseInt(System.console().readLine());
                validado = true;
            } catch (Exception e) {
                    System.out.print(error);
            }
        }
        return valor;
    }
    public static void imprimirX(int altura){
        for(int i=1; i <= altura; i++){
            for(int j = 1; j<=altura; j++)
                if(i==j || i+j==altura+1)
                    System.out.print("*");
                else    
                    System.out.print(" ");
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        boolean validado = false;
        int altura = 0;
        while(!validado){
        altura = solicitaValor("Por favor introduzca la altura de la X: ", "Por favor, introduzca un número correcto");
        if (altura%2==0 || altura<3) 
            System.out.println("Por favor, introduzca una altura mayor que 3 y que sea impar");
        else
            validado=true;
        }
        imprimirX(altura);
    }
}
