public class Main {
    public static void main(String[] args) {

        MyLinkedList <String> linkedList = new MyLinkedList<String>();
        linkedList.add("555");
        linkedList.add("555");
        linkedList.add("555");
        linkedList.add(1,"5");
        linkedList.remove(1);


        System.out.println(linkedList.size());

    }
}

