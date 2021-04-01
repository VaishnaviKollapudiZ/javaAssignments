package com.assignment10;

public class IteratorImplementation {
    private static class Node<E> {

        private E data;
        private Node<E> next;

        public Node() {
            this.data = null;
            this.next = null;
        }

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
        public boolean hasNext() {
            return (next != null);
        }
        public Node<E> getNext() {
            return next;
        }
        public void setNext(Node<E> node) {
            this.next = node;
        }
        public E getData() {
            return data;
        }
        public E setData(E data) {
            E oldData = getData();
            this.data = data;
            return oldData;
        }
    }

    public static class SList<E>
    {
        private int size;
        public SList(){
            size = 0;
        }

        private Node<E> head = new Node<E>();

        public String toString() {
            SListIterator<E> iterator = iterator();
            StringBuilder result = new StringBuilder("[");
            while (iterator.hasNext()) {
                result.append(iterator.next().toString());
                if (iterator.hasNext()) {
                    result.append(",");
                }
            }
            result.append("]");
            return result.toString();
        }
        public SListIterator<E> iterator() {

            return new SListIterator<E>() {
                private Node<E> current = head;
                private Node<E> previous = null;


                public boolean hasNext() {
                    return current.hasNext();
                }

                public E next() {
                    if (!hasNext()) {
                        throw new RuntimeException("Doesn't have next element!");
                    }
                    previous = current;
                    current = current.getNext();
                    return current.getData();
                }

                public void add(E ele) {
                    //Add element at last.
                    Node<E> newNode = new Node<E>(ele);
                    current.setNext(newNode);
                    previous = current;
                    current = newNode;
                    newNode.next = null;
                    size++;
                }
                public void remove() {
                    //removes node at current position.
                    if (current == null) {
                        throw new RuntimeException("No elements to be removed");
                    }
                    previous.setNext(current.getNext());
                    current.setNext(null);
                    current = previous;
                    size--;
                }
            };
        }
        public int size() {
            return size;
        }
    }
    public static void main(String[] args) {

        SList<String> myList = new SList<String>();
        SListIterator<String> iterator = myList.iterator();
        for (int index = 0; index < 10; index++) {
            iterator.add(String.valueOf(index));
        }
        System.out.println(myList);
        int size = myList.size();
        System.out.println("MyList size = " + size);
        iterator = myList.iterator();
        for (int index = 0; index < size; index++) {
            iterator.next();
            if(index%2 == 0)
                iterator.remove();

        }
        System.out.println(myList);
        System.out.println("MyList size = "+myList.size());
    }
}

