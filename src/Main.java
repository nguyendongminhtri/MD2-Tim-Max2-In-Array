import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(4);
        integerList.add(3);
        integerList.add(7);
        integerList.add(10);
        integerList.add(10);
        int max = Integer.MIN_VALUE;
        int max2 = max;
//        int index = 0;
//        int index2 = 0;
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) > max) {
                max2 = max;
                max = integerList.get(i);
            }
            if (integerList.get(i) < max && integerList.get(i) > max2) {
                max2 = integerList.get(i);
            }
        }

        System.out.println("The largest property value in the list is " + max);
        System.out.println("=========================================");
        System.out.println("The largest property value in the list is " + max2);
    }
}
