// 7. Suma de todos los nodos con Inorden
class SumaNodos {
    static class Nodo {
        int val;
        Nodo izq, der;
        Nodo(int v) { val = v; }
    }
    static int suma(Nodo nodo) {
        if (nodo == null) return 0;
        return suma(nodo.izq) + nodo.val + suma(nodo.der);
    }
    public static void main(String[] args) {
        Nodo raiz = new Nodo(5);
        raiz.izq = new Nodo(3);
        raiz.der = new Nodo(7);
        raiz.izq.izq = new Nodo(1);
        raiz.izq.der = new Nodo(4);
        raiz.der.der = new Nodo(9);
        System.out.println("Suma total = " + suma(raiz)); // 29
    }
}
