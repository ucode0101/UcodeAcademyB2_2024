package day_18_nested_loop_arrays_intro;

public class Review {

    public static void main(String[] args) {

        String str ="java";

        // what is the difference between charAt() and indexOf()?

        char ch = str.charAt(2); // returns character at the give index as char 2 -> 'v'
        System.out.println(ch);

        int num = str.indexOf('v'); // returns the index of given char as an in 'v' -> 2
        System.out.println(num);

        // what is the difference between substring() and charAt()
        String firstHalf = str.substring(0,2);
        System.out.println(firstHalf);

        // take from index 1 to the end
        String fromIndexOne = str.substring(1);
        System.out.println(fromIndexOne);


        // what is the difference between indexOf() and lastIndexOf()
        int firstA = str.indexOf('a'); // it returns the index/position of first a
        System.out.println(firstA);

        int lastA = str.lastIndexOf('a'); // it returns the last index of a
        System.out.println(lastA);



       // what is the difference between replace(), replaceFirst() and replaceAll()?
        String replaceFirstAToB = str.replaceFirst("a","b");
        System.out.println(replaceFirstAToB);

        String replaceAllAtoB = str.replace("[jv]","b");
        System.out.println(replaceAllAtoB);

        String replaceAll = str.replaceAll("[jv]","b");
        System.out.println(replaceAll);



        // replace() -> replace all matching old values with new/given value



    }
}
