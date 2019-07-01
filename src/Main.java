public class Main {
    public static void testList(List list) {
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.pushBack(10);
        list.pushBack(20);
        list.pushBack(30);
        list.insert(3, 5); //3 2 1 5 10 20 30
        list.popFront();
        list.popBack(); // 2 1 5 10 20
        list.earse(2); //2 1 10 20
        list.set(2, 6); // 2 1 6 20

        Iterator it = list.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(list.get(3)); // 6
    }
    public static void main(String[] args) {
        testList(new ArrayList());
        System.out.println("===");
        testList(new LinkedList());
    }
}
