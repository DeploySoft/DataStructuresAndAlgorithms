package Stacks;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 18/05/21
 **/

public class Stack {
    public static void main(String[] args) {
        Attribute blue = new Attribute("blue");
        Attribute red = new Attribute("red");
        Attribute yellow = new Attribute("yellow");

        LinkedList list = new LinkedList<Attribute>();
        list.push(blue);
        list.push(red);
        list.push(yellow);

        System.out.println(list.pop());
        System.out.println(list.peek());

        ListIterator iterator = list.listIterator();
        System.out.println("-----------");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

class Attribute {

    private String name;

    public Attribute(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                '}';
    }
}
