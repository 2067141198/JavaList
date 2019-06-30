public interface List {

    /**
     * 头部插入
     * @param val 要插入的数字
     */
    void pushFront(int val);

    /**
     * 尾部插入
     * @param val 要插入的数字
     */
    void pushBack(int val);

    /**
     * 根据下表插入指定数字
     * @param index 给定的下标
     * @param val 需要插入的数字
     */
    void inset(int index, int val);
}
