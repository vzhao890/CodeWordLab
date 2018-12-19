public class Runner
{
    public static void main(String[] args)
    {
        CodeWordChecker newChecker = new CodeWordChecker(1,20,"carrot");
        CodeWordChecker newChecker2= new CodeWordChecker("dio");

        System.out.println(newChecker.isValid("carrotcake"));
        System.out.println(newChecker.isValid("cake"));
        System.out.println(newChecker.isValid("kono dio da"));

        System.out.println(newChecker.isValid("you expected it true but it is I dio"));
        System.out.println(newChecker.isValid("thanos"));
        System.out.println(newChecker.isValid("verylongstringthatwillreturnfalse"));
    }
}
