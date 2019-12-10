package chen.craft.algorithms.sort.selection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Draven
 * 2019/12/6 22:14
 */
public class SelectionSort{

    public static void sort(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            int min = list.get(i);
            for(int j=i+1;j<list.size();j++){
                if(min>list.get(j)){
                    int temp = min;
                    min = list.get(j);
                    list.set(j, temp);
                    list.set(i, min);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(9);
        list.add(6);
        list.add(5);
        list.add(1);
        list.add(15);
        list.add(1);
        list.add(10);

        sort(list);
        System.out.println(list);
    }

}
