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
// сделал ветку начинаю работу
        public Integer size(){
            return size;
        }

        public void add(T value){

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

        public static class Node<T>{
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


