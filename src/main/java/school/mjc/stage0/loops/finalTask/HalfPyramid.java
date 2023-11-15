package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public static void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= cathetusLength; j++) {
                if (j == cathetusLength || j == cathetusLength - i + 1 || (j < cathetusLength && j > cathetusLength - i + 1)  ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        printHalfPyramid(8);
    }
}
