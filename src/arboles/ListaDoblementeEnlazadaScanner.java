import java.util.Scanner;

public class ListaDoblementeEnlazada {

    static class Nodo {
        int dato;
        Nodo siguiente;
        Nodo anterior;

        public Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
            this.anterior = null;
        }
    }

    Nodo cabeza;

    public void procesar(int dato) {
        Nodo nodo = new Nodo(dato);
        nodo.siguiente = cabeza;
        nodo.anterior = null;
        if (cabeza != null) {
            cabeza.anterior = nodo;
        }
        cabeza = nodo;
    }

    public void ajustar() {
        if (cabeza == null) return;
        Nodo p = cabeza;
        while (p.siguiente != null) {
            p = p.siguiente;
        }
        if (p.anterior != null) {
            p.anterior.siguiente = null;
        } else {
            cabeza = null;
        }
    }

    public void mostrarSecuencia() {
        Nodo aux = cabeza;
        while (aux != null && aux.siguiente != null) {
            aux = aux.siguiente;
        }
        System.out.print("Secuencia inversa: ");
        while (aux != null) {
            System.out.print(aux.dato + " ");
            aux = aux.anterior;
        }
        System.out.println();
    }

    public void imprimir() {
        Nodo actual = cabeza;
        System.out.print("Secuencia directa: ");
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();
        System.out.print("¿Cuántos elementos desea insertar al inicio? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            int valor = scanner.nextInt();
            lista.procesar(valor);
        }

        lista.imprimir();
        lista.mostrarSecuencia();

        System.out.print("¿Desea eliminar el nodo final? (s/n): ");
        String respuesta = scanner.next();
        if (respuesta.equalsIgnoreCase("s")) {
            lista.ajustar();
            lista.imprimir();
            lista.mostrarSecuencia();
        }

        scanner.close();
    }
}
