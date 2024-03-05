
package ArbolBinario;

public class ArbolBinario {

    private Nodo raiz;

    public ArbolBinario () {
        raiz = null;
    }

    public void insertarNodo (int num) {
        Nodo nuevoNodo = new Nodo(num);
        if (raiz == null) raiz = nuevoNodo;
        else {
            Nodo aux = raiz;
            Nodo padre;

            while (true) {
                padre = aux;
                if (num < aux.num) {
                    aux = aux.hijoIzquierdo;

                    if (aux == null) {
                        padre.hijoIzquierdo = nuevoNodo;
                        return;
                    }
                } else {
                    aux = aux.hijoDerecho;

                    if (aux == null) {
                        padre.hijoDerecho = nuevoNodo;
                        return;
                    }
                }
            }
        }


    }

    public void insertarNodoCadena (String cadenaNodos) {
        String[] nodos = cadenaNodos.split(",");
        for (String nodo : nodos) {
            insertarNodo(Integer.valueOf(nodo));
        }
    }
    public boolean estaVacio() {
        return raiz == null;
    }

    // ordenamientos
    public static void inOrden(Nodo nodo) {
        if (nodo != null) {
            inOrden(nodo.hijoIzquierdo);
            System.out.println(nodo.num + ", ");
            inOrden(nodo.hijoDerecho);
        }
    }

    public static void preOrden(Nodo nodo) {
        if (nodo != null) {
            System.out.println(nodo.num + ", ");
            preOrden(nodo.hijoIzquierdo);
            preOrden(nodo.hijoDerecho);
        }
    }

    public static void postOrden(Nodo nodo) {
        if (nodo != null) {
            postOrden(nodo.hijoIzquierdo);
            postOrden(nodo.hijoDerecho);
            System.out.println(nodo.num + ", ");
        }
    }

    public Nodo getRaiz() {
        return raiz;
    }

}
