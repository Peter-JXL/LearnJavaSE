package chapter20Java8;

import java.util.Optional;

public class OptionalDemo4Execute {
    public static void main(String[] args) {
        Optional<String> opt = Optional.ofNullable("PeterJXL");
        opt.ifPresent(str -> System.out.println(str.length()));

        Optional<String> opt2 = Optional.ofNullable("PeterJXL");
        opt2.ifPresentOrElse(str -> System.out.println(str.length()), () -> System.out.println("is Null"));
    }
}
