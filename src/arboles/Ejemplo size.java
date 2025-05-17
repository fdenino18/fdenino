public class EjemploSize {
    public static void main(String[] args) {
        ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();
        abb.insertarElemento(5);
        abb.insertarElemento(2);
        System.out.println("Tamaño del árbol: " + abb.size());
    }
}
