public class EjemploBuscar {
    public static void main(String[] args) {
        ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();
        for (int v : new int[]{8,3,10,1,6,14}) abb.insertarElemento(v);
        Integer encontrado = abb.buscarElemento(6);
        System.out.println(encontrado != null ? "6 encontrado" : "6 NO encontrado");
        System.out.println("Iteraciones última búsqueda: " + abb.getNumeroIteracionesUltimaBusqueda());
    }
}
