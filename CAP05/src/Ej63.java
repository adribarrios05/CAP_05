public class Ej63 {
    public static void doblePiramide(int fila, int altura){
        if(fila>0){
            for(int i=1; i<=altura-fila; i++)
                System.out.print(" ");
            for(int i=1; i<=(2*fila-1);i++)
                System.out.print("*");
            for(int i=1; i<=altura-fila;i++)
                System.out.print(" ");
            System.out.print(" ");
        }
        else{
            for(int i=1;i<=2*altura+1;i++)
                System.out.print(" ");
        }

    }
    public static void main(String[] args){
        int altura1 = 10;
        int altura2 = 7; 
        int diferencia = Math.abs(altura1-altura2);
        int inicio = -(diferencia)+1;
        int iteraciones = Math.max(altura1, altura2);
            for(int i=inicio; i<(inicio+iteraciones);i++){
                if(altura1>altura2){
                    doblePiramide(i+diferencia, altura1);
                    doblePiramide(i, altura2);
                }
                else if (altura1<altura2){
                    doblePiramide(i, altura1);
                }
                System.out.println("");
            }
    }
}
