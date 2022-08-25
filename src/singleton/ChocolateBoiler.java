package singleton;

public class ChocolateBoiler {
    // 싱글톤 정적변수 사용
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler uniqueInstance;

    // 인스턴스 절대 2개 이상 생성 하면 안됨.
    // 싱글톤 생성자는 private로 생성해야함!
    private ChocolateBoiler() {
       empty = true;
       boiled = false;
    }
    // 싱글톤 정적메소드 사용
    public static ChocolateBoiler getInstance() {
        if(uniqueInstance == null){
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }
    public void fill() {
        if(isEmpty()){
            empty = false;
            boiled = false;
            // 보일러에 우유와 초콜릿을 혼합한 재료를 넣음.
        }
    }
    public boolean isEmpty() {
        return empty;
    }
    public boolean isBoiled() {
        return boiled;
    }
}
