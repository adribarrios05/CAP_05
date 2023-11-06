public class Ej53 {
    public static void main(String[] args) {
        System.out.print("Introduce la altura del triágulo: ");
        int altura = Integer.parseInt(System.console().readLine());
        for(int i=1;i<=altura;i++){
            for(int j=altura;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
