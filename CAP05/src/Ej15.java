public class Ej15 {
    public static void main(String[] args) {
        System.out.println("Este programa calcula potencias");
        System.out.print("Introduce la base: ");
        int base = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce el exponente: ");
        int exp = Integer.parseInt(System.console().readLine());
        float resultado = 1f;
        if (exp >=0)
            for (int i=1;i < exp+1;i++){
                resultado*=base;
                System.out.println(base+" elevado a "+i+" es igual a "+resultado);
            }
        else if (exp <0){
            for (int i=0;i < -exp+1;i++){
                resultado*=base;
                resultado = 1/resultado;
                System.out.println(base+" elevado a "+i+" es igual a "+resultado);
            }
        }
    }
}
