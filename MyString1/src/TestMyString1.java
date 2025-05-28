public class TestMyString1 {
    public static void main(String[] args) {
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        MyString1 str = new MyString1(chars);

        System.out.println("Length: " + str.length()); // 5
        System.out.println("Char at 1: " + str.charAt(1)); // e

        MyString1 sub = str.substring(0, 3);
        System.out.println("Substring: " + new String(sub.toChars())); // Hel

        MyString1 lower = str.toLowerCase();
        System.out.println("Lower case: " + new String(lower.toChars())); // hello

        MyString1 number = MyString1.valueOf(12345);
        System.out.println("Number as string: " + new String(number.toChars())); // 12345

        MyString1 same = new MyString1(new char[]{'H', 'e', 'l', 'l', 'o'});
        System.out.println("Equals: " + str.equals(same)); // true
    }
}
