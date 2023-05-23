import java.io.*;
import java.util.*;

class IOFile{
    public static void main (String[] args) {
		IOFile programa = new IOFile();
        String paraules_partides = "paraules-partides.txt";
        Words[] w = new Words[10];
		programa.llegirFitxer(paraules_partides, w);
        programa.escriureFitxer("escriu_paraules.txt", w);
	}

    public void llegirFitxer(String paraules_partides, Words[] w){
        //Llegir lo que hi ha en el fixer i imprimir-ho.
        try{
            File file = new File(paraules_partides);
            Scanner lector = new Scanner(file);

            int contador = 0;
			//Si s'executa aquesta instrucció, s'ha obert el fitxer
			while(lector.hasNextLine() && contador < w.length) {
                //GUARDAR LA LINEA EN UNA VARIABLE Y IMPRIMIRLA
                String linea = (lector.nextLine());
                //Creem un objecte word a partir de la linea llegida
                //Guardem l'objecte en el array
                w[contador] = new Words(linea);
                System.out.println(w[contador]);
                contador++;
		    }
		//Cal tancar el fitxer
		lector.close();} 

        catch (Exception e) {
        //Excepció!
        System.out.println("Error: " + e);
        }
    }
    
        /*Lo que fa escriure sera entrada una candena de text amb el nom del fitxer, y sortida un array de objectes guarda tot el array en un fitxer */ 
    public void escriureFitxer(String paraules_partides, Words[] w) {
        try{
            FileWriter filewWriter = new FileWriter(paraules_partides);

            for(int i = 0; i < w.length; i++){
                if (w[i] != null) {
                filewWriter.write(w[i].toString() + "\n");
                }
            }
            filewWriter.close();
            
        }catch (Exception e) {
            //Excepció!
            System.out.println("Error: " + e);
            }
    }
}
