
package prog.sseducativo;

public final class EstudianteBecadoCompleto extends Estudiante{

    //ATRIBUTOS
    private int cargaHoraria;
    private float remuneracion;
    private String carrera;
    //CONSTRUCTOR
    public EstudianteBecadoCompleto(String nombre, String cedula, String genero, String carrera) {
        super(nombre, cedula, genero);
        this.cargaHoraria = 40;
        this.remuneracion = calcularBeca();
        this.carrera = carrera;
        
    }
    //METODOS SETTER Y GETTER
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public float getSalario() {
        return remuneracion;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public void setSalario(float salario) {
        this.remuneracion = salario;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    //METODO 
    @Override
    public String toString () {
        return super.toString()
                .concat ("Colabora en la carrera de: ").concat (this.carrera)
                .concat("\nNúmero de horas SEMANAL: ").concat(String.valueOf(this.cargaHoraria))
                .concat("\nRemuneracion SEMANAL: ").concat(String.valueOf(this.remuneracion)); 
    }
    //METODO ABSTRACTO
    @Override
    public float calcularBeca() {
        return (float) 106.25;
    }
}
