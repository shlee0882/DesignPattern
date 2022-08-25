package command.simpleRemote.cmd.garage;

public class GarageDoor {
    public void up(){
        System.out.println("차고문 위로");
    };
    public void down(){
        System.out.println("차고문 아래로");
    };
    public void stop(){
        System.out.println("차고문 정지");
    };
    public void lightOn(){
        System.out.println("차고문 조명 켜기");
    };
    public void lightOff(){
        System.out.println("차고문 조명 끄기");
    };
}
