 public class piramida {
     public static void main(String[] args) {
         int rows = 7;
         int count = rows - 1;
         for (int i = 1; i <= rows; i++) {
             for (int j = 1; j <= count; j++)
                 System.out.print("  ");
             count--;
             int number = 1;
             for (int k = 1; k <= 2 * i - 1; k++) {
                 System.out.print(" " + number);
                 number++;
             }
             System.out.println();

            }
     }
}



