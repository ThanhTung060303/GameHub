package com.example.pro1121_nhom3.model;

public class nguoidung {
    private String email;
    private game game;
    private String matkhau;
    private String tendangnhap;
    private String tennd;
    private int role;
    private float wallet;

    public nguoidung() {
    }

    public nguoidung(String email, com.example.pro1121_nhom3.model.game game, String matkhau, String tendangnhap, String tennd, int role, float wallet) {
        this.email = email;
        this.game = game;
        this.matkhau = matkhau;
        this.tendangnhap = tendangnhap;
        this.tennd = tennd;
        this.role = role;
        this.wallet = wallet;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public com.example.pro1121_nhom3.model.game getGame() {
        return game;
    }

    public void setGame(com.example.pro1121_nhom3.model.game game) {
        this.game = game;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getTendangnhap() {
        return tendangnhap;
    }

    public void setTendangnhap(String tendangnhap) {
        this.tendangnhap = tendangnhap;
    }

    public String getTennd() {
        return tennd;
    }

    public void setTennd(String tennd) {
        this.tennd = tennd;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public float getWallet() {
        return wallet;
    }

    public void setWallet(float wallet) {
        this.wallet = wallet;
    }
}