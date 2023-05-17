import java.util.*;

public class WApp{
    public static void main(String[]args){
        
        int opcio = 0;
        Words[] llistaParaules = new Words();
        do {
            String[] menuInicial = {"Prem 1 per a jugar", "Prem 2 per a gestionar"};
            opcio = (menuInicial);
            int decisio = sc.nextInt();

            switch(opcio){
                case 1:
                    wordGame();
                    llegirFitxer(paraules_partides, Word [] w)
                break;
                
                case 2:
                    gestApp();
                break;
                
            default:
                System.out.println("\n Opció inválida");
            }
        } while (opcio != 2);
    }

    public static String gestApp(){
        int opcio = 0;
        String[] menuInicial = {"Afegir", "Modificar", "Esborrar", "Arxivar", "Consulta"};
            
        opcio = opcionsMenu(menuInicial);
        switch(opcio){
            case 1:
                afegir();
            break;

            case 2:
                modificar();
            break;
                
            case 3:
                esborrar();
            break;

            case 4:
                arxivar();
            break;
            
            case 5:
                consultar();
            break;  
        }
    }

    

	/*Afegir una parella de paraules al registre de paraules-partides. Ens demanarà la paraula en català i la
     paraula en anglès.*/
    public static void afegir(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix la paraula en català:");
        String paraulaCatala = sc.nextLine();
        System.out.println("Introdueix la paraula en anglès:");
        String paraulaAngles = sc.nextLine();
    }
     /*Modificar una parella de paraules del registre deaules-partides. Ens
     demanarà la paraula en català o en anglès. Comp
     rovarà si té informació associada, i en cas que en tingui, ens demanarà confirmació per a fer la modificació i esborrar el contingut associa */    }

   public static void modificar() {
   
        /*Demanar paraula en angles o en catala */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix la paraula en català o en anglès:");
        String paraula = sc.nextLine();
        
        int linia = 0;
        boolean existeix = comprovaInfoAssiciada(paraula);

        linia = buscar(paraula);       


        if(existeix){
            int opcio = opcionsMenu({"segur .... S/N"});
            if (opcio == 1) {
                modificaLinia(paraula, linia);
            }
        }
        else{
            System.out.println("La paraula no té informació associada.");

        }
    } 

    private static boolean comprovaInfoAssiciada(String paraula) {
	return false;
    }

	private static int buscar(String paraula) {
	
    }

	public static void esborrar(){
        
    }

    private static int opcionsMenu(String[] menuInicial) {
		
	}

	private static void consultar() {
	}

	private static void arxivar() {
	}


    
