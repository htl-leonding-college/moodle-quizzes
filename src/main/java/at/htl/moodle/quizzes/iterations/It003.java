package at.htl.moodle.quizzes.iterations;

public class It003 {
    public static void main(String[] args) {
        //angabe();
        loesung();

    }

    public static void angabe() {
        String text = "Der Aal, das Haar, der Saal, der Staat";

        int count = 0;

        // find sequences of same character
        for(int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == text.charAt(i + 1)) {
                count++;
            }
        }
        System.out.println(count);

    }

    public static void loesung() {
        String text = "Der Aal, das Haar, der Saal, der Staat";

        int count = 0;

        // find sequences of same character
        for (int i=0;i<text.length()-1;i++) {
            if (text.charAt(i) == text.charAt(i + 1)) {
                count++;
            }
        }
        System.out.println(count);
    }
}


