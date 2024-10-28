public class SinglyLinkedList {
    
    Nodo cabeza;

    public SinglyLinkedList(){
        this.cabeza=null;
    }
    //metodo para insertar
    public void insertar(Integer dato){
        //Crear un nodo 
        Nodo  nuevoNodo= new Nodo(dato);
        //Verificar si la lista esta vacia 
        if (cabeza==null) {
            //Coloca el nuevo nodo como cabeza 
            cabeza=nuevoNodo;
        } else{
            Nodo temp=cabeza; //Iniciamos desde la cabeza(El primero )
            while (temp.siguiente != null) {
                //Recorremos todos los nodos hasta encontrar null en las 
                temp=temp.siguiente;
            }
            //le asignamos al nuevo nodo como el siguiente del ultimo nodo
            temp.siguiente=nuevoNodo;
        }
    }
    
    public void mostrar() {
        Nodo temp = cabeza; //comenzamos desde la cabeza 
        //mientras temp no sea nulo 
        while (temp != null) {
            System.out.print(temp.dato+ "->");
            temp = temp.siguiente;
        }
        System.out.println("null");
    }
    public boolean buscar(Integer dato){
        //Verificamos si la lista esta vacia
        if (cabeza==null) {
            //si lo esta significa que le valor no existe en la lista
            System.out.println("La lista esta vacia");
            return true;
        } 
        Nodo temp = cabeza;
        while (temp != null) {
            //verifica si el nodo contiene el valor buscado
            if (temp.dato.equals(dato)) {
                System.out.println("El valor " + dato + " se ha encontrado");
                return true;
            }
            temp = temp.siguiente;
        } 
        //Verifica que el valor no se encuentra
        System.out.println("El valor " + dato + " no se encuentra");
        return false;
    }
    //metodo para eliminar 
    public void eliminar(Integer valor) {
        if (cabeza==null) {
            System.out.println("No se puede eliminar porque la lista esta vacia ");
        }
        if (cabeza.dato==valor) {
            cabeza=cabeza.siguiente;
            return;
        }
        Nodo temp=cabeza;
        Nodo anterior=null;
        while (temp!=null && temp.dato!=valor) { //recorrer hasta encontrar el nodo con el valor 
            anterior=temp;
            temp=temp.siguiente;
        }
        if (temp==null) {
            System.out.println("No se encontro el valor ");
            return;
        }
        anterior.siguiente = temp.siguiente;
        System.out.println("Se elimino correctamente "+valor);
    }
}

