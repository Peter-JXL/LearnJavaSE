package chapter5.section4Static;

public class Test2 {
    static{
        System.out.println("hello world");
    }
    
    private static Test2 tester = new Test2();
    private static int count1;
    private static int count2 = 2;
    public Test2(){
        count1++;
        count2++;
        System.out.println("count1: " + count1);
        System.out.println("count2: " + count2);
    }

    public static Test2 getTester(){
        return tester;
    }
    public static void main(String[] args) {
        Test2.getTester();
        System.out.println("count1 value: " + count1);
        System.out.println("count2 value: " + count2);
    }
}