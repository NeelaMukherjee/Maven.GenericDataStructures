package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {
    private ArrayList<E> elements;


    public Stack() {
        elements = new ArrayList<>();

    }

    //push, pop, isEmpty, peek

    public void push(E nextEleme) {

        elements.add(nextEleme);
    }

    public E pop() throws IndexOutOfBoundsException{

        Integer len = elements.size();

            E temp = elements.get(len - 1);
            elements.remove(len - 1);
            return temp;
    }

    public boolean isEmpty() {

        return elements.isEmpty();
    }
}
