package com.alaswad.quizapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "question")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Question {

    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    public int getId() {
        return id;
    }

    private String text;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "options_id", referencedColumnName = "id")
    private Options options;

    public Question() {
    }

    public Question(String text, Options options) {
        this.text = text;
        this.options = options;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + getId() +
                ", text='" + text + '\'' +
                ", options=" + options +
                '}';
    }
}
