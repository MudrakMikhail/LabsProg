public class TestMyCharacter {
    public static void main(String[] args) {
        MyCharacter c1 = new MyCharacter('a');
        MyCharacter c2 = new MyCharacter('B');
        MyCharacter c3 = new MyCharacter('5');

        System.out.println("charValue(c1): " + c1.charValue()); // a
        System.out.println("compareTo(c1, c2): " + c1.compareTo(c2)); // отрицательное число

        System.out.println("equals(c1, c2): " + c1.equals(c2)); // false

        System.out.println("isDigit(c3): " + c3.isDigit()); // true
        System.out.println("isLetter('A'): " + MyCharacter.isLetter('A')); // true
        System.out.println("isLetterOrDigit('$'): " + MyCharacter.isLetterOrDigit('$')); // false
        System.out.println("isLowerCase('b'): " + MyCharacter.isLowerCase('b')); // true
        System.out.println("toUpperCase('b'): " + MyCharacter.toUpperCase('b')); // B
        System.out.println("toLowerCase('D'): " + MyCharacter.toLowerCase('D')); // d
    }
}
