public class EjemploIteracionMedia {
    public static void main(String[] args) {
        ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();
        for (int v : new int[]{10,5,15,3,7,12,18}) abb.insertarElemento(v);
        abb.buscarElemento(7);
        abb.buscarElemento(12);
        System.out.println("Iteraciones medias: " + abb.getNumeroIteracionesMedioEnBusquedas());
    }
}
