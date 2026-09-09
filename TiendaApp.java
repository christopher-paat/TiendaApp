import java.util.Scanner;

class Cliente {
    public String nombreCliente;
    public String edad;
    public boolean vip = false;

    public void mostrarCliente() {
        System.out.println("Cliente: " + nombreCliente + " Edad: " + edad + " VIP: " + vip);
    }

    public Cliente() {
    }

    public Cliente (String nombreCliente, String edad, boolean vip) {
        this.nombreCliente = nombreCliente;
        this.edad = edad;
        this.vip = vip;
    }
}

class Producto {
    public int codigo;
    public String nombreProducto;
    public float precio;
    public int Stock;
    
    public boolean disponible = false;
    
    public void mostrarProducto() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombreProducto);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + Stock);
    }
}

class Venta {
    private static int contadorVentas = 0;

    public Producto producto;
    public Cliente cliente;
    public int cantidad;
    int total;

    public void calcularTotal() {
        contadorVentas = contadorVentas + 1;
        float subtotal = producto.precio * cantidad;
        
        total = (int) (subtotal + (subtotal * 0.16));
    }
    
    public void imprimirTicket() {
        System.out.println("Venta N: " + contadorVentas);
        System.out.println("Cliente: " + cliente.nombreCliente);
        System.out.println("Producto: " + producto.nombreProducto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total: " + total);
    }
}

public class TiendaApp {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Producto producto = new Producto();
        producto.codigo = 1;
        System.out.println("Nombre del producto:");
        producto.nombreProducto = sc.nextLine();
        System.out.println("Precio del producto:");
        producto.precio = sc.nextFloat();
        System.out.println("Stock disponible:");
        producto.Stock = sc.nextInt();
        if (producto.Stock > 0) {
            producto.disponible = true;
        } 
        
        sc.nextLine();
        
        Cliente cliente = new Cliente();
        System.out.println("Nombre del cliente:");
        cliente.nombreCliente = sc.nextLine();
        System.out.println("Edad del cliente:");
        cliente.edad = sc.nextLine();
        cliente.vip = true;
        
        Venta venta = new Venta();
        venta.producto = producto;
        venta.cliente = cliente;
        System.out.println("Cantidad a comprar:");
        venta.cantidad = sc.nextInt();
        
        sc.close();    
        
        venta.calcularTotal();
        venta.imprimirTicket();     
    }
}
