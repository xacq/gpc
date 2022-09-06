
package prog.sseducativo;

public final class EstudianteBecadoParcial extends Estudiante{

    //ATRIBUTOS
    private float remuneracion;
    private String profesor;
    private String materia;
    private int cargaHoraria;
    
    //CONSTRUCTOR    
    public EstudianteBecadoParcial(String nombre, String cedula, String genero, String profesor, String materia, int horas) {
        super(nombre, cedula, genero);
        this.profesor = profesor;
        this.materia = materia;
        this.cargaHoraria = horas;
        this.remuneracion = calcularBeca(); 
    }
    
    //SETTERS Y GETTERS
    public float getRemuneracion() {
        return remuneracion;
    }

    public String getProfesor() {
        return profesor;
    }

    public String getMateria() {
        return materia;
    }
    public void setRemuneracion(float remuneracion) {
        this.remuneracion = remuneracion;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    //METODO 
    @Override
    public String toString () {
        return super.toString()
                .concat ("Colabora con el PROFESOR: ").concat (this.profesor)
                .concat("\nTrabaja en la MATERIA de: ").concat(this.materia)
                .concat("\nCarga de horas SEMANAL: ").concat(String.valueOf(this.cargaHoraria))
                .concat("\nRemuneracion SEMANAL: ").concat(String.valueOf(this.remuneracion)); 
    }
//METODO ABSTRACTO
    @Override
    public float calcularBeca (){
        return (float) (2.66*this.cargaHoraria);
    }   
}


