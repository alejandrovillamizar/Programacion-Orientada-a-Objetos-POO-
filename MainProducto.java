package encapsulamiento;

public class MainProducto {
    public static void main(String[] args) {
        Producto p = new Producto(001, "Teclado Mecanico", 180000, 10);
       System.out.println("Producto: " + p.getNombre());
        System.out.println("Precio: " + p.getPrecio());
       System.out.println("Stock: " + p.getStock());
    p.vender(3);
    p.vender(20);
    p.reabastecer(5);
    System.out.println("Stock después del reabastecimiento: " + p.getStock());
    
    
    
    }
}
