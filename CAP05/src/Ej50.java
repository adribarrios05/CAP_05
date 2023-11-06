public class Ej50 {
    public static void parte1(int espacios){
        String format = "*%"+espacios+"s****%"+espacios+"s****%n";
        System.out.printf(format," "," ");
    }
    public static void parte2(int espacios){
        String format = "*%"+espacios+"s*%"+(espacios+3)+"s*%n";
        System.out.printf(format," "," ");
    }
    public static void parte3(int espacios){
        String format = "*%"+(espacios+3)+"s*%"+(espacios+3)+"s*%n";
        System.out.printf(format," "," ");
    }
    public static void main(String[] args) {
        System.out.println("Introduce la altura (5 como mínimo)");
        int altura = Integer.parseInt(System.console().readLine());
        if(altura<5)
            System.out.print("La altura debe ser 5 como mínimo");
        else{
            System.out.print("Introduce el número de espacios");
            int espacios = Integer.parseInt(System.console().readLine());
            parte1(espacios);
            parte2(espacios);
            parte1(espacios);
            for(int i = 1; i<=altura; i++)
                parte3(espacios);
            parte1(espacios);
        }
    }
}
