import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        LLenarLista ll = new LLenarLista();
        LinkedList<ObjProductos> lista = new LinkedList();
        MostrarLista m = new MostrarLista();
        boolean bandera = true;
        while (bandera) {
            int opt = Integer.parseInt(JOptionPane.showInputDialog("ingres la opcion deseada " + "\n" +
                    "1: llenar lista \n" + "2: importar Archivo \n" + " 3: Exportar Archivo \n" + "4: mostrar lista \n"
                    + "5: salir"));
            switch (opt) {
                case 1:
                    lista = ll.llenarLista();
                    break;
                case 2:
                    ImportarArchivoTxt ip = new ImportarArchivoTxt();
                    lista = ip.leerArchivo("Producto");
                    m.mostrarLista(lista);
                    break;
                case 3:
                    ExportarArchivo ea = new ExportarArchivo();
                    ea.exportarArchivo(lista);
                    break;
                case 4:

                    m.mostrarLista(lista);
                    break;
                case 5:
                    System.out.println("Hasta luego");
                    bandera = false;
                    break;

                default:
                    break;
            }

        }
    }

}
