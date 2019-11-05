public class rocket {
    public static int SIZE = 0;

    static void top() {
        int rows = 6;
        int count = rows - 1;
        for (int i = 2; i <= rows + SIZE * 4; i++) {
            for (int j = 1; j <= count + SIZE * 4; j++)
            System.out.print(" ");
            count--;
            for (int k = 1; k <= i - 1; k++) {
                System.out.print("/");
            }
            System.out.print("**");
            for (int k = 1; k <= i - 1; k++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }

    static void divider() {
        int rows, i;

        for(rows = 1; rows <= 1; rows++) {
            System.out.print("+");
            for(i = 0; i <= 5 + SIZE * 4; i++) {
                System.out.print("=*");
            }
            System.out.print("+");
            System.out.println();
        }
    }

    static void bodyTopHalf() {
        int rows, dot, x, i = 0, s;

        for (rows = 1; rows <= 3 + SIZE * 2; rows++) {
                for (x = 6; x >= 6; x--) {
                    System.out.print("|");
                }
                for (dot = 2; dot >=rows - SIZE * 2; dot--) {
                    System.out.print(".");
        }
                for (s = 1; s <= rows; s++) {
                    System.out.print("/\\");
                }
                for (dot = 3; dot >= i - SIZE * 4; dot--) {
                    System.out.print(".");
                }
                for (s = 1; s <= rows; s++) {
                    System.out.print("/\\");
                }
                for (dot = 2; dot >= rows - SIZE * 2; dot--) {
                    System.out.print(".");
                }
                for (x = 6; x >= 6; x--) {
                    System.out.print("|");
                }
                i = i + 2;
                System.out.println();
            }
    }

    static void bodyBottomHalf() {
        int rows, x, dot, s, t = 0;

        for (rows = 1; rows <= 3 + SIZE * 2; rows++) {
                for (x = 6; x >= 6; x--) {
                    System.out.print("|");
                }
                for (dot = 2; dot <= rows + SIZE / 2; dot++) {
                    System.out.print(".");
                }
                for (s = 3 + SIZE * 2; s >= rows; s--) {
                    System.out.print("\\/");
                }
                for (dot = 1; dot >= t + 2; dot--) {
                    System.out.print(".");
                }
                for (s = 3 + SIZE * 2; s >= rows; s--) {
                    System.out.print("\\/");
                }
                for (dot = 2; dot <= rows + SIZE / 2; dot++) {
                    System.out.print(".");
                }
                for (x = 6; x >= 6; x--) {
                    System.out.print("|");
                }
                t = t - 2;
                System.out.println();
            }
    }

    public static void main(String[] args) {
        top();
        divider();
        bodyTopHalf();
        bodyBottomHalf();
        divider();
        bodyBottomHalf();
        bodyTopHalf();
        divider();
        top();
    }
}
