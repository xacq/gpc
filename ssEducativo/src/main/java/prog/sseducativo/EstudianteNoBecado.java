
package prog.sseducativo;

public final class EstudianteNoBecado extends Estudiante{
    //ATRIBUTOS
    float remuneracion;
    
    //CONSTRUCTOR    
    public EstudianteNoBecado(String nombre, String cedula, String genero) {
        super(nombre, cedula, genero);
        this.remuneracion = calcularBeca();
    }
   
    //SETTERS Y GETTERS
    public float getRemuneracion() {
        return remuneracion;
    }
    public void setRemuneracion(float remuneracion) {
        this.remuneracion = remuneracion;
    }
    //METODO     
    @Override
        public String toString () {
            return super.toString().
                    concat("Remuneración: ").concat(String.valueOf(this.remuneracion));
        }
    //METODO ABSTRACTO
    @Override
    public float calcularBeca() {
       return 0;
    }
    
}
