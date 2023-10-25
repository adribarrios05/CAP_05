public class Ej11 {
    public static int longitudDeUnNumero(long num){
        int longitud = 0;
        while(num/10!=0){
        num = num/10;
        longitud++;
    }
        return ++longitud;
    }
    public static void main(String[] args) {
        System.out.print("Introduzca un número: ");
        int num = Integer.parseInt(System.console().readLine());
        int longitudMayor = longitudDeUnNumero((long)Math.pow(num+4, 3));
        if(longitudMayor%2==0)
            longitudMayor+=1;
        System.out.printf("%"+(longitudMayor-2)/2+"s%s%"+(longitudMayor-2)/2+"s|%"+(longitudMayor-2)/2+"s%s%"+(longitudMayor-2)/2+"s|%",+(longitudMayor-2)/2+"s%s%n",
            "","n","","","n\u00b2","","","n\u00b3");
        for(int i =0; i<((longitudMayor+2)*3+2);i++)
            System.out.print("-");
        System.out.print("");
            for(int i = num; i<num+5; i++){
                System.out.printf("%"+(longitudMayor-1)+"d  |"+
                                  "%"+(longitudMayor-1)+"d  |"+
                                  "%"+(longitudMayor-1)+"d  %n", num,num*num,num*num*num);
            }
    } 
}
