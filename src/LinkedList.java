public class LinkedList extends AbstractList implements List{
    private class Node {
        int val;
        Node next;

        Node(){
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node head = null;

    private class LinkedListIterator implements Iterator {
        private Node cur = head;

        @Override
        public boolean hasNext() {
            return cur != null;
        }

        @Override
        public int next() {
            int val = cur.val;
            cur = cur.next;
            return val;
        }
    }

    @Override
    protected void insertInternal(int index, int val) {
        if(index == 0) {
            head = new Node(val, head);
        } else {
            Node cur = head;
            for(int i = 0; i < index - 1; i++) {
                cur = cur.next;
            }
            cur.next = new Node(val, cur.next);
        }
    }

    @Override
    public Iterator iterator() {
        return new LinkedListIterator();
    }
}
