public class TestMyInteger {
    public static void main(String[] args) {
        MyInteger num1 = new MyInteger(7);
        MyInteger num2 = new MyInteger(8);
        MyInteger num3 = new MyInteger(1);

        System.out.println("Тест методов:");

        System.out.println("num1.isEven() -> " + num1.isEven());
        System.out.println("num1.isOdd() -> " + num1.isOdd());
        System.out.println("num1.isPrime() -> " + num1.isPrime());

        System.out.println("num2.isEven() -> " + num2.isEven());
        System.out.println("num2.isOdd() -> " + num2.isOdd());
        System.out.println("num2.isPrime() -> " + num2.isPrime());

        System.out.println("num3.isPrime() -> " + num3.isPrime());

        System.out.println("\nСтатические методы с int:");
        System.out.println("MyInteger.isEven(4) -> " + MyInteger.isEven(4));
        System.out.println("MyInteger.isOdd(5) -> " + MyInteger.isOdd(5));
        System.out.println("MyInteger.isPrime(11) -> " + MyInteger.isPrime(11));

        System.out.println("\nСтатические методы с MyInteger:");
        System.out.println("MyInteger.isEven(num1) -> " + MyInteger.isEven(num1));
        System.out.println("MyInteger.isOdd(num2) -> " + MyInteger.isOdd(num2));
        System.out.println("MyInteger.isPrime(num1) -> " + MyInteger.isPrime(num1));

        System.out.println("\nМетод equals:");
        System.out.println("num1.equals(7) -> " + num1.equals(7));
        System.out.println("num1.equals(num2) -> " + num1.equals(num2));

        System.out.println("\nПарсинг строк:");
        char[] chArray = {'1', '2', '3'};
        System.out.println("MyInteger.parseInt(chArray) -> " + MyInteger.parseInt(chArray));
        System.out.println("MyInteger.parseInt(\"456\") -> " + MyInteger.parseInt("456"));
    }
}