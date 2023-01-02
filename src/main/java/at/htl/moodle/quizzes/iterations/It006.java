package at.htl.moodle.quizzes.iterations;

public class It006 {
    public static void main(String[] args) {
        int counter = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 2; k++) {
                    counter ++;
                }
            }
        }
        System.out.println(counter);
    }
}


