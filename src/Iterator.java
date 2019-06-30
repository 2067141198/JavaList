/**
 * 迭代器接口
 */
public interface Iterator {

    /**
     * 判断迭代器是否走到了顺序表的最后一个元素
     * @return true 表示没有走到最后一个元素  false 表示走到了最后一个元素
     */
    boolean hasNext();

    /**
     * 返回迭代器所在元素的值，并使迭代器向后走一步
     * @return 迭代器所在的值
     */
    int next();
}
