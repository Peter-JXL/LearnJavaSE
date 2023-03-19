package chapter20Java8;

import java.util.Optional;

public class OptionalDemo5DefaultValue {
    public static void main(String[] args) {
        String str = "p";
        String strOpt = Optional.ofNullable(str).orElse(createString());
        String strOpt2 = Optional.ofNullable(str).orElseGet(() -> createString());
        String strOpt3 = Optional.ofNullable(str).orElseGet(OptionalDemo5DefaultValue::createString);

        String nullStr = null;
        String name = Optional.ofNullable(nullStr).orElse("PeterJXL");
        System.out.println(name);   //PeterJXL


    }

    public static String createString(){
        System.out.println("invoke createString");
        return "zhang san";
    }
}
