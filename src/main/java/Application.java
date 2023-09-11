public class Application {
    /**
     * This main method is for manually testing your application
     * Changes made here will not affect test results
     * @param args
     */
    public static void main(String[] args) {
        Lab lab = new Lab();
        System.out.println("Should return true for valid url: https://revature.com");
        boolean res1 = lab.validate("https://revature.com");
        System.out.println(res1);
        System.out.println("Should return false for invalid url: abc123");
        boolean res2 = lab.validate("abc123");
        System.out.println(res2);
    }
}
