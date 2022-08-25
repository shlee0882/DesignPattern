package singleton;

public class SingleTon3 {
    // DCL(Double-Checked Locking) 사용 인스턴스 생성되어있는지 확인 후 생성되어 있지 않을때만 동기화함.
    private volatile static SingleTon3 uniqueInstance;

    private SingleTon3() {}

    // 멀티스레딩 문제 해결
    public static SingleTon3 getInstance() {
        if(uniqueInstance == null){
            synchronized (SingleTon3.class){
                if(uniqueInstance == null){
                    uniqueInstance = new SingleTon3();
                }
            }
        }
        return uniqueInstance;
    }
}
