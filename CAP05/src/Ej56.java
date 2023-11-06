public class Ej56 {
        public static void main(String[] args) {
            System.out.print("Introduce la altura del triágulo: ");
            int altura = Integer.parseInt(System.console().readLine());
            for(int i=1;i<=altura;i++){
                for(int j=1;j<=altura-i+1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }