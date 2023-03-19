package chapter20Java8;

import java.util.Optional;
import java.util.function.Predicate;

public class OptionalDemo7Map {
    public static void main(String[] args) {
        String name = "PeterJXL";
        Optional<String> nameOptional = Optional.ofNullable(name);
        Optional<Integer> integerOptional = Optional.ofNullable(name.length());
        integerOptional = nameOptional.map(String::length);

        String password = "Password";
        Optional<String> opt = Optional.ofNullable(password);

        Predicate<String> len6 = pwd -> pwd.length() > 6;
        Predicate<String> len10 = pwd -> pwd.length()  < 10;
        Predicate<String> eq = pwd -> pwd.equals("123456");

        boolean result = opt.map(String::toLowerCase).filter(len6.and(len10).and(eq)).isPresent();
        System.out.println(result); //true
    }
}
