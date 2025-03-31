package me.owtz.sys.models;

public class Card {

    private String number;
    private int pass;

    // Construtor padrão
    public Card() {
    }

    // Construtor com todos os campos
    public Card(String number, int pass) {
        this.number = number;
        this.pass = pass;
    }

    // Getters e Setters
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        // Cuidado ao imprimir senhas em logs reais
        return "Card{" +
                "number='" + (number != null ? number.replaceAll("\\d(?=\\d{4})", "x") : "null") + '\'' + // Mascara simples
                ", pass=****" +
                '}';
    }
}