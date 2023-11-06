public class Ej30 {
    public static String solicitarDia(){
        System.out.print("Día: ");
                String diaIni = System.console().readLine();
                diaIni = diaIni.toLowerCase(); 
                System.out.print("Hora: ");
                int horaIni = Integer.parseInt(System.console().readLine());
                switch (diaIni) {
                        break;
                    case "martes":
                        
                        break;
                    case "miercoles":

                        break;
                    case "miércoles":

                        break;
                    case "jueves":
                        
                        break;
                    case "viernes":
                        
                        break;
                    case "sábado":
                        
                        break;
                    case "sabado":
                        
                        break;
                    case "domingo":
                        
                        break;
                    default:
                    break;
                }
                return "a";
    }
    public static int solicitarHora(){

    }
    public static int convertirDiaANumero(String dia){
        switch (dia) {
            case "lunes":
            return 1;
            case "martes":
            return 2;
            case "miercoles":
            return 3;
            case "miércoles":
            return 3;
            case "jueves":
            return 4;
            case "viernes":
            return 5;
            case "sábado":
            return 6;
            case "sabado":
            return 6;
            case "domingo":
            return 7;
            default:
            return 0;
        }
    }
    public static void main(String[] args) {
        boolean validado = false;
        System.out.println("Por favor, introduzca la primera hora");
        String diaIni = solicitarDia();
        int horaIni = solicitarHora();
                if(horaIni<0||horaIni>23)
                    System.out.print("Por favor, introduzca una hora correcta");
                else   
                    validado = true;
            if(!validado)
                System.out.println("Por favor, introduzca una hora correcta");
        }   
        
    }
    
