package chapter5.section2Interface;

public interface InterfaceWithDefault {
  String getName();
  default void run(){
    System.out.println(getName() + " run ");
  };
}
