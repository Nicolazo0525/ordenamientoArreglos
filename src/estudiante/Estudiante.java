package estudiante;
public class Estudiante {
    private String nombre;
    private String apellido;
    private String identificacion;
    private int puesto;
    private double nota;
    public Estudiante (String nombre, String apellido, String identificacion, int puesto, double nota){
        setNombre(nombre);
        setApellido(apellido);
        setIdentificacion(identificacion);
        setPuesto(puesto);
        setNota(nota);
    }
    public String imprimir(){
        return ""; 
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public int getPuesto() {
        return puesto;
    }

    public double getNota() {
        return nota;
    }
    
    
}
