package List;

/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 17/05/21
 **/

public class DoublyList {

    public static void main(String... args) {
        Attribute blue = new Attribute("blue");
        Attribute red = new Attribute("red");
        Attribute yellow = new Attribute("yellow");
        Attribute green = new Attribute("green");

        AttributeDoublyList doublyList = new AttributeDoublyList();
        doublyList.addToFront(blue);
        doublyList.addToFront(red);
        doublyList.addToFront(yellow);
        doublyList.addToEnd(green);

        doublyList.printList();
    }
}

class AttributeDoublyList {

    private AttributeNode head;
    private AttributeNode tail;

    private int size;

    public void addToFront(Attribute attribute) {
        AttributeNode node = new AttributeNode(attribute);
        if (head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
            node.setNext(head);
        }
        head = node;
        size++;
    }

    public void addToEnd(Attribute attribute) {
        AttributeNode node = new AttributeNode(attribute);
        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }

    public void printList() {
        AttributeNode current = head;
        System.out.println("NULL ->");
        while (current != null) {
            System.out.println(current);
            System.out.println("<=>");
            current = current.getNext();
        }
        System.out.println("NULL");

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public AttributeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        AttributeNode removedNode = this.head;
        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);

        }
        this.head = this.head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public AttributeNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        }
        AttributeNode removedNode = this.tail;

        if (tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }
        this.tail = this.tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }

    public AttributeNode removeFromFron() {
        if (isEmpty()) {
            return null;
        }
        AttributeNode removedNode = this.head;
        this.head = this.head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }


}
