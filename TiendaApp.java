import java.util.Scanner;

class cliente {
    public String nombreCliente;
    public String Edad;
    public char Vip; // 'S' o 'N'
    public String telefono;

    public void mostrarCliente() {
        System.out.println("Cliente: " + nombreCliente + " Edad: " + Edad + " VIP: " + Vip);
    }
}

class producto {
    public static int Codigo;
    public String Nombre_Producto;
    public float precio;
    public int Stock;
    public String Categoria;
    
    public int disponible; // 1 = disponible, 0 = no disponible
    
    public void mostrarProducto() {
        System.out.println("Codigo: " + Codigo);
        System.out.println("Nombre: " + Nombre_Producto);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + Stock);
    }
}

class venta {
    static int contadorVentas = 0;

    public producto Productol;
    public cliente Clientel;
    public int cantidad;
    int total;

    public void calcularTotal() {
        contadorVentas = contadorVentas + 1;
        float subtotal = Productol.precio * cantidad;
        
        total = (int) (subtotal + (subtotal * 0.16));
    }
    
    public void imprimirTicket() {
        System.out.println("Venta N: " + contadorVentas);
        System.out.println("Cliente: " + Clientel.nombreCliente);
        System.out.println("Producto: " + Productol.Nombre_Producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total: " + total);
    }
}

public class TiendaApp {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        producto p1 = new producto();
        p1.Codigo = 1;
        System.out.println("Nombre del producto:");
        p1.Nombre_Producto = sc.nextLine();
        System.out.println("Precio del producto:");
        p1.precio = sc.nextFloat();
        System.out.println("Stock disponible:");
        p1.Stock = sc.nextInt();
        p1.disponible = 1;
        
        sc.nextLine();
        
        cliente c1 = new cliente();
        System.out.println("Nombre del cliente:");
        c1.nombreCliente = sc.nextLine();
        System.out.println("Edad del cliente:");
        c1.Edad = sc.nextLine();
        c1.Vip = 'S';
        
        venta v1 = new venta();
        v1.Productol = p1;
        v1.Clientel = c1;
        System.out.println("Cantidad a comprar:");
        v1.cantidad = sc.nextInt();
        
        v1.calcularTotal();
        v1.imprimirTicket();
        
        int x = 10;
        int y = 3;
        int z = x / y;
        System.out.println("Valor sin uso real en la logica: " + z);
        
        double PI = 3.1416;
    }
}
