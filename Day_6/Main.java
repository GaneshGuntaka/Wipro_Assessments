import java.util.*;
class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      ArrayList<Integer> l = new ArrayList<>();
      while (sc.hasNextInt()) {
            l.add(sc.nextInt());
      }
      System.out.println("List before sort: "+l);
      Collections.sort(l);
      System.out.println("List after sort: "+l);

    }
}