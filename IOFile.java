import java.io.File;
import java.util.Scanner;

class IOFile{
    public static void main (String[] args) {
		IOFile programa = new IOFile();
        String paraules_partides = "paraules-partides.txt";
		programa.llegirFitxer(paraules_partides);
	}
    
    public void llegirFitxer(String paraules_partides){
        //Llegir lo que hi ha en el fixer i imprimir-ho.
        try{
            File file = new File(paraules_partides);
            Scanner lector = new Scanner(file);
			//Si s'executa aquesta instrucció, s'ha obert el fitxer
			while(lector.hasNextLine()) {
				System.out.println(lector.nextLine());
		}
        
		//Cal tancar el fitxer
		lector.close();} 
        catch (Exception e) {

        //Excepció!
        System.out.println("Error: " + e);
        }
    }
}