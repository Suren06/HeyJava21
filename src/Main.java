import java.util.Collection;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Main {
    static Object get(Collection c) {

        return switch (c) {
            case Stack s -> s.pop();
            case LinkedList l -> l.getFirst();
            case Vector v -> v.lastElement();
            default -> c;
        };
    }

    public static void main(String[] argv) {

        var stack = new Stack<String>();
        stack.push("firstStackItemAdded");
        stack.push("secondStackItemAdded");
        stack.push("thirdStackItemAdded");

        var linkedList = new LinkedList<String>();

        linkedList.add("firstLinkedListElementAdded");
        linkedList.add("secondLinkedListElementAdded");
        linkedList.add("thirdLinkedListElementAdded");

        var vector = new Vector<String>();

        vector.add("firstVectorElementAdded");
        vector.add("secondVectorElementAdded");
        vector.add("thirdVectorElementAdded");

        System.out.println(get(stack));
        System.out.println(get(linkedList));
        System.out.println(get(vector));
    }
}