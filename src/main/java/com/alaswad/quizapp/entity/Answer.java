package com.alaswad.quizapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "answer")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    public int getId() {
        return id;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "question_id", referencedColumnName = "id")// referencedColumnName is the column of the other table
    private Question question;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "options_id", referencedColumnName = "id") // name is the name of the FK column
    private Options options;
    private String rightOption;

    public String getRightOption() {
        return rightOption;
    }

    public void setRightOption(String rightOption) {
        this.rightOption = rightOption;
    }

    public Answer() {
    }

    public Answer(Question question, Options options, String rightOption) {
        this.question = question;
        this.options = options;
        this.rightOption = rightOption;
    }


    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + getId() +
                ", question=" + question +
                ", options=" + options +
                '}';
    }
}
