package ds.algo;

import java.util.NoSuchElementException;

public class LearnLinkedlist {

    private class Node{
        private int value; //to store actual value
        private Node next; //reference for next node

        public Node(int item){
            this.value=item;
        }
    }

    private Node first; //head
    private Node last; //tail
    private int size =0;

    //if empty
    private boolean isEmpty(){
        return first == null ;
    }
    //add last
    public void addLast(int item){
        var node = new Node(item);
        //list is empty or not
        if(isEmpty())
            first=last=node;
        else{
            last.next = node;
            last = node;
        }
        size++;
    }

    //add First
    public void addFirst(int item){
        var node = new Node(item);
        //list is empty or not
        if(isEmpty())
            first=last=node;
        else {
            node.next = first;
            first = node;
        }
        size++;
        }

    //finding index of an item
    public int indexOf(int item){
        int index = 0;
        var current =first;
        while(current != null){
            if (current.value == item) return index;
            current = current.next;
            index++;

        }
        return -1;
    }

    //to find if a value is present or not
    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    //remove first
    public void removeFirst(){
        //list empty
        if (isEmpty())
            throw new NoSuchElementException();
        //list has only 1 node
        if(first == last)
            first = last = null;
        else{
            //more than 1 node
            var second = first.next;
            first.next = null;
            first = second;
        }
        size --;
    }

    //remove last
    public void removeLast(){
        //list empty
        if (isEmpty())
            throw new NoSuchElementException();
        //list has only 1 node
        if(first == last)
            first = last = null;
        else{
            //more than 1 node
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
        size --;
    }


    //find previous node
    private Node getPrevious(Node node){
        var current= first;
        while(current != null){
            if(current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    //find size
    public int size(){
        return size;
    }

    //linked list to array
    public int[] toArray() {
        int[] array = new int[size];
        var index = 0;
        var current = first;
        while (current != null) {
            array[index] = current.value;
            current = current.next;
            index++;
    }
    return array;
    }



}

    







