/**
 * 线性表抽象类，在这里实现共有方法
 */
public abstract class AbstractList implements List {
    /**
     * 线性表当前数据的个数
     */
    private int size = 0;

    /**
     * 内部使用，根据下标插入指定数据
     * 一定保证 index 是不会出错
     * @param index 要出入位置的下标
     * @param val 要插入的数据
     */
    protected abstract void insertInternal(int index, int val);

    /**
     * 内部使用，根据下标删除数据
     * @param index 要删除的数据
     */
    protected abstract void earseInternal(int index);

    @Override
    public void pushFront(int val) {
        insert(0, val);
    }

    @Override
    public void pushBack(int val) {
        insert(size, val);
    }

    @Override
    public void insert(int index, int val) {
        if(index < 0 || index > size) {
            System.out.println("下标错误！");
            return;
        }

        insertInternal(index, val);
        size++;
    }

    @Override
    public void popFront() {
        earse(0);
    }

    @Override
    public void popBack() {
        earse(size);
    }

    @Override
    public void earse(int index) {
        if(index < 0 || index > size) {
            System.out.println("下标错误！");
            return;
        }

        earseInternal(index);
        size--;
    }

    @Override
    public int size() {
        return size;
    }
}
