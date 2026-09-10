public class Venta {
    public static final double IVA = 0.16; // Constante en lugar de número mágico
    private static int contadorVentas = 0; // Contador global

    private Producto producto;
    private Cliente cliente;
    private int cantidad;
    private double total;

    public Venta(Producto producto, Cliente cliente, int cantidad) {
        contadorVentas++;
        this.producto = producto;
        this.cliente = cliente;
        this.cantidad = cantidad;
        calcularTotal();
    }

    public void calcularTotal() {
        double subtotal = producto.getPrecio() * cantidad;
        this.total = subtotal + (subtotal * IVA);
    }
    
    public void imprimirTicket() {
        System.out.println("Venta N: " + contadorVentas);
        System.out.println("Cliente: " + cliente.getNombreCliente());
        System.out.println("Producto: " + producto.getNombreProducto());
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total: " + total);
    }
}
