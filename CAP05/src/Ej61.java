public class Ej61 {
    public static void escribirV(int altura){
        if (altura%2==0) 
            System.out.println("La altura debe ser impar");
        else{
            for(int i=altura;i>=1;i--){
                String relleno = (i==1)?("*****"):(i==altura+1)?("***"):(" ");
                for(int j=1;j<=(altura-i);j++){
                    System.out.print(" ");
                }
                if (i>1) {
                    System.out.print("***");
                }
                
                if (i>1){
                    for(int j=2;j<=2*i-2;j++){
                        System.out.print(relleno);
                    }
                    System.out.print("***");
                }
                else if (i==1)
                    System.out.print("*****");
                System.out.println("");
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Introduce la altura de la V: ");
        int altura = Integer.parseInt(System.console().readLine());
        escribirV(altura);
    }
}
