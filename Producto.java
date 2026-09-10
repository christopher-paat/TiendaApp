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
