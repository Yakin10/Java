import java.util.*;
import java.util.function.Predicate;

public class Collection {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(12);

        System.out.println(list);
        list.remove(1);
        System.out.println("List after removing element : "+list);
        System.out.println("Finding 12 in the list : "+list.contains(12));

        Integer[] array_int =  {12,56,47};

        List<Integer> list_int = new ArrayList<>();
        Collections.addAll(list_int, array_int);
        System.out.println(list_int);

        Integer[] newArray_list = list_int.toArray(new Integer[0]);

        for(int i=0; i<newArray_list.length;i++){
            System.out.println(newArray_list[i]);
        }

        List immutable = Collections.unmodifiableList(list_int);

        //immutable.add(25);
        System.out.println(immutable);

        Iterator<Integer> iterator = list_int.iterator();
        Predicate<Integer> isEven = n -> n % 2 ==0;
        System.out.println("Before Remove IF "+list_int);
        list_int.removeIf(isEven);
        System.out.println("After Remove IF"+list_int);
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
