public class MyStringBuilder2 {
    private StringBuilder value;
    public MyStringBuilder2() {
        this.value = new StringBuilder();
    }
    public MyStringBuilder2(char[] chars) {
        if (chars == null) {
            this.value = new StringBuilder();
        } else {
            this.value = new StringBuilder(new String(chars));
        }
    }
    public MyStringBuilder2(String s) {
        if (s == null) {
            this.value = new StringBuilder();
        } else {
            this.value = new StringBuilder(s);
        }
    }
    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        if (s == null) {
            throw new IllegalArgumentException("Cannot insert null.");
        }
        value.insert(offset, s.toString());
        return this;
    }
    public MyStringBuilder2 reverse() {
        value.reverse();
        return this;
    }
    public MyStringBuilder2 substring(int begin) {
        if (begin < 0 || begin > value.length()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return new MyStringBuilder2(value.substring(begin));
    }
    public MyStringBuilder2 toUpperCase() {
        for (int i = 0; i < value.length(); i++) {
            value.setCharAt(i, Character.toUpperCase(value.charAt(i)));
        }
        return this;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
