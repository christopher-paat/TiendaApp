import java.util.Scanner;

public class TiendaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Registro del producto
        int codigoProducto = 1;
        System.out.println("Nombre del producto:");
        String nombreProducto = sc.nextLine();
        System.out.println("Precio del producto:");
        double precioProducto = sc.nextDouble();
        System.out.println("Stock disponible:");
        int stockProducto = sc.nextInt();
        
        sc.nextLine();
        
        // Creación del cliente mediante el constructor 
        Producto producto = new Producto(codigoProducto, nombreProducto, precioProducto, stockProducto);


        // Registro del cliente
        System.out.println("Nombre del cliente:");
        String nombreCliente = sc.nextLine();
        System.out.println("Edad del cliente:");
        int edadCliente = sc.nextInt();
        boolean esVip = true;

        sc.close(); 

        // Creación del cliente mediante el constructor
        Cliente cliente = new Cliente(nombreCliente, edadCliente, esVip);
        
        // Generación de la venta
        System.out.println("Cantidad a comprar:");
        int cantidadComprar = sc.nextInt();

        if (cantidadComprar > producto.getStock()) {
            System.out.println("No hay stock.");
            return;
        }
        
        // Creación de la venta mediante el constructor
        Venta venta = new Venta(producto, cliente, cantidadComprar);
        
        // Emisión del ticket de venta
        venta.imprimirTicket();
    }
}
