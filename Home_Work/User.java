package PDP.Home_Work;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User implements Comparable<User> {
    private String userName;
    private String passWord;
    private String name;
    private String surName;
    private int balance=0;
    private int id;
    private int old;
    private List<Course> courses = new ArrayList<>();
    private List<Course> shopCourses = new ArrayList<>();
    private Payment payment;

    public User(String userName, String passWord, String name, String surName, int old) {
        this.userName = userName;
        this.passWord = passWord;
        this.name = name;
        this.surName = surName;
        this.old = old;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void removeCourseList(Course course) {
        courses.remove(course);
    }

    public void addCourseList(Course course) {
        courses.add(course);
    }
    public List<Course> getCourseList() {
        return courses;
    }

    public void removeShopCourses(Course course) {
        shopCourses.remove(course);
    }

    public void addShopCourses(Course course) {
        shopCourses.add(course);
    }
    public List<Course> getShopCourse() {
        return shopCourses;
    }
    public Course getShopCourseByName(String courseName) {
        Course courseAnswer = new Course("NON", 0,0, "non");
        for (Course course:shopCourses){
            if (course.getName().equals(courseName)){
                courseAnswer = course;
            }else {
                System.out.println("Bunday kurs topilmadi");
            }
        }
        return courseAnswer;
    }

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance+=balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return balance == user.balance && id == user.id && old == user.old && Objects.equals(userName, user.userName) && Objects.equals(passWord, user.passWord) && Objects.equals(name, user.name) && Objects.equals(surName, user.surName) && Objects.equals(courses, user.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, passWord, name, surName, balance, id, old, courses);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public int compareTo(User user) {
        return this.id - user.id;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", balance=" + balance +
                ", id=" + id +
                ", old=" + old +
                ", courses=" + courses +
                ", shopCourses=" + shopCourses +
                ", payment=" + payment +
                '}';
    }
}
