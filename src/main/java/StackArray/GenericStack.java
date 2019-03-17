package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;

    public GenericStack() {
        elements = (E[]) new Object[0];
    }

    //double the size if the number of elements is more than 8

    public boolean isEmpty() {
        return elements.length == 0;
    }

    public void push(E pushElement) {
        elements = Arrays.copyOf(elements, elements.length+1);
        elements[elements.length-1]= pushElement;
    }

    public E pop() throws IndexOutOfBoundsException{
        E temp = elements[elements.length-1];
        elements = Arrays.copyOf(elements, elements.length-1);

        return temp;
    }
}
