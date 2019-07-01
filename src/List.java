/**
 * 线性表接口
 */
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
     * @param val 需要插入的数字r
     */
    void insert(int index, int val);

    /**
     * 将开头的元素删除
     */
    void popFront();

    /**
     * 将末尾的元素删除
     */
    void popBack();

    /**
     *删除给定下标位置处的元素
     * @param index 要删除元素的下标
     */
    void earse(int index);

    /**
     * 返回给定下标位置处的值
     * @param index 给定的下标
     * @return index位置元素的值
     */
    int get(int index);

    /**
     * 将给定下标的元素的值进行修改
     * @param index 给定的下标
     * @param val 修改后的值
     */
    void set(int index, int val);

    /**
     * 返回线性表数据的个数
     * @return 线性表数据的个数
     */
    int size();

    /**
     * 返回当前线性表的迭代器
     * @return 迭代器，从线性表最开始执行
     */
    Iterator iterator();
}

