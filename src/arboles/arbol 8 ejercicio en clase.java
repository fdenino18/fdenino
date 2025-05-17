// 8. Búsqueda de un valor con Preorden
class BuscarValor {
    static class Nodo {
        int val;
        Nodo izq, der;
        Nodo(int v) { val = v; }
    }
    static boolean buscar(Nodo nodo, int clave) {
        if (nodo == null) return false;
        if (nodo.val == clave) return true;
        return buscar(nodo.izq, clave) || buscar(nodo.der, clave);
    }
    public static void main(String[] args) {
        Nodo raiz = new Nodo(20);
        raiz.izq = new Nodo(10);
        raiz.der = new Nodo(30);
        raiz.izq.izq = new Nodo(5);
        raiz.izq.der = new Nodo(15);

        System.out.println("Encontrado para key=15: " + buscar(raiz, 15));
        System.out.println("Encontrado para key=25: " + buscar(raiz, 25));
    }
}