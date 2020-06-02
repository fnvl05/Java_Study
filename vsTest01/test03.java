package vsTest01;

@FunctionalInterface
interface TestLamda{
    void metThodA();
}

public class test03{
    public static void LamFunction1(TestLamda lamda){
        lamda.metThodA();
    }
    public static void main(String[] args) {
        LamFunction1(new TestLamda(){
        
            @Override
            public void metThodA() {
                System.out.println(
                    "익명의 내부 클래스 형태"
                );
            }
        });

        LamFunction1(()->{
            System.out.println("람다식 1");
        });
        LamFunction1(()-> System.out.println("람다식 2"));
    }
}
