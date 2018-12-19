public class CodeWordChecker {
    private int min;
    private int max;
    private String ans;

    public CodeWordChecker(int min, int max, String c) {
        this.min = min;
        this.max = max;
        ans = c;
    }

    public CodeWordChecker(String d) {
        ans = d;
        min = 6;
        max = 20;
    }

    public boolean isValid(String guess) {
        if (guess.length() < this.min || guess.length() > this.max) {
            return false;
        } else if (guess.contains(ans) == true) {
            return false;
        } else {
            return true;

        }

    }
}