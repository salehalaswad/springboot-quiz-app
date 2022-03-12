package com.alaswad.quizapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "options")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Options {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    public int getId() {
        return id;
    }

    private String first;
    private String second;
    private String third;

    public Options(String first, String second, String third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public Options() {
    }


    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getThird() {
        return third;
    }

    public void setThird(String third) {
        this.third = third;
    }

}
