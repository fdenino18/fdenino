public class EjemploInsertar {
    public static void main(String[] args) {
        ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();
        abb.insertarElemento(8);
        abb.insertarElemento(3);
        abb.insertarElemento(10);
        abb.insertarElemento(1);
        abb.insertarElemento(6);
        System.out.println("Elementos (asc): " + abb.obtenerElementosOrdenadosAscendentemente());
    }
}
