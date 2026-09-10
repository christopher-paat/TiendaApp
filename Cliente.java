public class Cliente {
    private String nombreCliente;
    private int edad;
    private boolean vip;

    public Cliente (String nombreCliente, int edad, boolean vip) {
        this.nombreCliente = nombreCliente;
        setEdad(edad);
        this.vip = vip;
    }

    // Getters y Setters
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        this.edad = edad;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public void mostrarCliente() {
        System.out.println("Cliente: " + nombreCliente + " Edad: " + edad + " VIP: " + (vip ? "Sí" : "No"));
    }
}
