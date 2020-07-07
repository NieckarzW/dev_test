import lombok.Data;

import java.util.*;

@Data
public class InputIntegers {

    private LinkedList<Integer> integers;
    private LinkedList<Integer> intSorted;
    private Scanner sc = new Scanner(System.in);
    private int choice;

    public InputIntegers sortSetIntigers() {
        Set<Integer> integerSet = new HashSet<>(integers);
        LinkedList<Integer> sortedInt = new LinkedList<>(integerSet);
        Collections.sort(sortedInt);
        this.intSorted = sortedInt;
        return this;
    }

    public InputIntegers getUserInput() {
        LinkedList<Integer> integers = new LinkedList<>();
        boolean flag = true;
        while (flag) {
            System.out.println("Podaj liczbę całkowitą lub dowolną literę by zakończyć: ");
            if (sc.hasNextInt()) {
                integers.add(sc.nextInt());
            } else {
                flag = false;
            }
        }
        sc.close();
        this.integers = integers;
        return this;
    }

    public LinkedList<Integer> getIntegersSorted() {
        LinkedList<Integer> integerLinkedList = integers;
        Collections.sort(integerLinkedList);
        return integerLinkedList;
    }

    public int reader() {
        System.out.println("Podaj liczbę: ");
        choice = sc.nextInt();
        return choice;
    }

    public LinkedList<String> task2() {
        LinkedList<String> strings = new LinkedList<>();
        LinkedList<Integer> integerLinkedList = getIntegersSorted();
        for (int i = 0; i < integerLinkedList.size() - 1; i++) {
            for (int z = i + 1; z < integerLinkedList.size(); z++) {
                if ((integerLinkedList.get(i) + integerLinkedList.get(z) == 13))
                    if (integerLinkedList.get(i) < integerLinkedList.get(z))
                        strings.add(integerLinkedList.get(i) + " " + integerLinkedList.get(z));
                    else
                        strings.add(integerLinkedList.get(z) + " " + integerLinkedList.get(i));
            }
        }
        return strings;
    }
}
