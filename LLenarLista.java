import java.util.LinkedList;
import java.util.Scanner;

public class LLenarLista {
    public LinkedList<ObjProductos> llenarLista() {
        LinkedList<ObjProductos> lista = new LinkedList();
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;
        int opt = 0;
        while (bandera) {
            ObjProductos op = new ObjProductos();
            System.out.println("Ingrese el nombre del producto");
            op.setNombre(sc.next());
            sc.nextLine();
            System.out.println("Ingrese el precio del producto");
            while (!sc.hasNextDouble()) {
                System.out.println("el dato ingresado es incorrecto por favor ingrese de nuevo");
                sc.next();

            }
            op.setPrecio(sc.nextDouble());
            sc.nextLine();

            System.out.println("ingrese la cantidad del producto");
            while (!sc.hasNextInt()) {

                System.out.println("el dato ingresado es incorrecto por favor ingrese de nuevo");
                sc.next();

            }
            op.setCantidad(sc.nextInt());
            sc.nextLine();
            lista.add(op);

            System.out.println("desea ingresar mas registros 1: si 2: no");
            while (!sc.hasNextInt()) {

                System.out.println("el dato ingresado es incorrecto por favor ingrese de nuevo");
                sc.next();

            }
            opt = sc.nextInt();
            if (opt == 2) {
                bandera = false;
            }
        }
        return lista;
    }

}
