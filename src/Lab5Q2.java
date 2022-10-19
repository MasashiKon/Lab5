import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Lab5Q2 {
    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>();
        List<Integer> modifiedList = new ArrayList<>();
        Random randomNum = new Random();

        for (int i = 1; i <= 10; i++) {
            originalList.add(randomNum.nextInt(51));
        }

        System.out.println(originalList);

        Iterator<Integer> iterator = originalList.iterator();

        while(iterator.hasNext()) {
            modifiedList.add(iterator.next());
        }

        modifiedList.set(modifiedList.size() - 1, modifiedList.get(modifiedList.size() - 1) - 5);

        System.out.println(modifiedList);
    }
}
