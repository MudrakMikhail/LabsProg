public class MyStringBuilder1 {
    private StringBuilder value;

    public MyStringBuilder1(String s) {
        if (s == null) {
            value = new StringBuilder();
        } else {
            value = new StringBuilder(s);
        }
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        if (s == null) {
            return this;
        }
        value.append(s.toString());
        return this;
    }

    public MyStringBuilder1 append(int i) {
        value.append(i);
        return this;
    }

    public int length() {
        return value.length();
    }

    public char charAt(int index) {
        if (index < 0 || index >= length()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return value.charAt(index);
    }

    public MyStringBuilder1 toLowerCase() {
        for (int i = 0; i < value.length(); i++) {
            value.setCharAt(i, Character.toLowerCase(value.charAt(i)));
        }
        return this;
    }

    public MyStringBuilder1 substring(int begin, int end) {
        if (begin < 0 || end > value.length() || begin > end) {
            throw new IndexOutOfBoundsException("Invalid range");
        }
        return new MyStringBuilder1(value.substring(begin, end));
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
