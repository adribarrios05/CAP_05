import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcula los números que hay entre dos intoducidos de siete en siete");
        System.out.print("Introduce el primer número: ");
        int a = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int b = sc.nextInt();
        if (a<b){
            for(int i=a;i<=b-7;i+=7){
                System.out.print((i+7)+" ");
            }
        } else {
            for(int i=b;i<=a-7;i+=7){
                System.out.print((i+7)+" ");
            }
        }
        sc.close();
    }
}
