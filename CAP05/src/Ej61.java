public class Ej61 {
    public static void escribirV(int altura){
        if (altura<3) 
            System.out.println("La altura debe ser mayor o igual a 3");
        else{
            for(int i=altura;i>=1;i--){
                String relleno = (i==1)?("*****"):(i==altura+1)?("***"):(" ");
                for(int j=1;j<=(altura-i);j++){
                    System.out.print(" ");
                }
                if (i>1) {
                    System.out.print("***");
                    for(int j=2;j<=2*i-2;j++){
                        System.out.print(relleno);
                    }
                    System.out.print("***");
                } else if (i==1)
                    System.out.print("*****");
                System.out.println("");
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Introduce la altura de la V (mayor o igual que tres): ");
        int altura = Integer.parseInt(System.console().readLine());
        escribirV(altura);
    }
}
