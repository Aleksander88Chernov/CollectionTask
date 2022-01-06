import java.util.Collection;

public class MyLinkedList<T> implements Comparable<MyLinkedList> {

        private Node<T> first;
        private Node<T> last;
        private int size;
        private Node<T> header = new Node<T>(null,this.header,this.header);


        public MyLinkedList(){

        }

        public MyLinkedList(Collection<? extends T> c){
        }

        private void chekIndex(Integer index){
            if(index >= 0 && index <= size)
                throw new IndexOutOfBoundsException((index));
        }

        public Node<T> getNode(int index){
            chekIndex(index);
            Node<T> a = header;
            if (index < (index >> 1)){
                for (int i = 0;i <= index;i++)
                    a = a.next;
            }else {
                for (int i = size;i > index;i--)
                    a = a.prev;
            }
            return a;
        }

        public Integer size(){
            return size;
        }

        // равно ли число узлов в связанном списке нулю
        public boolean isEmpty()  {
            if(size()==0){
                return true;}
            return false;
        }

        public boolean contains( T value) {
            if (isEmpty()) {
                return false;
            }
            Node<T> par;

            for (par = header; par != null; par = par.next) {
                if (par.element.equals(value)) {
                    return true;
                }
            } return false;

        }

        public boolean add(T value) {
        {
                Last(value);
                return true;
            }
        }

    public void add(int index, T value) {


        if (index == size)
            Last(value);
        else
            Before(value, node(index));
    }



       void Last(T value) {
        final Node<T> l = last;
        final Node<T> newNode = new Node<>(value,l, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;

      }
      void Before(T value, Node<T> par ) {

        final Node<T> bef = par.prev;
        final Node<T> newNode = new Node<>(value, bef, par);
        par.prev = newNode;
        if (bef == null)
            first = newNode;
        else
            bef.next = newNode;
        size++;
    }

    Node<T> node(int index) {

        if(index < (size >> 1)) {
            Node<T> par = first;
            for (int i = 0; i < index; i++)
                par = par.next;
            return par;
        } else {
            Node<T> par = last;
            for (int i = size - 1; i > index; i--)
                par = par.prev;
            return par;
        }
    }
        public T remove(int index){

            return del(node(index));
        }


    T del(Node<T> par) {

        final T element = par.element;
        final Node<T> next = par.next;
        final Node<T> prev = par.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            par.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            par.next = null;
        }

        par.element = null;
        size--;
        return element;
    }


        public void sort(){

        }


        public int compareTo(MyLinkedList o) {
            return this.size - o.size();
        }

        public class Node<T>{
            T element;
             Node<T> prev;
             Node <T>next;
             public T ToString(){
                return element; }

            public Node(T element, Node<T> prev, Node<T> next){
                this.element = element;
                this.prev = prev;
                this.next = next;
            }

            }
        }



