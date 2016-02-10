package com.company;

/**
 * Created by Администратор on 08.02.2016.
 */
public class Human implements Comparable<Human> {
    private String name;
    private String phone;
    private int age;

    public Human(String name, String phone, int age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;

        Human human = (Human) o;

        if (age != human.age) return false;
        if (name != null ? !name.equals(human.name) : human.name != null) return false;
        if (phone != null ? !phone.equals(human.phone) : human.phone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Human o) {
        return this.name.compareTo(o.getName());
    }
}
