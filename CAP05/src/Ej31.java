public class Ej31 {
    public static void main(String[] args) {
        System.out.println("Este programa pinta una L con la altura deseada");
        System.out.print("Introduce la altura: ");
        int altura = Integer.parseInt(System.console().readLine());
        for(int i = 1; i<=altura;i++){
            if(i<altura)
                System.out.println("*");
            else{
                for (int j=1;j<=(altura/2)+1;j++){
                    System.out.print("* ");
                }
            }
        }
    }
}
