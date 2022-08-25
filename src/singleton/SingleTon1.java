package singleton;

public class SingleTon1 {
    private static SingleTon1 uniqueInstance;

    private SingleTon1() {}

    // 멀티스레딩 문제 해결
    public static synchronized SingleTon1 getInstance() {
        if(uniqueInstance == null){
            uniqueInstance = new SingleTon1();
        }
        return uniqueInstance;
    }
}
