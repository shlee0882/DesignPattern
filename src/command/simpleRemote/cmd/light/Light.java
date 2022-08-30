package command.simpleRemote.cmd.light;

public class Light {
    String lightName;
    public Light(String living_room) {
        lightName = living_room;
    }

    void on(){
        System.out.println(lightName+" 조명이 켜졌습니다.");
    };
    void off(){
        System.out.println(lightName+" 조명이 꺼졌습니다.");
    };

}
