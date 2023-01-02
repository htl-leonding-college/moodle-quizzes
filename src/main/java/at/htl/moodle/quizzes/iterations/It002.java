package at.htl.moodle.quizzes.iterations;

public class It002 {
    public static void main(String[] args) {
        String result = "";

        for (char c = 'A'; c < 'C'; c++) {
            result = result + (int) c;
        }
        System.out.println(result);
    }
}


