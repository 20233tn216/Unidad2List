public class App2 {
    public static void main(String[] args) {
        SinglyLinkedList lista = new SinglyLinkedList();

        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
        lista.mostrar();

        lista.buscar(20);
        lista.buscar(40);

        lista.eliminar(20);
        lista.mostrar();

    }
    
}
