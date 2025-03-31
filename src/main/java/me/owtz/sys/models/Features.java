package me.owtz.sys.models;

public class Features {

    private String icon;
    private String propiets; // Mantendo o nome original do JSON

    // Construtor padrão
    public Features() {
    }

    // Construtor com todos os campos
    public Features(String icon, String propiets) {
        this.icon = icon;
        this.propiets = propiets;
    }

    // Getters e Setters
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getPropiets() {
        return propiets;
    }

    public void setPropiets(String propiets) {
        this.propiets = propiets;
    }

    @Override
    public String toString() {
        return "Features{" +
                "icon='" + icon + '\'' +
                ", propiets='" + propiets + '\'' +
                '}';
    }
}