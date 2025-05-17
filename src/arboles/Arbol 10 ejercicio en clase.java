// 10. Convertir Árbol en espejo
class ArbolEspejo {
    static class Nodo {
        int val;
        Nodo izq, der;
        Nodo(int v) { val = v; }
    }
    static void espejo(Nodo nodo) {
        if (nodo == null) return;
        espejo(nodo.izq);
        espejo(nodo.der);
        Nodo temp = nodo.izq;
        nodo.izq = nodo.der;
        nodo.der = temp;
    }
    static void inorden(Nodo nodo) {
        if (nodo != null) {
            inorden(nodo.izq);
            System.out.print(nodo.val + " ");
            inorden(nodo.der);
        }
    }
    public static void main(String[] args) {
        Nodo raiz = new Nodo(9);
        raiz.izq = new Nodo(6);
        raiz.der = new Nodo(12);
        raiz.izq.izq = new Nodo(3);
        raiz.izq.der = new Nodo(7);
        raiz.der.der = new Nodo(15);

        espejo(raiz);
        inorden(raiz); // Salida esperada: 15 12 9 7 6 3
    }
}
