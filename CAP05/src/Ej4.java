public class Ej4 {
    public static void main(String[] args) {
        int intervaloMax = 320;
        int intervaloMin = 160;
        int salto = 20;
        for(int i = intervaloMax; i >= intervaloMin; i--)
            if(i%salto == 0)
                System.out.println(i);
    }
}
