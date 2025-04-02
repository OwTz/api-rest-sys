package me.owtz.sys.models;


import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_user")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "account")
    private Account account;

    @Column(name = "features")
    private List<Features> features;

    @Column(name = "card")
    private Card card;


    @Column(name = "news")
    private List<News> news;

    // Construtor padrão
    public Account() {
    }

    // Construtor com todos os campos
    public Account(String id, String userName, String userAccount, String userAgency) {

    }

    // Getters e Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<Features> getFeatures() {
        return features;
    }

    public void setFeatures(List<Features> features) {
        this.features = features;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", account=" + account +
                ", features=" + features +
                ", card=" + card +
                ", news=" + news +
                '}';
    }
}