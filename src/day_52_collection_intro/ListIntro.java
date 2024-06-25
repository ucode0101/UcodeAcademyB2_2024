package day_52_collection_intro;

import java.util.*;

public class ListIntro {

    public static void main(String[] args) {

        // Regular way to create ArrayList
        ArrayList<Integer> numList1 = new ArrayList<>();

        // adding element/item in the list
        numList1.add(99);

        // accessing/printing element from arraylist/list
        System.out.println(numList1.get(0));


        //Reference type           Object type
          List<Integer> numList2 = new ArrayList<>();

          // adding element/item in the list
          numList2.add(1);

          // accessing/printing element from arraylist/list
        System.out.println(numList2.get(0));

        // adding multiple items at once
        numList2.addAll(Arrays.asList(1,2,3,4,5));

        // replacing element/item in ArrayList/List
        numList2.set(0, 88);


        System.out.println(numList2);

        System.out.println("=======================================================");

        // regular way
        LinkedList<Integer> nums = new LinkedList<>();

        // Reference Type
        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(23);
        System.out.println(linkedList.get(0));

        linkedList.addAll(Arrays.asList(2,2,2,2,5));

        linkedList.set(1, 77);

        System.out.println(linkedList);

        System.out.println("==============================");

        // Regular way
        Vector<Integer> num2 = new Vector<>();

        // Reference type
        List<Integer> vector = new Vector<>();

        vector.add(88);
        System.out.println(vector.get(0));

        vector.addAll(Arrays.asList(81,22,15,11));

        vector.set(1,999);

        System.out.println(vector);

        System.out.println("======================================");

        // Regular way
        Stack<Integer> num5 = new Stack<>();

        // Reference type
        List<Integer> stack = new Stack<>();

        stack.add(898);
        System.out.println(stack.get(0));

        stack.addAll(Arrays.asList(91,1,56,44,39));

        stack.set(2, 1010);

        System.out.println(stack);








    }
}
