package chapter20Java8;

import java.util.Optional;

public class LearnOptionalDemo3Judge {
    public static void main(String[] args) {
        Optional<String> opt = Optional.of("PeterJXL");
        System.out.println(opt.isPresent());

        Optional<String> optOrNull = Optional.ofNullable(null);
        System.out.println(optOrNull.isPresent());
    }
}
