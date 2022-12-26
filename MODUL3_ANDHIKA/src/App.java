import java.util.Scanner;
import java.util.InputMismatchException;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        Calculation calculation = new Calculation();

        do {
            try {
              System.out.println("Menu:");
              System.out.println("1. Hitung luas persegi");
              System.out.println("2. Hitung luas lingkaran");
              System.out.println("3. Hitung luas trapesium");
              System.out.println("0. Keluar");
              System.out.print("Masukkan pilihan: ");
              int choice = scanner.nextInt();
              switch (choice) {
                case 1:
                  System.out.print("Masukkan sisi persegi: ");
                  double side = scanner.nextDouble();
                  calculation.setSquare(side);
                  break;
                case 2:
                  System.out.print("Masukkan jari-jari lingkaran: ");
                  double radius = scanner.nextDouble();
                  calculation.setCircle(radius);
                  break;
                case 3:
                  System.out.print("Masukkan sisi atas: ");
                  double a = scanner.nextDouble();
                  System.out.print("Masukkan sisi bawah: ");
                  double b = scanner.nextDouble();
                  System.out.print("Masukkan tinggi: ");
                  double t = scanner.nextDouble();
                  calculation.setTrapezoid(a, b, t);
                  break;
                case 0:
                  repeat = false;
                  break;
                default:
                  System.out.println("Pilihan tidak valid!");
                  break;
              }
            } catch (InputMismatchException e) {
              System.out.println("Input tidak valid!");
              scanner.nextLine();
            } catch (IllegalArgumentException e) {
              System.out.println(e.getMessage());
            }
          } while (repeat);
    }
}
