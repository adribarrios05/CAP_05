public class Ej17 {
    public static void main(String[] args) {
        System.out.println("Este programa suma los 100 números siguientes al introducido");
        System.out.print("Introduzca un número positivo: ");
        int a = Integer.parseInt(System.console().readLine());
        if (a>=0){
            for(int i=a;i<=a+100;i++){
                System.out.println(a+" + "+i+" = "+(a+i));
            }
        } else {
            System.out.println("Número incorrecto. Introduzca un número positivo");
        }

    }
}
