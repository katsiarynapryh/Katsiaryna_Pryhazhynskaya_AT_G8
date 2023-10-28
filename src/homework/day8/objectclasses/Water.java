package homework.day8.objectclasses;

import java.util.Objects;

public class Water {
    private String color;
    private String smell;

    public Water(String color, String smell) {
        this.color = color;
        this.smell = smell;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    @Override
    public String toString() {
        return "Water{" +
                "color='" + color + '\'' +
                ", smell='" + smell + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Water water)) return false;
        return getColor().equals(water.getColor()) && getSmell().equals(water.getSmell());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), getSmell());
    }
}