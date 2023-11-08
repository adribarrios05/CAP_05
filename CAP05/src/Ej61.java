public class Ej61 {
    public static void piramide(int altura){
        for(int i=altura;i>=1;i--){
            for(int j=1;j<=(altura-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("***");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        System.out.print("Introduce la altura de la V: ");
        int altura = Integer.parseInt(System.console().readLine());
        piramide(altura);
    }
}
