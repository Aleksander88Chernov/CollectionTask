import java.util.Collection;

public class MyLinkedList<T extends Comparable<T>> implements Comparable<MyLinkedList> {

    private Node<T> first;
    private Node<T> last;
    private int size;
    private Node<T> header = new Node<T>(null,this.header,this.header);
    //Печатает все элементы 
    public void printList(){
        Node<T> a;
        int count = 0;
        for (a = first;size>count;a=a.next){
            System.out.println(a.element);
            count++;
        }
    }

    public MyLinkedList(){

    }

    public MyLinkedList(Collection<? extends T> c){
    }
    //Валидация индекса 
    private void chekIndex(Integer index){
        if(index >= 0 && index <= size)
            throw new IndexOutOfBoundsException((index));
    }
    //Возвращает  количество элементов 
    public Integer size(){
        return size;
    }

    // равно ли число узлов в связанном списке нулю
    public boolean isEmpty()  {
        if(size()==0){
            return true;}
        return false;
    }
    //Определяет есть ли элемент в списке
    public boolean contains( T value) {
        if (isEmpty()) {
            return false;
        }
        Node<T> par;

        for (par = first; par != null; par = par.next) {
            if (par.element.equals(value)) {
                return true;
            }
        } return false;

    }
    //Добавляет новый  элемент в конец списка  
    public boolean add(T value) {
        {
            Last(value);
            return true;
        }
    }
    //Добавляет новый  элемент в  список по индексу  
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
    // Вставляет элемент перед ненулевым узлом
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
    //Возвращает узел из списка по индексу  
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
 
    public T remove(T value){
        Node<T> a;
        Node<T> result;
        int count = 0;
        for (a = first;size>count;a=a.next){
            if (a.element.equals(value)) {
                result = a;
                del(a);
                return (T) result;
            }

        }
        return null;
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
    // Меняет узлы местами 
    private  void swap(Node<T> first, Node<T> second) {
        Node<T> a = first;
        Node<T> b = second;
        T aElement = a.element;
        a.element = b.element;
        b.element = aElement;
    }
    // Сортировка пузырьком 
    public void sort(){
        Node<T> i;
        Node<T> j;
        for ( i = last;i.prev !=null; i = i.prev) {
            for (j = first;j!=i; j = j.next) {
                int result = j.element.compareTo(j.next.element);
                if (result > 0)
                    swap(j, j.next);
            }
        }
    }

    public int compareTo(MyLinkedList o) {
        return this.size - o.size();
    }

    public class Node<T extends Comparable<T>> implements Comparable<Node>{
        T element;
        Node<T> prev;
        Node <T>next;

        public Node(T element, Node<T> prev, Node<T> next){
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        @Override
        public int compareTo(Node o) {
            return element.compareTo((T) o.element);
        }
    }
}



