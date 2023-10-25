public class Ej10 {
    public static void main(String[] args) {
        boolean salir = false;
        System.out.println("Vaya introduciendo números:");
        float num = 0f;
        float suma = 0f;
        int valores = 0;
        while(!salir){
            try {
                num = Float.parseFloat(System.console().readLine());
                if(num<0)
                    salir = true;
                else {
                    valores++;
                    suma += num;
                }
            } catch (Exception e) {
                System.out.println("Lo siento, no te he entendido. Pruebe otra vez");
            }
            
            
        }
        System.out.printf("La media de los números positivos introducidos es %.2f", suma/valores);
    }
}
