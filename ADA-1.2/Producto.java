/*
Errores corregidos
- Nomenclatura de clase: "producto" a PascalCase "Producto".
- Nomenclatura de atributos: "Stock" y "Nombre_Producto" cambiados a camelCase ("stock", "nombreProducto").
- Atributo static incorrecto: "codigo" era static (compartido por todos los productos); se cambió a atributo de instancia.
- Tipado adecuado: "precio" cambiado de float a double para mayor precisión monetaria.
- Tipado booleano: "disponible" cambiado de int (1/0) a boolean.
- Encapsulamiento: Atributos cambiados a private con getters y setters.
- Variable sin uso: Se eliminó "Categoria" al no ser utilizada en el sistema.
*/

public class Producto {
    private int codigo;
    private String nombreProducto;
    private double precio;
    private int stock;
    private boolean disponible;
    
    public Producto(int codigo, String nombreProducto, double precio, int stock) {
        this.codigo = codigo;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.stock = stock;
        this.disponible = stock > 0;
    }

    // Getters y Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
        this.disponible = stock > 0;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void mostrarProducto() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombreProducto);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
    }
}
