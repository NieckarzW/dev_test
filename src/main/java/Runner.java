import java.util.Collections;

public class Runner {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    InputIntegers inputIntegers = new InputIntegers();
    String choice = null;

    do {
      System.out.println("Wybierz nr zadania 1,2 lub 0 by zakończyć: ");
      choice = inputIntegers.reader();
      if (choice.equals("1")) {
        inputIntegers.getUserInput();
        inputIntegers.sortSetIntigers();

        sb.append(inputIntegers.getIntSorted());
        sb.append("\ncount: " + inputIntegers.getIntegers().size());
        sb.append("\ndistinct: " + inputIntegers.getIntSorted().size());
        sb.append("\nmin: " + Collections.min(inputIntegers.getIntegers()));
        sb.append("\nmax: " + Collections.max(inputIntegers.getIntegers()));

        System.out.println(sb);
      } else if (choice.equals("2")) {
        inputIntegers.getUserInput();
        System.out.println("task 2 " + inputIntegers.getIntegers());
        for (String s : inputIntegers.task2()) {
          sb.append("\n" + s);
        }
        System.out.println(sb);
      } else {
        System.out.println("Zły wybór, jeszcze raz");
      }

    } while (!choice.equals("0"));
  }
}
