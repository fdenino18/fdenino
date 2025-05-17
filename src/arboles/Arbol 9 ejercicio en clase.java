// 9. Imprimir camino raíz a hoja
class CaminoRaizHoja {
    static class Nodo {
        int val;
        Nodo izq, der;
        Nodo(int v) { val = v; }
    }
    static boolean imprimirCamino(Nodo nodo, int hoja, List<Integer> camino) {
        if (nodo == null) return false;
        camino.add(nodo.val);
        if (nodo.val == hoja) return true;
        if (imprimirCamino(nodo.izq, hoja, camino) || imprimirCamino(nodo.der, hoja, camino)) return true;
        camino.remove(camino.size() - 1);
        return false;
    }
    public static void main(String[] args) {
        Nodo raiz = new Nodo(1);
        raiz.izq = new Nodo(2);
        raiz.der = new Nodo(3);
        raiz.der.izq = new Nodo(4);
        raiz.der.der = new Nodo(5);

        List<Integer> camino = new ArrayList<>();
        if (imprimirCamino(raiz, 4, camino)) {
            System.out.print("Camino a 4: ");
            for (int n : camino) System.out.print(n + " ");
        }
    }
}