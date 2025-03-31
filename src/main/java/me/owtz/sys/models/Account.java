package me.owtz.sys.models;

public class Account {

    private String id;
    private String userName;
    private String userAccount;
    private String userAgency;

    // Construtor padrão
    public Account() {
    }

    // Construtor com todos os campos
    public Account(String id, String userName, String userAccount, String userAgency) {
        this.id = id;
        this.userName = userName;
        this.userAccount = userAccount;
        this.userAgency = userAgency;
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserAgency() {
        return userAgency;
    }

    public void setUserAgency(String userAgency) {
        this.userAgency = userAgency;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", userAccount='" + userAccount + '\'' +
                ", userAgency='" + userAgency + '\'' +
                '}';
    }
}