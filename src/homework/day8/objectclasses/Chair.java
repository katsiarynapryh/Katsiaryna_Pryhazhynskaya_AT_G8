package homework.day8.objectclasses;

import java.util.Objects;

public class Chair {
    private int height;
    private int width;

    public Chair(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chair chair)) return false;
        return getHeight() == chair.getHeight() && getWidth() == chair.getWidth();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight(), getWidth());
    }
}