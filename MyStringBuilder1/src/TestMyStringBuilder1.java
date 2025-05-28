public class TestMyStringBuilder1 {
    public static void main(String[] args) {
        MyStringBuilder1 builder = new MyStringBuilder1("Hello");

        builder.append(new MyStringBuilder1(" World"));
        builder.append(2025);

        System.out.println("Length: " + builder.length()); // 17
        System.out.println("Char at 6: " + builder.charAt(6)); // W

        MyStringBuilder1 lower = new MyStringBuilder1("AbcDef");
        System.out.println("Lower case: " + lower.toLowerCase().toString());

        MyStringBuilder1 sub = builder.substring(0, 5);
        System.out.println("Substring: " + sub.toString());

        System.out.println("Final string: " + builder.toString());
    }
}
