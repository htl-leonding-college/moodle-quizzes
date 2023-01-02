package at.htl.moodle.quizzes.iterations;

public class It011 {
    public static void main(String[] args) {
        String text = "Lass ja das Ölfass Alaskas";
        char c = 'a';
        int result = 0;

        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == c) {
                result ++;
            }
        }
        System.out.println(result);
    }
}


