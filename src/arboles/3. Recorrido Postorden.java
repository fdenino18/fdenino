// 3. Recorrido Postorden
class NodoChar {
    char valor;
    NodoChar izq, der;
    NodoChar(char v) { valor = v; }
}

class ArbolPostorden {
    public static void postorden(NodoChar nodo) {
        if (nodo != null) {
            postorden(nodo.izq);
            postorden(nodo.der);
            System.out.print(nodo.valor + " ");
        }
    }

    public static void main(String[] args) {
        NodoChar A = new NodoChar('A');
        NodoChar B = new NodoChar('B');
        NodoChar C = new NodoChar('C');
        NodoChar D = new NodoChar('D');
        NodoChar E = new NodoChar('E');
        NodoChar F = new NodoChar('F');

        A.izq = B; A.der = C;
        B.izq = D;
        C.izq = E; C.der = F;

        postorden(A); // Salida esperada: D B E F C A
    }
}