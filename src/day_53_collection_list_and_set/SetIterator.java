package day_53_collection_list_and_set;

import java.util.*;

public class SetIterator {

    public static void main(String[] args) {

        Set<String> cars = new HashSet<>();

        cars.addAll(Arrays.asList("BMW","Audi","Tesla","Toyota","Honda"));

        Iterator<String> iterator = cars.iterator();

        // iterate through and remove "Audi"
        while (iterator.hasNext()){

            String temp = iterator.next();
            System.out.println(temp);

           if (temp.equals("Audi")){
                iterator.remove();
           }
        }



        System.out.println(cars);

        System.out.println("====================================================");

        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

        Iterator<Integer> iterator2 = nums.iterator();

        while (iterator2.hasNext()){

            System.out.println(iterator2.next());
        }

        System.out.println("=====================================================");

        // iterate through the list using listIterator();
        Iterator<Integer> iterator3 = nums.listIterator();
        while (iterator3.hasNext()){
            System.out.println(iterator3.next());
        }

        System.out.println("=========================================\n");


        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        ListIterator<Integer> i = list.listIterator();

        // iterate through the list  using listIterator();

        while (i.hasNext()){
            System.out.print(i.next());
        }


        System.out.println("\n======================================");


        // iterate through the list backward using listIterator();
        while (i.hasPrevious()){
            System.out.print(i.previous());

        }







    }
}
