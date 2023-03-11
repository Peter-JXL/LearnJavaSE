/**
 * 演示创建Optional对象
 */
package chapter20Java8;

import java.util.Optional;

public class OptionalDemo2Create {
  public static void main(String[] args) {

    //1.可以使用静态方法 empty() 创建一个空的 Optional 对象
    Optional<String> empty = Optional.empty();
    System.out.println(empty);  // output: Optional.empty


    //2. 可以使用静态方法 of() 创建一个非空的 Optional 对象
    Optional<String> opt = Optional.of("PeterJXL");
    System.out.println(opt);  //output: Optional[PeterJXL]

    //3. 可以使用静态方法 ofNullable() 创建一个即可空又可非空的 Optional 对象
    String name = null;
    Optional<String> optOrNull = Optional.ofNullable(name);
    System.out.println(optOrNull);  // output: Optional.empty
    
  }
}
