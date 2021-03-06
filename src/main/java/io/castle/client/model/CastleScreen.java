package io.castle.client.model;

public class CastleScreen {
    private int width;
    private int height;
    private int density;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDensity() {
        return density;
    }

    public void setDensity(int density) {
        this.density = density;
    }

    @Override
    public String toString() {
        return "CastleScreen{" +
                "width=" + width +
                ", height=" + height +
                ", density=" + density +
                '}';
    }
}
