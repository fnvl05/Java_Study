package vsTest01;

interface Someinterface{
    void printfo();
}

public class test02 {
    int iMember = 1;
    static int cMember = 2;

    void method(Someinterface some){
        some.printfo();
    }

    public static void main(String[] args) {
        test02 test = new test02();
        int localVar = 3;
        test.method(new Someinterface(){
        
            @Override
            public void printfo() {
                // System.out.println("외부 인스턴스 맴버 변수 : " + iMember);
                cMember++;
                System.out.println("외부 인스턴스 맴버 변수 : " + cMember);
                System.out.println("외부 로컬 맴버 변수 : " + localVar);

                //localVar++; 여전히 변경 불가능.
            }
        });
    }
}