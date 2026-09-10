/*
Errores corregidos:
- Variables sin uso eliminadas: Se removieron variables muertas (x, y, z, PI) que no aportaban a la lógica.
- Nombres descriptivos: Variables de instancia renombradas (p1 -> producto, c1 -> cliente, v1 -> venta).
- Encapsulamiento aplicado: En lugar de asignar atributos públicos directamente, se leen los datos y se instancian los objetos mediante sus constructores.
- Manejo correcto de recursos: Se utiliza sc.close() para el cierre seguro de Scanner.
- Consumo de saltos de línea: Manejo adecuado del buffer de Scanner tras leer tipos numéricos.
*/

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

        sc.nextLine();

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

        sc.close(); // Cierre del Scanner para liberar recursos
    }
}
