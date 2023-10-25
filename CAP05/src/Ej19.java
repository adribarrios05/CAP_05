public class Ej19 {
    public static void main(String[] args) {
        System.out.println("Este programa dibuja una pirámide");
        System.out.print("Introduce la altura de la pirámide");
        int altura = Integer.parseInt(System.console().readLine());
        int base = 1;
        for(int i=1;i<=altura;i++){
            System.out.println();
        }
    }
}
