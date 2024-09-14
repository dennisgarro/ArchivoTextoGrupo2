import java.util.LinkedList;

public class Principal {

    public static void main(String[] args) {
        LLenarLista ll = new LLenarLista();
        LinkedList<ObjProductos> lista = new LinkedList();
        lista = ll.llenarLista();
        ExportarArchivo ea = new ExportarArchivo();
        ea.exportarArchivo(lista);
    }
}
