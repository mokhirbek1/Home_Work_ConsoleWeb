package PDP.Home_Work;

import java.util.Objects;

public class Course  {
    String name;
    int month;
    int cost;
    String info;

    public Course(String name, int month, int cost, String info) {
        this.name = name;
        this.month = month;
        this.cost = cost;
        this.info = info;
    }



    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return cost == course.cost && Objects.equals(name, course.name) && Objects.equals(month, course.month) && Objects.equals(info, course.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, month, cost, info);
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", month='" + month + '\'' +
                ", cost=" + cost +
                ", info='" + info + '\'' +
                '}';
    }
}
