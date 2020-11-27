package pc;

public class Nodos {
    protected Object dato;
    protected Nodos siguiente;

    public Nodos(Object dato, Nodos siguiente) {
        this.setDato(dato);
        this.setSiguiente(siguiente);
    }

    public Object getDato() {
        return dato;
    }


    public void setDato(Object dato) {
        this.dato = dato;
    }


    public Nodos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodos siguiente) {
        this.siguiente = siguiente;
    }
}
