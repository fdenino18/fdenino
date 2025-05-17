public boolean eliminarElemento(Integer value) {
    Nodo<Integer> padre = null, aux = raiz;
    // Buscar nodo a eliminar y su padre
    while (aux != null && !aux.getValue().equals(value)) {
        padre = aux;
        aux = (value.compareTo(aux.getValue()) > 0) ? aux.getDer() : aux.getIzq();
    }
    if (aux == null) return false;  // no encontrado

    // Caso 1: dos hijos
    if (aux.getIzq() != null && aux.getDer() != null) {
        // Encontrar sucesor (mínimo en subárbol derecho)
        Nodo<Integer> sucesor = aux.getDer(), padreSuc = aux;
        while (sucesor.getIzq() != null) {
            padreSuc = sucesor;
            sucesor = sucesor.getIzq();
        }
        aux.setValue(sucesor.getValue());
        // Ahora eliminamos el sucesor
        aux = sucesor;
        padre = padreSuc;
    }

    // Caso 2 y 3: cero o un hijo
    Nodo<Integer> hijo = (aux.getIzq() != null) ? aux.getIzq() : aux.getDer();
    if (padre == null) {
        raiz = hijo;
    } else if (padre.getIzq() == aux) {
        padre.setIzq(hijo);
    } else {
        padre.setDer(hijo);
    }
    numeroElementos--;
    return true;
}
