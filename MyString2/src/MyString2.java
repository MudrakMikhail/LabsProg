public class MyString2 {
    private final char[] value;

    public MyString2(char[] chars) {
        this.value = new char[chars.length];
        System.arraycopy(chars, 0, this.value, 0, chars.length);
    }

    public MyString2 substring(int begin) {
        if (begin < 0 || begin > value.length)
            throw new IndexOutOfBoundsException("Index out of bounds");

        char[] subArray = new char[value.length - begin];
        for (int i = 0; i < subArray.length; i++) {
            subArray[i] = value[begin + i];
        }
        return new MyString2(subArray);
    }

    public MyString2 toUpperCase() {
        char[] upperCase = new char[value.length];
        for (int i = 0; i < value.length; i++) {
            upperCase[i] = Character.toUpperCase(value[i]);
        }
        return new MyString2(upperCase);
    }

    public char[] toChars() {
        char[] result = new char[value.length];
        System.arraycopy(value, 0, result, 0, value.length);
        return result;
    }

    public static MyString2 valueOf(boolean b) {
        char[] chars = Boolean.toString(b).toCharArray();
        return new MyString2(chars);
    }
}
