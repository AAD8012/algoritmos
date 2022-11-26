package data;

public class nodoArbol {
    private int valor;
    private nodoArbol nodoIzq;
    private nodoArbol nodoDerecho;

    public nodoArbol(int valor) {
        this.valor = valor;
        this.nodoIzq = null;
        this.nodoDerecho = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public nodoArbol getNodoIzq() {
        return nodoIzq;
    }


    public nodoArbol getNodoDerecho() {
        return nodoDerecho;
    }

    public void insertar(int valor) {
        if (valor < this.valor) {
            if (this.nodoIzq == null) {
                this.nodoIzq = new nodoArbol(valor);

            } else {
                this.nodoIzq.insertar(valor);
            }
        } else {
            if (nodoDerecho == null) {
                this.nodoDerecho = new nodoArbol(valor);

            } else {
                this.nodoDerecho.insertar(valor);
            }
        }
    }
}
