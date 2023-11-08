public class Ej40 {
    public static void main(String[] args) {
        System.out.print("Introduce la altura del rombo: ");
        int altura = Integer.parseInt(System.console().readLine());
        for(int i = 1; i<=altura; i++){
            for(int j = 1; j<=altura; j++){
                if(i<=(altura/2+1) && (((j==(altura/2+1) - (i-1))) || (j==(altura/2+1) + (i-1))) || 
                    (i>(altura/2+1) && (((j==(altura/2+1) - (altura - i))) || (j==(altura/2+1) + (altura-i)))))
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
