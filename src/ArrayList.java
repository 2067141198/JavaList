public class ArrayList extends AbstractList implements List {
    private int[] array;

    ArrayList() {
        this(16);
    }

    ArrayList(int val) {
        array = new int[val];
    }

    /**
     * 顺序表的迭代器
     */
    private class ArrayListIterator implements Iterator {
        private int currentIndex;

        private ArrayListIterator(int val) {
            this.currentIndex = val;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < size();
        }

        @Override
        public int next() {
            return array[currentIndex++];
        }
    }

    /**
     *
     * 根据下标插入要插入的数据
     * @param index 要出入位置的下标
     * @param val 要插入的数据
     */
    @Override
    protected void insertInternal(int index, int val) {
        ensureCapacity();
        for(int i = size(); i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = val;
    }

    @Override
    protected void earseInternal(int index) {
        for(int i = index; i < size(); i++) {
            array[i] = array[i + 1];
        }
    }

    @Override
    public int get(int index) {
        return array[index];
    }

    @Override
    public void set(int index, int val) {
        array[index] = val;
    }

    @Override
    public Iterator iterator() {
        return new ArrayListIterator(0);
    }

    /**
     * 保证顺序表的容量是够用的
     * 如果不够用，进行扩容，扩容为当前容量的2倍
     */
    private void ensureCapacity() {
        if(size() < array.length) {
            return;
        }

        int[] newArray = new int[size() * 2];

        for(int i = 0; i < size(); i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }
}
