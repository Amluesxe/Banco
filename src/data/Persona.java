package data;

public class Persona{
private String nombre;
private String apellido;
private String documento;
private String edad;
private String sexo;
private Dia fechaDeNacimiento;

    public Persona(String nombre, String apellido, String documento, String edad, String sexo, Dia fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.edad = edad;
        this.sexo = sexo;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Dia getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Dia fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

        
public Persona(){}
}
