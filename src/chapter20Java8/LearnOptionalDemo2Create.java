package chapter20Java8;

import java.util.Optional;

public class LearnOptionalDemo2Create {
  public static void main(String[] args) {

    //1.create empty Optional Object with staic method empty
    Optional<String> empty = Optional.empty();
    System.out.println(empty);  // output: Optional.empty


    //2. create with method of 
    Optional<String> opt = Optional.of("PeterJXL");
    System.out.println(opt);  //output: Optional[PeterJXL]

    //3. create with ofNullable
    String name = null;
    Optional<String> optOrNull = Optional.ofNullable(name);
    System.out.println(optOrNull);  // output: Optional.empty
    
  }
}
