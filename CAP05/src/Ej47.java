public class Ej47 {
    public static void imprimirRectangulo(int base, int altura){
        for(int i=1; i<=altura;i++){
            System.out.print("M");
            String caracter = (i==1 || i==(altura/2+1) || i==altura)?"M":" ";
            for(int j =1; j<=base-2;j++){
                System.out.print(caracter);
            }
            System.out.println("M");
        }
    }
    public static void main(String[] args) {
        System.out.print("Introduce la base del rectángulo: ");
        int base = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce la altura del rectángulo: ");
        int altura = Integer.parseInt(System.console().readLine());
        imprimirRectangulo(base, altura);
    }
}
