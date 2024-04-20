import java.util.NoSuchElementException;

class SimpleLinkedList<T> {

    int listSize;

    class Node {
        Node previousPointer;
        T data;
        Node nextPointer;

        public Node(T data) {
            this.previousPointer = null;
            this.data = data;
            this.nextPointer = null;
        }

    }

    Node head = null;
    Node tail = null;

    SimpleLinkedList() {
        head = null;
        tail = null;
        listSize = 0;
    }

    SimpleLinkedList(T[] values) {
        int length = values.length;
        for(int iterator=0;iterator<length;iterator++) {
            push(values[iterator]);
        }
    }

    void push(T value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        }
        else {
            tail.nextPointer = newNode;
            newNode.previousPointer = tail;
        }
        tail = newNode;
        ++listSize;
    }

    T pop() {
        if(listSize == 0) {
            throw new NoSuchElementException();
        }
        else {
            T popElement = tail.data;
            tail = tail.previousPointer;
            if(tail!=null)
                tail.nextPointer=null;
            --listSize;
            return popElement;
        }
    }

    void reverse() {
        Node temp = head;
        while(temp != null) {
            Node prvNode = temp.previousPointer;
            Node nextNode = temp.nextPointer;
            temp.previousPointer = temp.nextPointer;
            temp.nextPointer = prvNode;
            temp = nextNode;
        }
        temp = head;
        head = tail;
        tail = temp;
    }


    T[] asArray(Class<T> clazz) {

        /*Object[] objArr = new Object[listSize];

        if(listSize == 0) {
            T[] genericArr = (T[])objArr; //typecasting to cast Object type to specified generic type
            return genericArr;
        }
        else {
            T[] genericArr = (T[])objArr; //typecasting to cast Object type to specified generic type
            Node temp = tail;
            int index=0;
            while(temp != null) {
                genericArr[index++] = (T) temp.data;
                temp = temp.previousPointer;
            }
            return genericArr;
        }*/


        T[] genericArr = (T[])java.lang.reflect.Array.newInstance(clazz,listSize);
        if(listSize == 0) {
            return genericArr;
        }
        else {
            Node temp = tail;
            int index=0;
            while(temp != null) {
                genericArr[index++] = (T)temp.data;
                temp = temp.previousPointer;
            }
            return genericArr;
        }
    }

    int size() {
        return listSize;
    }
}
