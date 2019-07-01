public class LinkedList extends AbstractList implements List{
    /**
     * 内部类 创建节点类
     */
    private class Node {
        int val;
        Node next;

        Node(int val){
            this(val, null);
        }

        /**
         *构造方法 根据传入的数据创建新结点
         * 并使新结点的引用指向前驱结点所指向的结点
         * 然后再使前驱结点的引用指向新建的结点
         */
        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node head = null;

    /**
     * 链表的迭代器
     */
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
            //先找 index 的前驱结点
            Node cur = head;
            for(int i = 0; i < index - 1; i++) {
                cur = cur.next;
            }
            cur.next = new Node(val, cur.next);
        }
    }

    @Override
    protected void earseInternal(int index) {

        if(index == 0) {
            head = null;
        } else if(index == 1){
            head.next = null;
        } else {
            Node cur = head;
            for (int i = 0; i < index - 1; i++) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
    }

    @Override
    public int get(int index) {
        Node cur = head;
        for(int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.val;
    }

    @Override
    public void set(int index, int val) {
        Node cur = head;
        for(int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.val = val;
    }

    @Override
    public Iterator iterator() {
        return new LinkedListIterator();
    }
}
