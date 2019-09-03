import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Инициализация
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 1, 2, 4, 4, 10));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(10, 3, 5, 4, 5, 7, 7, 7));
        List<Double> list3 = new ArrayList<>(Arrays.asList(10.5, 14.2, 7D, 3D));
        List<Double> list4 = new ArrayList<>();
        List<Double> list5 = new ArrayList<>(Arrays.asList(10.5, 1.2, 7D));


        UtilityClass<Integer, Integer> twoIntegerLists = new UtilityClass<>(list1, list2);
        UtilityClass<Double, Integer> doubleAndIntegerLists = new UtilityClass<>(list3, list2);
        UtilityClass<Integer, Double> integerAndDoubleLists = new UtilityClass<>(list2, list3);
        UtilityClass<Double, Double> listsWithError = new UtilityClass<>(list4, list3);
        UtilityClass<Double, Double> twoDoubleLists = new UtilityClass<>(list5, list3);

        //Объединение
        System.out.println("Объединение");
        System.out.println(twoIntegerLists.uniteLists());
        System.out.println(doubleAndIntegerLists.uniteLists());
        System.out.println(integerAndDoubleLists.uniteLists());
        System.out.println(listsWithError.uniteLists());
        System.out.println(twoDoubleLists.uniteLists());


        //Пересечение
        System.out.println("Пересечение");
        System.out.println(twoIntegerLists.intersectLists());
        System.out.println(doubleAndIntegerLists.intersectLists());
        System.out.println(integerAndDoubleLists.intersectLists());
        System.out.println(listsWithError.intersectLists());
    }
}
