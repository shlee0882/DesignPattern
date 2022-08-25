package singleton;

public class SingleTon2 {
    // 정적 선언 및 초기화 하면 스레드를 써도 문제없음.
    private static SingleTon2 uniqueInstance = new SingleTon2();

    private SingleTon2() {}

    // 멀티스레딩 문제 해결
    public static SingleTon2 getInstance() {
        return uniqueInstance;
    }
}
