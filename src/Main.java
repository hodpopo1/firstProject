import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // קבועים - מחירי הנסיעה
        double FIRST_PRICE = 10.2;       // מחיר ראשוני
        double PRICE_PER_KM = 1.3;      // מחיר לקילומטר
        double PRICE_PER_SUITCASE = 2.0; // מחיר למזוודה

        int km;             // כמות קילומטרים
        int suitcase;       // כמות מזוודות
        double totalPrice;  // מחיר סופי

        // קלט מהמשתמש
        System.out.println("Count of KM: ");
        km = scanner.nextInt();

        System.out.println("Count of suitcases: ");
        suitcase = scanner.nextInt();

        // חישוב מחיר סופי
        totalPrice = FIRST_PRICE + (km * PRICE_PER_KM) + (suitcase * PRICE_PER_SUITCASE);

        // הדפסה של מחיר סופי
        System.out.println("The total price is: " + totalPrice);

        scanner.close(); // סגירת הסורק
    }
}