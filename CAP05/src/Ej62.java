public class Ej62 {
    public static boolean chequeaSuerte(long valor){
        int buena = 0;
        int mala = 0;
        while(valor!=0){
            switch ((int)valor%10) {
                case 3,7,8,9:
                    buena++;
                    break;
                default:
                    mala++;
                    break;
            }
            valor/=10;
        }
        return buena>mala;
    }
    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        long valor = Long.parseLong(System.console().readLine());
        boolean afortunado = chequeaSuerte(valor);
        System.out.printf("El %d %ses un número afortudano.",valor,afortunado?"":"no ");
    }
}
