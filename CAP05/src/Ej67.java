public class Ej67 {
    public static void pintaEscalera(int escalones, int altura){
        for(int escalon = 1; escalon<=escalones; escalon++){
            for(int i=1; i<=altura; i++){
                for(int j=1; j<=escalon;j++)
                    System.out.print("****");
                System.out.println();
            }
        }
    } 
    public static void main(String[] args) {
        System.out.print("Introduzca el número de escalones: ");
        int escalones = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la altura de cada escalón: ");
        int altura = Integer.parseInt((System.console().readLine()));
        pintaEscalera(escalones, altura);
    }
}
