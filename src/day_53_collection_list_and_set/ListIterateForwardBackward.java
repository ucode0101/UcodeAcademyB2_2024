package day_53_collection_list_and_set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIterateForwardBackward {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

        ListIterator<Integer> iterator = list.listIterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }

        System.out.println("\n================================");

        while (iterator.hasPrevious()){
            System.out.print(iterator.previous());
        }
    }
}
