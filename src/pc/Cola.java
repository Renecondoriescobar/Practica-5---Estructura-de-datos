package pc;


public class Cola {
    Nodos primero;
    public Cola(){
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
            primero = primero.getSiguiente();
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