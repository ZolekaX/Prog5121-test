import java.util.Scanner;

public class RunApplication {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter console type (PS5 / XBOX / SWITCH): ");
String type = sc.nextLine();

System.out.print("Enter store name: ");
String store = sc.nextLine();

System.out.print("Enter total amount of sales: ");
int total = sc.nextInt();

ConsoleSales sale = new ConsoleSales(type, store, total);

System.out.println("\n--- CONSOLE SALES REPORT ---");
sale.printReport();

}
}
