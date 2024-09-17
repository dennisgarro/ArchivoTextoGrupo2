import java.util.LinkedList;

public class MostrarLista {

    public void mostrarLista(LinkedList<ObjProductos> lista) {
        if (!lista.isEmpty()) {
            for (ObjProductos p : lista) {
                System.out.println("Nombre: " + p.getNombre());
                System.out.println("Precio: " + p.getPrecio());
                System.out.println("Cantidad: " + p.getCantidad());
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

            }
        } else {
            System.out.println("la lista esta vacia");
        }

    }
}
