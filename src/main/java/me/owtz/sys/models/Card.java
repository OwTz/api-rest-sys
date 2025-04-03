package me.owtz.sys.models;

import jakarta.persistence.*;

@Entity(name = "tb_card")
public class Card {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number")
    private String number;

    @Column(name = "avalible_limit", scale = 2, precision = 2)
    private Double limit;


    @Column(name = "user")
    private User user;

    // Construtor padrão
    public Card() {
    }



    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }
}