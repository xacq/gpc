
package prog.espe;

public class videoJuego{
    
    //Atributos de la clase
    String título;
    int horasEstimadas;
    Boolean entregado;
    String género;
    String companía;
    
    //CONSTRUCTOR POR DEFECTO
    videoJuego(){
    this.título = "DESCONOCIDO";
    this.horasEstimadas = 1000;
    this.entregado = isEntregado();
    this.género = "DESCONOCIDO";
    this.companía = "DESCONOCIDO";
    }
    
    //CONSTRUCTOR SECUNDARIO
    videoJuego(String titulo, int horasEstimadas){
    this.título = titulo;
    this.horasEstimadas = horasEstimadas;
    this.entregado = isEntregado();
    this.género = "";
    this.companía = "";
    }
    
    //CONSTRUCTOR SECUNDARIO
    videoJuego(String titulo, int horasEstimadas, String genero, String compania){
    this.título = titulo;
    this.horasEstimadas = horasEstimadas;
    this.entregado = isEntregado();
    this.género = genero;
    this.companía = compania;
    }
    
    //METODOS GET

    public String getTítulo() {
        return título;
    }
    public int getHorasEstimadas() {
        return horasEstimadas;
    }
    public String getGénero() {
        return género;
    }
    public String getCompanía() {
        return companía;
    }
    
    //METODOS SET

    public void setTítulo(String título) {
        this.título = título;
    }
    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }
    public void setGénero(String género) {
        this.género = género;
    }
    public void setCompanía(String companía) {
        this.companía = companía;
    }
    
    //METODOS DE LA CLASE
    public Boolean entrega(){
        return this.entregado = true;
    }
    
    public Boolean devolver (){
        return this.entregado = false;
    }
            
    private Boolean isEntregado(){
        return this.entregado = false;
    }

    public boolean compareTo(int horasJuegob){
        return this.horasEstimadas > horasJuegob; 
    }
    
    @Override
    public String toString() {
        return "JUEGO:" + this.título + "\nHoras Estimadas: " + this.horasEstimadas + "\nEntregado: " +
                this.entregado + "\nGenero: " + this.género + "\nNombre de la Compania: " + this.companía;
    }    
}