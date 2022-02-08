package com.company;

public class Jayloo {
    private String name;
    private String address;
    private String chabanName;
    private Cow[] uylar;
    private Sheep[] koylor;
    private Horse[] attar;

    public Jayloo(String name, String address, String chabanName, Cow[] uylar, Sheep[] koylor, Horse[] attar) {
        this.name = name;
        this.address = address;
        this.chabanName = chabanName;
        this.uylar = uylar;
        this.koylor = koylor;
        this.attar = attar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getChabanName() {
        return chabanName;
    }

    public void setChabanName(String chabanName) {
        this.chabanName = chabanName;
    }

    public Cow[] getUylar() {
        return uylar;
    }

    public void setUylar(Cow[] uylar) {
        this.uylar = uylar;
    }

    public Sheep[] getKoylor() {
        return koylor;
    }

    public void setKoylor(Sheep[] koylor) {
        this.koylor = koylor;
    }

    public Horse[] getAttar() {
        return attar;
    }

    public void setAttar(Horse[] attar) {
        this.attar = attar;
    }
}
