// 2. Recorrido Inorden
class ArbolInorden {
    static class Nodo {
        int valor;
        Nodo izq, der;
        Nodo(int val) { valor = val; }
    }
    static void inorden(Nodo nodo) {
        if (nodo != null) {
            inorden(nodo.izq);
            System.out.print(nodo.valor + " ");
            inorden(nodo.der);
        }
    }
    public static void main(String[] args) {
        Nodo raiz = new Nodo(8);
        raiz.izq = new Nodo(3);
        raiz.der = new Nodo(10);
        raiz.izq.der = new Nodo(6);
        raiz.der.der = new Nodo(14);

        inorden(raiz); // Salida esperada: 3 6 8 10 14
    }
}