import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Searcher();
    }
    private static void Searcher() {
        Scanner sc = new Scanner(System.in);
        int minimum = 0;
        System.out.print("Please enter a maximum value in which to search;");
        int max = sc.nextInt();
        System.out.println("Please choose a number between 0 and " + max + ".");
        boolean found = false;
        int plays = 0;
        while (!found) {
            plays += 1;
            int mid = (minimum + max) / 2;
            if (mid > max || mid < minimum || minimum > max) {
                System.out.print("Désolé, il semblerait qu'il y ait un problème. Réessayez");
                return;
            }
            System.out.println("La valeur est-elle " + mid + "? [Y][+][-]");
            String res = sc.next();
            if (res.equals("Y")) {
                System.out.println("Super, il m'a fallut " + plays + " coups pour le trouver.");
                found = true;
            }
            else if (res.equals("+")) {
                minimum = mid;
            }
            else if (res.equals("-")) {
                max = mid;
            }
        }
    }
}

