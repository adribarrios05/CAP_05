public class Ej27 {
    public static void main(String[] args) {
        System.out.println("Este programa calcula los múltiplos de tres entre el uno y cualquier número, los cuenta y los suma");
        System.out.print("Introduce un número: ");
        int numero = Integer.parseInt(System.console().readLine());
        int contador = 0;
        int suma = 0;
        for(int i = 1; i<=numero;i++){
            if (i%3==0){
                System.out.print(i+" ");
                contador++;
                suma+=i;
            }
        }
        System.out.println("");
        System.out.printf("Entre el 1 y el %d hay %d números múltiplos de 3, y la suma de todos da %d", numero, contador, suma);
    }
}
