package Java8Features;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class BuiltInFunctionalInterfaceInLambda {

    public static void main(String[] args) {

        // 1. Function → input → output
        Function<Integer, Integer> square = x -> x * x;
        System.out.println("Square: " + square.apply(5)); // 25

        // 2. Predicate → yes/no (boolean)
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println("Is Even: " + isEven.test(4)); // true

        // 3. Consumer → takes input, no return
        Consumer<String> print = x -> System.out.println("Print: " + x);
        print.accept("Hello");

        // 4. Supplier → no input, gives output
        Supplier<Integer> giveRandom = () -> 90;
        System.out.println("Supplier Value: " + giveRandom.get());
    }
}