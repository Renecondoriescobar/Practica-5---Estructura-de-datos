import pc.Cola;
import pc.Pila;

public class Main {
    public static void main(String[] args) {

        //AQUI ES LA EJECUCION DE LAS COLAS
        System.out.println("AQUI LAS COLAS");
        Cola cola = new Cola();
        System.out.println(cola.estaVacio());

        for (int i = 1; i <=5 ; i++) {
            cola.insertar(i);
        }

        cola.mostrar();

        cola.eliminar();
        cola.eliminar();

        cola.mostrar();


        ////////////////////////////////////////////////////////////////////////

        //AQUI ES LA EJECUCION DE LAS PILAS
        System.out.println("AQUI LAS PILAS");
        Pila pila = new Pila();
        System.out.println(pila.estaVacio());

        for (int i = 1; i <=5 ; i++) {
            pila.insertar(i);
        }

        pila.mostrar();

        pila.eliminar();
        pila.eliminar();
        pila.eliminar();

        pila.mostrar();



    }
}
