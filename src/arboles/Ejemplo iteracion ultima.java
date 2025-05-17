public class EjemploIteracionUltima {
    public static void main(String[] args) {
        ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();
        for (int v : new int[]{8,4,12,2,6}) abb.insertarElemento(v);
        abb.buscarElemento(6);
        System.out.println("Iteraciones última búsqueda: " + abb.getNumeroIteracionesUltimaBusqueda());
    }
}
