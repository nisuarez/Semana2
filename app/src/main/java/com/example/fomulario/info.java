package com.example.fomulario;

public class info {

    protected String name;
    protected int birthday;
    protected String mail;
    protected String phone;
    protected String description;

    public void Info (String name, int birthday, String mail, String phone, String description) {
        this.name = name;
        this.birthday = birthday;
        this.mail = mail;
        this.phone = phone;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
