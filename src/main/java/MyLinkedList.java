import java.util.Collection;

public class MyLinkedList<T> implements Comparable<MyLinkedList> {

        private Node<T> first;
        private Node<T> last;
        private int size;
        private Node<T> header = new Node<>(null,this.header,this.header);


        public MyLinkedList(){

        }

        public MyLinkedList(Collection<? extends T> c){
        }

        private void chekIndex(Integer index){
            if(index < 0 || index >= size)
                throw new IndexOutOfBoundsException();
        }

        private Node<T> getNode(int index){
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

        private boolean contains( T value) {
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
                linkLast(value);
                return true;
            }
        }
       void linkLast(T value) {
        final Node<T> l = last;
        final Node<T> newNode = new Node<>(l, value, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
        modCount++;
      }


        public T remove(T value){
            return null;
        }

        public void sort(){

        }

        @Override
        public int compareTo(MyLinkedList o) {
            return this.size - o.size();
        }

        public class Node<T>{
            private T element;
            private Node<T> prev;
            private Node<T> next;
            public Node(T element, Node<T> prev, Node<T> next){
                this.element = element;
                this.prev = prev;
                this.next = next;
            }
        }
}


