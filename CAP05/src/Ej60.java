public class Ej60 {
    public static void calcetines(int altura){
        for(int i=1;i<=altura-2;i++){
            for(int j=1;j<=3;j++)
                System.out.print("*");
            for(int j=1;j<=5;j++)
                System.out.print(" ");
            for(int j=1;j<=3;j++)
                System.out.print("*");
            System.out.println("");
        }
        for(int i=1;i<=2;i++){
            for(int j=1;j<=6;j++)
                System.out.print("*");
            for(int j=1;j<=2;j++)
                System.out.print(" ");
            for(int j=1;j<=6;j++)
                System.out.print("*");
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        System.out.print("Introduce la altura del calcetín: ");
        int altura = Integer.parseInt(System.console().readLine());
        calcetines(altura);
    }
}
