import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class ExportarArchivo {

    public void exportarArchivo(LinkedList<ObjProductos> productos) {
        if (productos.isEmpty()) {
            LLenarLista ll = new LLenarLista();
            productos = ll.llenarLista();
        } else {
            try (FileWriter escriba = new FileWriter("Producto.txt")) {
                for (ObjProductos item : productos) {
                    escriba.write("Nombre: " + item.getNombre() + "\n");
                    escriba.write("Precio: " + item.getPrecio() + "\n");
                    escriba.write("Cantidad: " + item.getCantidad() + "\n");
                    escriba.write("---------------------------------------\n");

                }

                System.out.println("Archivo exportado correctamente");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
