package day_54_list_and_set_continue;


import java.util.*;

public class SetAndListMethods {
    public static void main(String[] args) {

        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(5,1,3,2,4,6));

        Set<Integer> hashSet = new HashSet<>(Arrays.asList(5,1,3,2,4,6));

        Set<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(5,1,3,2,4,6));


        System.out.println(treeSet.equals(hashSet));
        System.out.println(treeSet.equals(linkedHashSet));

        List<Integer> arrayList = new ArrayList<>(Arrays.asList(5,1,3,2,4,6));
        List<Integer> linkedList = new LinkedList<>(Arrays.asList(5,1,3,2,4,6));

        System.out.println(arrayList.equals(linkedList));


        System.out.println("=========================================");

        treeSet.clear();

        linkedList.clear();

        System.out.println(treeSet);
        System.out.println(linkedList);


        System.out.println(treeSet.isEmpty());
        System.out.println(linkedList.isEmpty());


        Object [] obj1 = hashSet.toArray();
        Object [] obj2 = arrayList.toArray();

        System.out.println(Arrays.toString(obj1));
        System.out.println(Arrays.toString(obj2));
    }
}
