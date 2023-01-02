package at.htl.moodle.quizzes.iterations;


/**
 * https://edufs.edu.htl-leonding.ac.at/moodle/question/bank/editquestion/question.php?returnurl=%2Fquestion%2Fedit.php%3Fcourseid%3D3760%26cat%3D10604%252C196199%26qpage%3D0%26recurse%3D1%26showhidden%3D1%26qbshowtext%3D0&courseid=3760&id=43789
 * ID number (in moodle): it-001
 */
public class It001 {

    public static void main(String[] args) {
        int number = 10;
        int count = 0;

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(i * j + 1);
                count++;   // nicht in Angabe
            }
        }
        System.out.println(count);   // nicht in Angabe
    }

}


