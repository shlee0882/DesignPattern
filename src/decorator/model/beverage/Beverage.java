package decorator.model.beverage;

public abstract class Beverage {
    public enum SIZE {TALL,GRANDE, VENTI};
    SIZE size = SIZE.TALL;
    public String description = "제목 없음";
    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public void setSize(SIZE size){
        this.size = size;
    }
    public SIZE getSize(){
        return this.size;
    }
}
