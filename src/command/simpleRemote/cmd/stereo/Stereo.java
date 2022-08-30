package command.simpleRemote.cmd.stereo;

public class Stereo {
    int volume = 0;
    public void on(){
        System.out.println("스테레오가 켜졌습니다.");
    };
    void off(){
        System.out.println("스테레오가 꺼졌습니다.");
    };
    public void setCD(){
        System.out.println("CD 설정");
    };
    void setDvd(){
        System.out.println("DVD 설정");
    };
    void setRadio(){
        System.out.println("라디오 설정");
    };
    public void setVolume(int i) {
        this.volume = i;
    }
}
