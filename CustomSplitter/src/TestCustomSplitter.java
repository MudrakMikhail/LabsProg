public class TestCustomSplitter {
    public static void main(String[] args) {
        String[] result1 = CustomSplitter.split("ab#12#453", "#");
        System.out.println("Test 1:");
        for (String part : result1) {
            System.out.println(part);
        }
        String[] result2 = CustomSplitter.split("a?b?gf#e", "[?#]");
        System.out.println("\nTest 2:");
        for (String part : result2) {
            System.out.println(part);
        }
    }
}
