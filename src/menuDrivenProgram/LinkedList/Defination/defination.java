package menuDrivenProgram.LinkedList.Defination;

import menuDrivenProgram.LinkedList.ADT.LinkedListADT;

public class defination<Page> implements LinkedListADT<Page> {
    private Node<Page> head = null;
    private int size = 0;


    private Node<Page> getNode(int index) {
        Node<Page> response = null;
        for (int i = 0; i < index; i++) {

            response = response.getNext();
        }
        return response;
    }

    public void addFirst(Page data) {
        head = new Node<Page>(data, head);
        size++;
    }

    public void addAfter(Node<Page> node, Page data) {
        Node<Page> node1 = new Node<Page>(data, node.next);
        node.next = node1;
        size++;
    }

    public void add(int index, Page data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("invalid index found");
        }
        if (index == 0) {
            addFirst(data);
        } else {
            Node<Page> temp = getNode(index - 1);
            addAfter(temp, data);
        }
    }






    @Override
    public void add(Page data) {
        add(size, data);
    }

    public Page removeFirst() {
        Page response = null;
        Node<Page> temp = head;
        if (head != null) {
            head = head.getNext();
            size--;
            response = temp.getItem();
        }
        return response;
    }

    public Page removeAfter(Node<Page> node) {
        Page response = null;
        Node<Page> temp = node.getNext();
        if (temp != null) {
            node.next = node.getNext();
            size--;
            response = temp.getItem();
        }
        return response;
    }

    public Page remove(int index) {
        Page response = null;
        if (index == 0 || index > size) {
            throw new IndexOutOfBoundsException("invalid index");
        }
        if (index == 0) {
            removeFirst();
        } else {
            Node<Page> previous = getNode(index - 1);
            response = removeAfter(previous);
        }
        return response;
    }

    @Override
    public Page remove(Page data) {
        return remove(size - 1);
    }

    @Override
    public int search(Page data) {
        int response = -1;
        for (int i = 0; i < size; i++) {
            Page temp = this.getNode(i).getItem();
            if (temp.equals(data)) {
                response = i;
            }
        }
        return response;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("defination                      ");
        for (int i = 0; i < size; i++) {
            Page data = getNode(i).getItem();
            sb.append(data);
        }
        sb.append('.');
        return sb.toString();
    }


    @Override
    public void print() {
        System.out.println(toString());
    }


    private static class Node<Page> {
        private Page item;
        private Node<Page> next = null;

        public Node(Page item) {
            this.item = item;
            this.next = null;
        }

        public Node(Page item, Node<Page> next) {
            this.item = item;
            this.next = next;
        }

        public Page getItem() {
            return item;
        }

        public Node<Page> getNext() {
            return next;
        }

    }

}
