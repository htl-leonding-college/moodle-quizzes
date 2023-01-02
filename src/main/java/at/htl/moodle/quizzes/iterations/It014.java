package at.htl.moodle.quizzes.iterations;

public class It014 {
    public static void main(String[] args) {
        String text = "abcdefg";
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) % 2 == 0) {
                result = result + text.charAt(i);
            }
        }
        System.out.println(result);
    }
}


