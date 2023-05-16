import java.io.File;
import java.util.Scanner;

class IOFile{
    public static void main (String[] args) {
		IOFile programa = new IOFile();
        String paraules_partides = "paraules-partides.txt";
        Words[] w = new Words[10];
		programa.llegirFitxer(paraules_partides, w);
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
                Words word = new Words(linea);
                //Guardem l'objecte en el array
                w[contador] = word;
                contador++;

                //Imprimim el fitxer
				System.out.println(linea);
		}
        
		//Cal tancar el fitxer
		lector.close();} 
        catch (Exception e) {

        //Excepció!
        System.out.println("Error: " + e);
        }
    }
}