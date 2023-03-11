/**
 * 演示如何判断值是否存在
 */
package chapter20Java8;

import java.util.Optional;

public class OptionalDemo3Judge {
    public static void main(String[] args) {
        // 可以通过方法 isPresent() 判断一个 Optional 对象是否存在。isPresent表示是否存在
        // 如果存在，该方法返回 true，否则返回 false——取代了 obj != null 的判断。

        Optional<String> opt = Optional.of("PeterJXL");
        System.out.println(opt.isPresent());    //true

        Optional<String> optOrNull = Optional.ofNullable(null);
        System.out.println(optOrNull.isPresent());  //false

        // Java 11新方法 isEmpty
//        Optional<String> opt2 = Optional.of("PeterJXL");
//        System.out.println(opt.isEmpty()); // false
//
//        Optional<String> optOrNull2 = Optional.ofNullable(null);
//        System.out.println(optOrNull.isEmpty()); // true

        if(opt.isPresent()){
            System.out.println(opt.get().length());
        }
    }
}
