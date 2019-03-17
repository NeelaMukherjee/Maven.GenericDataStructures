package StackArray;

import java.util.Arrays;
import java.util.EventObject;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 *
 * @param <E>
 */
public class ObjectStack<E extends Object> extends GenericStack<E> {
//    private Object[] elements;
//
//    public ObjectStack() {
//        elements = new Object[0];
//
//    }
//
//    public boolean isEmpty() {
//        return elements.length == 0;
//    }
//
//    public void push(E pushElement) {
//        elements = Arrays.copyOf(elements, elements.length + 1);
//        elements[elements.length - 1] = pushElement;
//    }
//
//    @Override
//    public Object pop() throws IndexOutOfBoundsException {
//        Object temp = elements[elements.length - 1];
//        elements = Arrays.copyOf(elements, elements.length - 1);
//
//        return temp;
//    }
}
