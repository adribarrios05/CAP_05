public class Ej20 {
    public static void piramide(int altura, String caracter, boolean inversa){
        int direccion = (inversa)?-1:1;
        int primera = (inversa)?altura:1;
        int ultima = (inversa)?1:altura;
        for(int i=primera;inversa?i>=ultima:i<=ultima;i=i+direccion){
            for(int j=1;j<=(altura-i);j++){
                System.out.print(" ");
            }
            System.out.print(caracter);
            if (i>1){
                for(int j=1;j<=(2*i-1);j++){
                    System.out.print("");
                }
                System.out.print(caracter);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        System.out.println("Este programa dibuja una pirámide");
        System.out.print("Introduce la altura de la pirámide: ");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el carácter de relleno: ");
        String caracter = ""+System.console().readLine().charAt(0);
        piramide(altura, caracter, false);
    }
}
