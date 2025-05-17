// 4. Recorrido por niveles (BFS)
import java.util.*;
class ArbolBFS {
    static class Nodo {
        int val;
        Nodo izq, der;
        Nodo(int val) { this.val = val; }
    }
    static void recorridoNivel(Nodo raiz) {
        if (raiz == null) return;
        Queue<Nodo> cola = new LinkedList<>();
        cola.add(raiz);
        while (!cola.isEmpty()) {
            Nodo actual = cola.poll();
            System.out.print(actual.val + " ");
            if (actual.izq != null) cola.add(actual.izq);
            if (actual.der != null) cola.add(actual.der);
        }
    }
    public static void main(String[] args) {
        Nodo raiz = new Nodo(1);
        raiz.izq = new Nodo(2);
        raiz.der = new Nodo(3);
        raiz.izq.izq = new Nodo(4);
        raiz.izq.der = new Nodo(5);
        raiz.der.der = new Nodo(6);

        recorridoNivel(raiz); // Salida esperada: 1 2 3 4 5 6
    }
}
