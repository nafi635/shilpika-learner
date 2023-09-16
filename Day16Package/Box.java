package Day16Package;

public class Box {
    public double width;
    public double height;
    public double length;
    public Box(double width, double length, double height){
        this.width = width;
        this.length = length;
        this.height = height;
    }
    public double volumeOfBox(){
        return (width*length*height);
    }
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
