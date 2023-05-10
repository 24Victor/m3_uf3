import java.util.*;
public class WApp{
    public static void main(String[]args){
        
        int opcio = 0;
        Words[] llistaParaules = new Words();
        do {
            String[] menuInicial = {"jugar", "gestionar"};
            opcio = opcionsMenu(menuInicial);
            int decisio = sc.nextInt();

            switch(opcio){
                case 1:
                    wordGame();
                    llegirFitxer("paraules-partides.txt", Words)
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

    }
     /*Modificar una parella de paraules del registre deaules-partides. Ens
     demanarà la paraula en català o en anglès. Comp
     rovarà si té informació associada, i en cas que en tingui, ens demanarà confirmació per a fer la modificació i esborrar el contingut associa */    }

   public static void modificar() {
   
        /*Demanar paraula en angles o en catala */
        String paraula = demanarParaula();

        int linia = 0;
        linia = buscar(paraula);        boolean existeix = comprovaInfoAssiciada(paraula);


        if(existeix){
            
            int u =  opcionsMenu({"segur .... S/N"});
            if( u == 1){
                modificaLinea(paraula, linea);
            }

        }
        else{

        }
    }

    public static void (esborrar){
        
    }