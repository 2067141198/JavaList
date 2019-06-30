public class Main {
    public static void testList(List list) {
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.pushBack(10);
        list.pushBack(20);
        list.pushBack(30);
        list.insert(3, 5);

        Iterator it = list.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
    public static void main(String[] args) {
        testList(new ArrayList());
    }
}
