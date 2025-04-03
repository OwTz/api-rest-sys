package me.owtz.sys.models;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @Column(precision = 15, scale = 2)
    private BigDecimal balance;

    @Column(unique = true)
    private String numberAccount;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Features> features;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "card_id", referencedColumnName = "id")
    private Card card;


    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<News> news;

    @Column(name = "additional_limit", precision = 13, scale = 2)
    private BigDecimal limit;

    // Construtor padrão
    public Account() {
    }

    public Account(Long id, String name, Account account, BigDecimal balance, String numberAccount, List<Features> features, Card card, List<News> news) {
        this.id = id;
        this.name = name;
        this.account = account;
        this.balance = balance;
        this.numberAccount = numberAccount;
        this.features = features;
        this.card = card;
        this.news = news;
    }

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

    public String getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
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



}