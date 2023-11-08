public class Ej20 {
    public static void piramide(int altura, boolean inversa){
        int direccion = (inversa)?-1:1;
        int primera = (inversa)?altura:1;
        int ultima = (inversa)?1:altura;
        for(int i=primera;inversa?i>=ultima:i<=ultima;i=i+direccion){
            for(int j=1;j<=(altura-i);j++){
                System.out.print(" ");
            }
            System.out.print("^");
            String relleno = (i==ultima)?("^"):(" ");
            if (i>1){
                for(int j=2;j<=(2*i-1)-1;j++){
                    System.out.print(relleno);
                }
                System.out.print("^");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        System.out.println("Este programa dibuja una pirámide");
        System.out.print("Introduce la altura de la pirámide: ");
        int altura = Integer.parseInt(System.console().readLine());
        piramide(altura, false);
    }
}
