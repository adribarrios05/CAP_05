public class Ej65 {
    public static void imprimirA(int altura, int fila){
        for(int i=1;i<=altura;i++){
            String hueco = (i==fila)?"*":" ";
            for(int j=1; j<=altura-i;j++)
                System.out.print(" ");
            System.out.print("*");
            for(int j=1; j<=2*i-3;j++)
                System.out.print(hueco);
            if(fila!=1 && i!=1)
                System.out.print("*");
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la A (un número mayor que 3)");
        int altura = Integer.parseInt(System.console().readLine());
        if(altura>=3){
            System.out.print("Introduce la fila del palito horizontal (entre 2 y "+(altura-1)+")");
            int fila = Integer.parseInt((System.console().readLine()));
            if(fila>=2 && fila<altura)
                imprimirA(altura,fila);
            else
                System.out.print("Zona del palito no válida");
        } else{
            System.out.print("Altura introducida no válida");
        }
    }
}
