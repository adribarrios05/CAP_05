public class Ej20 {
    public static void piramide(int altura, String caracter){
        for(int i=1;i<=altura;i++){
            for(int j=1;j<=(altura-i);j++){
                System.out.print(" ");
            }
                for(int j=1;j<=2*i-1;j++){
                    if(i+j!=altura+1 || i+j!=altura+1)
                        System.out.print(" ");
                    else
                        System.out.print(caracter);
                }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        System.out.println("Este programa dibuja una pirámide");
        System.out.print("Introduce la altura de la pirámide: ");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce un carácter: ");
        String caracter = System.console().readLine();
        piramide(altura, caracter);
    }
}
