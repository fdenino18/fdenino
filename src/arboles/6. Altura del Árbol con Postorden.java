// 6. Altura del Árbol con Postorden
class AlturaArbol {
    static class Nodo {
        char val;
        Nodo izq, der;
        Nodo(char v) { val = v; }
    }
    static int altura(Nodo nodo) {
        if (nodo == null) return 0;
        return 1 + Math.max(altura(nodo.izq), altura(nodo.der));
    }
    public static void main(String[] args) {
        Nodo raiz = new Nodo('M');
        raiz.izq = new Nodo('N');
        raiz.izq.izq = new Nodo('O');
        raiz.izq.der = new Nodo('P');
        raiz.izq.der.der = new Nodo('Q');
        System.out.println("Altura = " + altura(raiz)); // 4
    }
}