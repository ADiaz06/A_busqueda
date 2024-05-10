import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingrese la cantidad de productos a registrar: ");
        int cantidadProductos = scanner.nextInt();
        scanner.nextLine(); 
        
        
        String[] inventario = new String[cantidadProductos];
        
   
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
            inventario[i] = scanner.nextLine();
        }
        
        
        System.out.print("Ingrese el nombre del producto a buscar: ");
        String productoBuscado = scanner.nextLine();
        
     
        boolean encontrado = buscarProducto(inventario, productoBuscado);
        
       
        if (encontrado) {
            System.out.println("El producto \"" + productoBuscado + "\" está disponible en el inventario.");
        } else {
            System.out.println("El producto \"" + productoBuscado + "\" no está disponible en el inventario.");
        }
        
        scanner.close();
    }
    
    
    public static boolean buscarProducto(String[] inventario, String productoBuscado) {
        for (String producto : inventario) {
            if (producto.equalsIgnoreCase(productoBuscado)) {
                return true;
            }
        }
        return false;
    }
}

