package menuDrivenProgram.LinkedList.Defination;

import menuDrivenProgram.LinkedList.ADT.LinkedListADT;

public class defination<documents> implements LinkedListADT<documents> {
    private Node<documents> head = null;
    private int size = 0;

    private Node<documents> getNode(int index) {
        Node<documents> response = null;
        for (int i = 0; i < index; i++) {

            response = response.getNext();
        }
        return response;
    }

    public void addFirst(documents data) {
        head = new Node<documents>(data, head);
        size++;
    }








    @Override
    public void add(documents data) {

    }

    @Override
    public void remove(documents data) {

    }

    @Override
    public int search(documents data) {
        return 0;
    }

    @Override
    public void print() {

    }

    private static class Node<documents> {
        private documents item;
        private Node<documents> next = null;

        public Node(documents item) {
            this.item = item;
            this.next = null;
        }

        public Node(documents item, Node<documents> next) {
            this.item = item;
            this.next = next;
        }

        public documents getItem() {
            return item;
        }

        public Node<documents> getNext() {
            return next;
        }

    }

}
