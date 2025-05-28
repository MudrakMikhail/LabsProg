public class MyCharacter {
    private final char value;

    public MyCharacter(char value) {
        this.value = value;
    }

    public char charValue() {
        return value;
    }

    public int compareTo(MyCharacter anotherCharacter) {
        if (anotherCharacter == null) {
            throw new NullPointerException("Cannot compare with null");
        }
        return Character.compare(this.value, anotherCharacter.charValue());
    }

    public boolean equals(MyCharacter anotherCharacter) {
        return anotherCharacter != null && this.value == anotherCharacter.charValue();
    }

    public boolean isDigit() {
        return isDigit(this.value);
    }

    public static boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }

    public static boolean isLetter(char ch) {
        return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
    }

    public static boolean isLetterOrDigit(char ch) {
        return isLetter(ch) || isDigit(ch);
    }

    public static boolean isLowerCase(char ch) {
        return ch >= 'a' && ch <= 'z';
    }

    public static boolean isUpperCase(char ch) {
        return ch >= 'A' && ch <= 'Z';
    }

    public static char toUpperCase(char ch) {
        if (isLowerCase(ch)) {
            return (char)(ch - ('a' - 'A'));
        }
        return ch;
    }
    public static char toLowerCase(char ch) {
        if (isUpperCase(ch)) {
            return (char)(ch + ('a' - 'A'));
        }
        return ch;
    }
}
