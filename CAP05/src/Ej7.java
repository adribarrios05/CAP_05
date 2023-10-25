import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String secreto = "1234";
        boolean acierto = false;
        int intentos = 1;
        do {
            System.out.println("Introduzca la clave de la caja");
            acierto = sc.nextLine().equals(secreto);
            if(!acierto) {
                System.out.println("Clave incorrecta");
            }
        } while (!acierto && intentos<=4);
        if(acierto)
            System.out.println("Ha abierto la caja fuerte"); 
        else
            System.out.println("Lo siento, ha agotado las 4 oportnidades.");
sc.close();
    
    }
}
