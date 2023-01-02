package at.htl.moodle.quizzes.iterations;

import java.util.Scanner;

public class It013 {
    public static void main(String[] args) {
        String result = "";

        for (char c = 'A'; c < 'F'; c++) {
            result = result + (char) (c + 'a' - 'A');
        }
        System.out.println(result);
    }
}


