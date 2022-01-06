import java.util.Collection;

public class MyLinkedList<T> implements Comparable<MyLinkedList> {

        private int size;
        public Node<T> header = new Node<>();

        public MyLinkedList(){

        }

        public MyLinkedList(Collection<? extends T> c){
        }

        private void chekIndex(Integer index){
            if(index < 0 || index >= size)
                throw new IndexOutOfBoundsException();
        }

        public Node<T> getNode(int index){
            chekIndex(index);
            Node<T> a = header;

            if (index < (size >> 1)){
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

        public void add(T value){

            Node<T> a = header;
            Node<T> newNode = new Node( value);

            while (a.next != null) {
               a = a.next;
            }
              if (a.prev == null) {
                  a.prev = header;
              }

           a.next = newNode;
           header.prev = newNode;
           newNode.prev = a;
           size++;
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

        private class Node<T>{
             T element;
             Node prev;
             Node next;

             public  T ToString(){
                 return element;
            }
            public Node(){
                 this.element = null;
                 this.next = header;
                 this.prev = header;
            }
            public Node(T element){
                this.element = element;
                this.prev = null;
                this.next = null;
            }
        }
}


