import java.util.Scanner;
public class words{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int opcio = 0;
        do {
            System.out.println("============================");
            System.out.println("Benvingut al programa WORDS!");
            System.out.println("============================");
            System.out.println("Prem 1 per a jugar en catala o 2 per jugar en angles");
            System.out.println("Prem 3 per a mostrar el registre");
            System.out.println("Prem 4 per a sortir del programa");
            
            int decisio = sc.nextInt();

            switch(opcio){
                case 1:
                wordGame();    
                break;

                case 2:
                saveRegister();
                break;
                
                case 3:
                gestApp();
                break;
                
                case 4:
                // No fa res, el bucle se trenca i se surt del programa
                break;
            default:
                System.out.println("Opció inválida");
            }
        } while (opcio != 4);
    }

    public static void wordGame (){
        
    }
    
    public static void saveRegister(){

    }
    
    public static void gestApp(){
        
    }
}