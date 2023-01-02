package at.htl.moodle.quizzes.iterations;

public class It016 {
    public static void main(String[] args) {
        String numbers = "12345";
        String weight = "10101";
        int x = 0;

        for (int i = 0; i < numbers.length(); i++) {
            x += (numbers.charAt(i) - '0') * (weight.charAt(i) - '0');
        }
        System.out.println(x);
    }
}


