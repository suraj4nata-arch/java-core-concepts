package Java8Features;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        // Step 1: Create Optional (value can be null)
        String input = "John"; // try changing this to null   //normal variable input
        Optional<String> opt = Optional.ofNullable(input);  //wrap 'input' variable in Optional

        // Step 2: isPresent() → check value exists
        if (opt.isPresent()) {
            System.out.println("Value is present");
        } else {
            System.out.println("Value is NOT present");
        }

        // Step 3: get() → get value (only if present)
        if (opt.isPresent()) {
            String value = opt.get();
            System.out.println("Value using get(): " + value);
        }

        // Step 4: orElse() → default value if empty
        String result = opt.orElse("Default Value");  //if value is empty, use default
        System.out.println("Using orElse(): " + result);

        // Step 5: ifPresent() → perform action if value exists
        opt.ifPresent(val -> System.out.println("Using ifPresent(): " + val)); //If value exists, just use it directly

        // Step 6: map() → transform value
        Optional<String> upper = opt.map(val -> val.toUpperCase()); //if value exists, convert to uppercase
        System.out.println("Using map(): " + upper.orElse("No value"));

        // Step 7: flatMap() → return Optional inside Optional
        Optional<String> flat = opt.flatMap(val -> Optional.of(val + ", Welcome!"));
        System.out.println("Using flatMap(): " + flat.orElse("No value"));
    }
}