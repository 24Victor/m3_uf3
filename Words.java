public class Words{
    //Atributs privats
    private String angles;
    private String catala;
    private int C_A;
    private int A_C;

    /**
     * @param w, La String w tindra separada per punts i comes una columna en paraula en català, 
     * paraula en angles, la traducció de C_A i la traducció de A_C. Si la columna A_C o C_A
     * conte el numero 0 voldra dir que no s'ha intentat mai, 1 que la ha acertat, i -1 que la 
     * ha fallat 1 vegada.
     */

    public Words(String w){
        /*1.Convertir w en un array de cadenes de text*/
        String[] fila = w.split(";"); 
        
        /*Guardar cada element del array en l'atribut corresponent*/ 
        this.angles = fila[0];
        this.catala = fila[1];
        this.C_A = Integer.parseInt(fila[2]);
        this.A_C = Integer.parseInt(fila[3]);   
    }
    
    /**
     * @param angles
     * @param catala
     * @param C_A
     * @param A_C
     */
    public Words(String angles, String catala, int C_A, int A_C) {
        this.angles = angles;
        this.catala = catala;
        this.C_A = C_A;
        this.A_C = A_C;
    }
    
    //Getters
    public String getAngles() {
        return this.angles;
    }

    public String getCatala() {
        return this.catala;
    }
    
    public int getC_A() {
        return this.C_A;
    }
    
    public int getA_C() {
        return this.A_C;
    }
    
    //Setters
    public void setAngles(String angles) {
        this.angles = angles;
    }

    public void setCatala(String catala) {
        this.catala = catala;
    }

    public void setC_A(int C_A) {
        this.C_A = C_A;
    }

    public void setA_C(int A_C) {
        this.A_C = A_C;
    }

    //Metodo to string
    public String toString() {
        return this.angles+ ";" + this.catala + ";" +C_A + ";" + A_C;
    }
}