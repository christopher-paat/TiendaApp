/* 
Errores corregidos:
- Nomenclatura: Nombre de la clase cambiado de "cliente" a PascalCase "Cliente".
- Nomenclatura de atributos: "Edad" y "Vip" corregidos a camelCase ("edad", "vip").
- Selección de tipo de dato: 
   - "edad" cambió de String a int.
   - "vip" cambió de char ('S'/'N') a boolean.
- Encapsulamiento: Atributos cambiados de public a private; se agregaron constructor y métodos de acceso (getters/setters).
- Variables sin uso: Se eliminó el atributo "telefono" ya que nunca se utilizaba en el sistema.
*/

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
