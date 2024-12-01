package org.example;
public interface Geometrie {
    public int getAreat();
    public void setWidth(int w);
    public void setHeight(int h);
}
class Squate implements Geometrie{
    private int side;
    public int getAreat() {
        return side*side;
    }
    public void setWidth(int w) {
        this.side=w;
    }
    public void setHeight(int h) {
        this.side=h;
    }
    public void setSide(int s){
        this.setWidth(s);
        this.setHeight(s);
    }
}


class Rectangle implements Geometrie{
    private int height;
    private int width;
    public int getAreat() {
        return height*width;
    }
    public void setWidth(int w) {
        this.width=w;
    }

    public void setHeight(int h) {
        this.height=h;
    }
}