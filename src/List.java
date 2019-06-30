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
