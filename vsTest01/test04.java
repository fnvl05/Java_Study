package vsTest01;

@FunctionalInterface
interface Lamda2{
    void testLamda2(String msg);
}

public class test04 {
    public static void LamdaTest2(Lamda2 lamda){
        lamda.testLamda2("홍길동");
    }
    public static void main(String[]args){
        LamdaTest2((String msg) -> {
            System.out.println("람다식 1" + msg);
        });
        LamdaTest2(msg -> System.out.println("람다식 2" + msg));
    }
}