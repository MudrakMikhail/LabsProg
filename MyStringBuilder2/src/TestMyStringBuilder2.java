public class TestMyStringBuilder2 {
    public static void main(String[] args) {
        MyStringBuilder2 sb1 = new MyStringBuilder2();
        sb1.insert(0, new MyStringBuilder2("World"));
        System.out.println("After insert: " + sb1.toString()); // World

        MyStringBuilder2 sb2 = new MyStringBuilder2(new char[]{'H', 'e', 'l', 'l', 'o'});
        System.out.println("From char[]: " + sb2.toString()); // Hello

        MyStringBuilder2 sb3 = new MyStringBuilder2("Java");
        System.out.println("From String: " + sb3.toString()); // Java

        System.out.println("Reverse: " + sb3.reverse().toString()); // avaJ

        MyStringBuilder2 sub = sb2.substring(2);
        System.out.println("Substring from 2: " + sub.toString()); // llo

        System.out.println("To upper case: " + sb2.toUpperCase().toString()); // HELLO
    }
}
