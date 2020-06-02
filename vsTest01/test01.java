package vsTest01;

public class test01 {
    int iMember= 1;
    static int cMember = 2;

    void method() {
        int localVar = 3;
        class LocalInner{
            int innerLoclVal = 4;
            void innerMethod(){
                System.out.println("외부 인스턴스 멤버 변수: " + iMember);
                System.out.println("외부 클래스 멤버 변수: " + cMember);
                System.out.println("외부 로컬 멤버 변수: " + localVar); //자바 8 부터 사용가능
                System.out.println("내부 인스턴스 멤버 변수: " + innerLoclVal);
                iMember++;
                cMember++;
                //localVar++;
                innerLoclVal++;
            }
        }
        LocalInner inner = new LocalInner();
        inner.innerMethod();
    }
    public static void main(String[] args) {
       test01 test = new test01();
       test.method();
    }

}