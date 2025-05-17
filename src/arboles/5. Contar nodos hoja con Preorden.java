// 5. Contar nodos hoja con Preorden
class ContarHojas {
    static class Nodo {
        int val;
        Nodo izq, der;
        Nodo(int v) { val = v; }
    }
    static int contarHojas(Nodo nodo) {
        if (nodo == null) return 0;
        if (nodo.izq == null && nodo.der == null) return 1;
        return contarHojas(nodo.izq) + contarHojas(nodo.der);
    }
    public static void main(String[] args) {
        Nodo raiz = new Nodo(7);
        raiz.izq = new Nodo(4);
        raiz.der = new Nodo(9);
        raiz.izq.izq = new Nodo(2);
        raiz.der.izq = new Nodo(8);
        raiz.der.der = new Nodo(11);
        System.out.println("N.º de hojas = " + contarHojas(raiz)); // 3
    }
}