package singleton;

public class SingletonClient {
    public static void main(String[] args){
        // enum으로 싱글턴 생성 해결
        SingleTon4 singleTon4 = SingleTon4.UNIQUE_INSTANCE;
        // 싱글턴 사용
        System.out.println(singleTon4);

    }
}
