package day_54_list_and_set_continue;

import java.util.*;
import java.util.function.Predicate;

public class SetAndListPractice1 {

    public static void main(String[] args) {

        // Write a program to remove all even numbers form Set<Integer> using Iterator
        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,6,4,5,81, 43,12,28,21));

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()){

            Integer x = iterator.next();

            if (x % 2 ==0){
                iterator.remove();
            }
        }
        System.out.println(set);

        System.out.println("==============================================================");

        // task 2:
        // // Write a program to remove all even numbers form Set<Integer> using removeIf()

        Set<Integer> set2 = new HashSet<>(Arrays.asList(1,2,6,4,5,81, 43,12,28,21));

        // creating predicate         lambda expression
        Predicate<Integer> predicate = x -> x % 2 == 0;

        set2.removeIf(predicate);
        System.out.println(set2);

        System.out.println("============================================");

        Set<Integer> set3 = new HashSet<>(Arrays.asList(1,2,6,4,5,81, 43,12,28,21));
        // in the below example we will pass lambda expression directly into removeIf() method

        set3.removeIf(i -> i % 2 ==0);

        System.out.println(set3);

        System.out.println("==========================================================");

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,6,4,5,81, 43,12,28,21));

        Iterator<Integer>  iterator2 = list.iterator();

        while (iterator2.hasNext()){

            int x = iterator2.next();
            if (x % 2 ==0){
                iterator2.remove();
            }
        }
        System.out.println(list);

        System.out.println("===========================================");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,6,4,5,81, 43,12,28,21));


        list2.removeIf(t -> t % 2 ==0);
        System.out.println(list2);

    }
}
