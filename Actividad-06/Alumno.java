public class Alumno {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String carrera;
    private String numeroCuenta;

    public Alumno() {
    }

    public Alumno(String nombre, String apellidoPaterno, String apellidoMaterno, String carrera, String numeroCuenta) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.carrera = carrera;
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "Carrera: " + carrera + " nombre: " + nombre + " " + apellidoPaterno + " " + apellidoMaterno + " Numero de cuenta: " + numeroCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
}
