package com.assignment10;

public interface SListIterator<E> {

    public boolean hasNext();
    public E next();
    public void remove();
    public void add(E element);
}

