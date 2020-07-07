import java.util.Collections;

public class Runner {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        InputIntegers inputIntegers = new InputIntegers();

        System.out.println("Wybierz nr zadania 1,2 lub 5 by zakończyć");
        int choice = inputIntegers.reader();


        switch (choice) {
            case 1:
                inputIntegers.getUserInput();
                inputIntegers.sortSetIntigers();

                sb.append(inputIntegers.getIntSorted());
                sb.append("\ncount: " + inputIntegers.getIntegers().size());
                sb.append("\ndistinct: " + inputIntegers.getIntSorted().size());
                sb.append("\nmin: " + Collections.min(inputIntegers.getIntegers()));
                sb.append("\nmax: " + Collections.max(inputIntegers.getIntegers()));

                System.out.println(sb);
                break;
            case 2:
                inputIntegers.getUserInput();
                System.out.println("task 2 " + inputIntegers.getIntegers());
                for (String s : inputIntegers.task2()) {
                    sb.append("\n" + s);
                }
                System.out.println(sb);
                break;
            default:
                System.out.println("Nie wybrałemś odpowiedniego numeru :)");
        }
    }
}
