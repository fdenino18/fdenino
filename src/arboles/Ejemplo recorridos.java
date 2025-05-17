public class EjemploRecorridos {
    public static void main(String[] args) {
        ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();
        for (int v : new int[]{50,30,70,20,40,60,80}) abb.insertarElemento(v);
        System.out.println("Ascendente:  " + abb.obtenerElementosOrdenadosAscendentemente());
        System.out.println("Descendente: " + abb.obtenerElementosOrdenadosDescendentemente());
    }
}
