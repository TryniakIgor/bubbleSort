package CustomLinkedList;


public class CustomLinkedList<T> {

    private Node first;
    private Node last;
    private int size;

    public CustomLinkedList(){
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    private static class Node<T> {
        private T item;
        private Node<T> previous;
        private Node<T> next;

        Node(T item) {
            this.item = item;
            this.previous = null;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "item=" + item +
                    '}';
        }
    }

    public void add(T item) {
        Node<T> node = new Node<T>(item);
        if (first == null) {
            first = last = node;
        } else {
            last.next = node;
            node.previous = last;
            last = node;
        }
        size++;
    }

    public void add(int index, T item) {
        if (indexNotInRange(index)) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> node = new Node<T>(item);

        if (index == size) {
            last.next = node;
            last = node;
        }
        Node previousNode = first;
        for (int i = 0; i < index; i++) {
            previousNode = previousNode.next;
        }
        Node oldPrevious = previousNode.previous;
        oldPrevious.next = node;
        previousNode.previous = node;

        node.previous = oldPrevious;
        node.next = previousNode;
        size++;
    }

    public T get(int index) {
        if (indexNotInRange(index)) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        Node<T> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.item;
    }

    public boolean contains(T item) {
        Node<T> current = first;
        while (current != null) {
            if (current.item.equals(item)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        Node<T> node = findNodeByIndex(index);
        if (node.previous == null) {
            first = node.next;
        } else {
            node.previous.next = node.next;
        }

        if (node.next == null) {
            last = node.previous;
        } else {
            node.next.previous = node.previous;
        }

        size--;
        return true;
    }

    public Node<T> findNodeByIndex(int index) {
        Node<T> node = first;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    private boolean indexNotInRange(int index) {
        return index < 0 || index >= size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<T> node = first;
        while (node != null) {
            sb.append(node.item);
            if (node.next != null) {
                sb.append(", ");
            }
            node = node.next;
        }
        sb.append("]");
        return sb.toString();
    }

}
