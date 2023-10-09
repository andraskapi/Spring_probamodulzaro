package hu.progmatic.spring_probamodulzaro.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Expense {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String location;
    private Integer amount;
    @ManyToOne
    @JoinColumn (name = "person_id")
    @JsonBackReference
    private Person person;

    public Expense(Integer id, String location, Integer amount, Person person) {
        this.id = id;
        this.location = location;
        this.amount = amount;
        this.person = person;
    }

    public Expense() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
