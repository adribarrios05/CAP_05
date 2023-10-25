public class Ej6 {
    public static void main(String[] args) {
        int intervaloMax = 320;
        int intervaloMin = 160;
        int salto = 20;
        int i = intervaloMax;
        do {
            System.out.println(i);
            i-=salto;
        } while (i >= intervaloMin);
    }
}
