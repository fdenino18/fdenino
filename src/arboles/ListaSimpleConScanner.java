import java.util.Scanner;

public class ListaSimple {

    static class Nodo {
        int dato;
        Nodo siguiente;

        public Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    Nodo cabeza;

    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo aux = cabeza;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
    }

    public void imprimir() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaSimple lista = new ListaSimple();
        System.out.print("¿Cuántos elementos desea insertar? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            int valor = scanner.nextInt();
            lista.insertar(valor);
        }

        System.out.print("Contenido de la lista: ");
        lista.imprimir();

        scanner.close();
    }
}
