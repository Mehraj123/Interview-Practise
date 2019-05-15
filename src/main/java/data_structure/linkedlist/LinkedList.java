package data_structure.linkedlist;

public class LinkedList<T> {

    private Node<T> head;

    public void insertAtFirst(T data) {
        this.head = insertAtFirst(data, head);
    }

    private Node<T> insertAtFirst(T data, Node<T> head) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            newNode.setNext(current);
            head = newNode;
        }
        return head;
    }

    public void insertAtLast(T data) {
        this.head = insertAtLast(data, head);
    }

    private Node<T> insertAtLast(T data, Node<T> head) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
        } else {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }
        return head;
    }

    public void print() {
        if (head == null) return;
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();

        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtFirst(1);
        linkedList.insertAtFirst(2);
        linkedList.insertAtFirst(3);
        linkedList.insertAtLast(100);
        linkedList.insertAtLast(101);
        linkedList.insertAtFirst(102);
        linkedList.print();
    }
}
