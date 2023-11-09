public class Ej66 {
    public static void imprimeSenial(int altura){
        int i = 0;
        boolean segunda = false;
        while(i>=0){
            for(int j=1; j<=i;j++)
                System.out.print(" ");
            System.out.println("*    *");
            if(!segunda && i<(altura/2))
                i++;
            else{
            segunda = true;
                i--;
            }
        }
        
    }
    public static void main(String[] args) {
        System.out.print("Introduce la altura de la figura: ");
        int altura = Integer.parseInt(System.console().readLine());
        if(altura%2!=0 && altura>=3)
            imprimeSenial(altura);
    }
}
