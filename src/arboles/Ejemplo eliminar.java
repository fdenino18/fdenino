public class EjemploEliminar {
    public static void main(String[] args) {
        ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();
        for (int v : new int[]{15,9,20,6,14,13,17}) abb.insertarElemento(v);
        System.out.println("Antes (asc): " + abb.obtenerElementosOrdenadosAscendentemente());
        abb.eliminarElemento(15);  // elimina raíz con dos hijos
        abb.eliminarElemento(6);   // elimina hoja
        System.out.println("Después (asc): " + abb.obtenerElementosOrdenadosAscendentemente());
    }
}
