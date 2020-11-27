package pc;
public class Pila {

    Nodos primero;
    public Pila(){
        primero= null;
    }

    public boolean estaVacio(){
        return primero == null;
    }

    public void insertar(Object dato){
        if (estaVacio()){
            Nodos nuevo = new Nodos(dato, null);
            primero = nuevo;
        }
        else {
            Nodos ultimo= primero;
            while (ultimo.getSiguiente() != null){
                ultimo=ultimo.getSiguiente();
            }
            Nodos nuevo = new Nodos(dato, null);
            ultimo.setSiguiente(nuevo);
        }
    }


    public void eliminar(){
        if (!estaVacio()){
            Nodos ultimo = primero;
            Nodos penultimo = null;
            while (ultimo.getSiguiente() !=null){
                penultimo = ultimo;
                ultimo = ultimo.getSiguiente();
            }

            penultimo.setSiguiente(null);
        }
    }


    public void mostrar(){
        Nodos tmp=primero;
        while (tmp!=null){
            System.out.print(tmp.getDato()+" ");

            tmp=tmp.getSiguiente();
        }
        System.out.println();
    }

}

