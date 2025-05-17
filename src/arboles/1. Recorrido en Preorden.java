// 1. Recorrido en Preorden
class Nodo {
    int valor;
    Nodo izquierdo, derecho;

    Nodo(int valor) {
        this.valor = valor;
    }
}

class ArbolPreorden {
    public static void preorden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            preorden(nodo.izquierdo);
            preorden(nodo.derecho);
        }
    }

    public static void main(String[] args) {
        Nodo raiz = new Nodo(10);
        raiz.izquierdo = new Nodo(5);
        raiz.derecho = new Nodo(15);
        raiz.izquierdo.izquierdo = new Nodo(2);
        raiz.izquierdo.derecho = new Nodo(7);
        raiz.derecho.izquierdo = new Nodo(12);
        raiz.derecho.derecho = new Nodo(20);

        preorden(raiz); // Salida esperada: 10 5 2 7 15 12 20
    }
}