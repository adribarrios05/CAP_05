public class Ej69 {
    public static void pintaMaya(int altura){
        for(int i=1; i<=altura; i++){
            String relleno = (i%2==0)?"    ":"****";
            for(int j=1; j<=altura-i;j++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.print(relleno);
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("Introduce la altura de la pirámide maya: ");
        int altura = Integer.parseInt(System.console().readLine());
        pintaMaya(altura);
    }
}
