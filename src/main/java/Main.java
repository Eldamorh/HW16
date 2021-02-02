import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {



    public static void main(String[] args) {

        Integer[] arr = new Integer[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        CollectionUtils.reverseArray(arr);
        for(Object o : arr){
            System.out.println(o);
        }

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        List<Integer> list2 = new ArrayList<>();
        System.out.println(CollectionUtils.isEmpty(list1));
        System.out.println(CollectionUtils.isEmpty(list2));
        System.out.println(CollectionUtils.isEmpty(null));

    }
}
