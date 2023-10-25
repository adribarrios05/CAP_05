public class Ej1 {
    public static void main(String[] args) {
        int intervaloMin = 0;
        int intervaloMax = 100;
        int multiplos = 5;
        for(int i = intervaloMin; i<=intervaloMax; i++)
            if(i%multiplos == 0)
                System.out.println(i);
    }
}
