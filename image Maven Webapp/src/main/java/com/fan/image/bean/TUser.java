package com.fan.image.bean;

public class TUser {
    private String cBh;

    private String cUsername;

    private String cPassword;

    private Integer nAge;

    private String cSex;

    private String cTel;

    private String cAdress;

    private String cEmail;

    private String cOrder;

    private String cCar;

    private String cCollectrion;

    public TUser(String cBh, String cUsername, String cPassword, Integer nAge, String cSex, String cTel, String cAdress, String cEmail,
            String cOrder, String cCar, String cCollectrion) {
        super();
        this.cBh = cBh;
        this.cUsername = cUsername;
        this.cPassword = cPassword;
        this.nAge = nAge;
        this.cSex = cSex;
        this.cTel = cTel;
        this.cAdress = cAdress;
        this.cEmail = cEmail;
        this.cOrder = cOrder;
        this.cCar = cCar;
        this.cCollectrion = cCollectrion;
    }

    public TUser() {
        super();
    }

    public String getcBh() {
        return cBh;
    }

    public void setcBh(String cBh) {
        this.cBh = cBh == null ? null : cBh.trim();
    }

    public String getcUsername() {
        return cUsername;
    }

    public void setcUsername(String cUsername) {
        this.cUsername = cUsername == null ? null : cUsername.trim();
    }

    public String getcPassword() {
        return cPassword;
    }

    public void setcPassword(String cPassword) {
        this.cPassword = cPassword == null ? null : cPassword.trim();
    }

    public Integer getnAge() {
        return nAge;
    }

    public void setnAge(Integer nAge) {
        this.nAge = nAge;
    }

    public String getcSex() {
        return cSex;
    }

    public void setcSex(String cSex) {
        this.cSex = cSex == null ? null : cSex.trim();
    }

    public String getcTel() {
        return cTel;
    }

    public void setcTel(String cTel) {
        this.cTel = cTel == null ? null : cTel.trim();
    }

    public String getcAdress() {
        return cAdress;
    }

    public void setcAdress(String cAdress) {
        this.cAdress = cAdress == null ? null : cAdress.trim();
    }

    public String getcEmail() {
        return cEmail;
    }

    public void setcEmail(String cEmail) {
        this.cEmail = cEmail == null ? null : cEmail.trim();
    }

    public String getcOrder() {
        return cOrder;
    }

    public void setcOrder(String cOrder) {
        this.cOrder = cOrder == null ? null : cOrder.trim();
    }

    public String getcCar() {
        return cCar;
    }

    public void setcCar(String cCar) {
        this.cCar = cCar == null ? null : cCar.trim();
    }

    public String getcCollectrion() {
        return cCollectrion;
    }

    public void setcCollectrion(String cCollectrion) {
        this.cCollectrion = cCollectrion == null ? null : cCollectrion.trim();
    }
}