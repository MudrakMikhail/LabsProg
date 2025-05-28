public class TestMyString2 {
    public static void main(String[] args) {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        MyString2 str = new MyString2(chars);

        System.out.println("Original: " + new String(str.toChars())); // hello

        MyString2 upper = str.toUpperCase();
        System.out.println("Upper case: " + new String(upper.toChars())); // HELLO

        MyString2 sub = str.substring(2);
        System.out.println("Substring: " + new String(sub.toChars())); // llo

        MyString2 boolStr1 = MyString2.valueOf(true);
        System.out.println("Boolean true: " + new String(boolStr1.toChars())); // true

        MyString2 boolStr2 = MyString2.valueOf(false);
        System.out.println("Boolean false: " + new String(boolStr2.toChars())); // false
    }
}
