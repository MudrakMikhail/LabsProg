public class MyString1 {
    private char[] value;

    public MyString1(char[] chars) {
        this.value = new char[chars.length];
        System.arraycopy(chars, 0, this.value, 0, chars.length);
    }

    public char charAt(int index) {
        if (index < 0 || index >= value.length)
            throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + value.length);
        return value[index];
    }

    public int length() {
        return value.length;
    }

    public MyString1 substring(int begin, int end) {
        if (begin < 0 || end > value.length || begin > end)
            throw new IndexOutOfBoundsException();

        char[] subArray = new char[end - begin];
        for (int i = 0; i < subArray.length; i++) {
            subArray[i] = value[begin + i];
        }
        return new MyString1(subArray);
    }

    public MyString1 toLowerCase() {
        char[] lowerCase = new char[value.length];
        for (int i = 0; i < value.length; i++) {
            lowerCase[i] = Character.toLowerCase(value[i]);
        }
        return new MyString1(lowerCase);
    }

    public static MyString1 valueOf(int i) {
        return new MyString1(Integer.toString(i).toCharArray());
    }

    public char[] toChars() {
        char[] result = new char[value.length];
        System.arraycopy(value, 0, result, 0, value.length);
        return result;
    }

    public boolean equals(MyString1 obj) {
        if (obj == null || obj.length() != this.length())
            return false;

        for (int i = 0; i < value.length; i++) {
            if (value[i] != obj.charAt(i))
                return false;
        }
        return true;
    }
}
