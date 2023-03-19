package chapter20Java8;

import java.util.Optional;
import java.util.function.Predicate;

public class OptionalDemo6Filter {
    public static void main(String[] args) {
        String password = "12345";
        Optional<String> opt = Optional.ofNullable(password);
        System.out.println(opt.filter(pwd -> pwd.length() > 5).isPresent());  //false
        System.out.println(opt.filter(pwd -> pwd.length() > 4).isPresent());  //true

        Predicate<String> len6 = pwd -> pwd.length() > 6;
        Predicate<String> len10 = pwd -> pwd.length() < 10;
        password = "1234567";
        opt = Optional.ofNullable(password);
        boolean result = opt.filter(len6.and(len10)).isPresent();
        System.out.println(result); //true
    }
}
