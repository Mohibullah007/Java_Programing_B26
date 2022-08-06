package day61_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveWhileLooping {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 5, 6, 12, 6, 2, 35, 6, 3, 2, 1, 4, 5, 2));

        // TODO: Traditional loop with removing doesn't, because
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) < 5){
//                list.remove(i);
//            }
//        }
//        System.out.println(list);



//        for (int each : list){
//            if (each < 5){
//                list.remove(each);
//            }
//        }
//        System.out.println(list);

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()){
            if (it.next() <= 5){
                it.remove();
            }
        }
        System.out.println(list);

        System.out.println("------------------------------------------");


    }
}
