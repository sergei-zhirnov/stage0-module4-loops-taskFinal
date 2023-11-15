package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int digit = 1;
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= cathetusLength; j++) {
                if (j == cathetusLength ||j == cathetusLength - i + 1 || (j < cathetusLength && j > cathetusLength - i + 1) ) {
                    System.out.print(cathetusLength - j + 1);
                } else {
                    System.out.print(" ");
                }
            }
            for (int k = 1; k < i; k++) {
                System.out.print(k + 1);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
