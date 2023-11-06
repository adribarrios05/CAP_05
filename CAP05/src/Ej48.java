public class Ej48 {
    public static boolean aparece(int digito, long valor){
        boolean esta = false;
        while(valor!=0 && !esta){
            if(valor%10 == digito)
                esta = true;
            valor/=10;
        }
        return esta;
    }
    public static void main(String[] args) {
        System.out.print("Introduzca un número");
        long valor = Long.parseLong(System.console().readLine());
        System.out.print("Dígitos que aparecen en el número: ");
        for(int i = 0; i < 10;i++){
            if(aparece(i, valor))
                System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("Dígitos que aparecen en el número: ");
        for(int i = 0; i < 10;i++){
            if(!aparece(i, valor))
                System.out.print(i+" ");
        }
    }
}
