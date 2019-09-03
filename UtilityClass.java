import java.util.*;

public class UtilityClass<T extends Number, U extends Number> {
    private List<T> list1;
    private List<U> list2;

    public UtilityClass(List<T> list1, List<U> list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    public Set<? super Number> uniteLists() {
        if (!isEmpty()) {
            Set<? super Number> set = new HashSet<>();
            for (T element : list1) {
                if (!set.contains(element)) {
                    set.add(element);
                }
            }
            boolean areValuesEqual = false;
            for (U element2: list2) {
                for (T element1: list1) {
                    if (element2.doubleValue() == element1.doubleValue()){
                        areValuesEqual = true;
                    }
                }
                if (!areValuesEqual) {
                    set.add(element2);
                }
                areValuesEqual = false;
            }
            return set;
        }
        return Collections.emptySet();
    }

    public Set<? super Number> intersectLists() {
        Set<? super Number> set = new HashSet<>();
        if (!isEmpty()) {
            for (T element1 : list1) {
                for (U element2 : list2) {
                    if (element1.doubleValue() == element2.doubleValue()) {
                        set.add(element1);
                    }
                }
            }
        }
        return set;
    }

    /*public Set<? super Number> uniteLists() {
        if (!isEmpty()) {
            Set<? super Number> set = new HashSet<>();
            set.addAll(list1);
            set.addAll(list2);
            return set;
        }
        return Collections.emptySet();
    }

    public Set<? super Number> intersectLists() {
        Set<? super Number> set = new HashSet<>();
        if (!isEmpty()) {
            for (T element : list1) {
                if (list2.contains(element)) {
                    set.add(element);
                }
            }
        }
        return set;
    }*/

    public boolean isEmpty() {
        if (Objects.isNull(list1) || Objects.isNull(list2) || list1.size() == 0 || list2.size() == 0) {
            System.out.println("Как минимум один из двух листов пуст. Операция прекращена");
            return true;
        }
        return false;
    }
}

