public class Ej60_2 {
    public static void main(String[] args) {
        System.out.print("Introduce la altura del calcetín: ");
        int altura = Integer.parseInt(System.console().readLine());
        for(int i=1;i<=altura-2;i++)
            System.out.println("***     ***");
        System.out.println("******  ******\n******  ******");
    }   
}



