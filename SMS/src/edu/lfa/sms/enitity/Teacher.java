/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lfa.sms.enitity;

/**
 *
 * @author Prajwal
 */
public class Teacher {
    private String firstname,lastname,address,subject;
    private String phone;
    private boolean status;
    private int id;

    public Teacher() {
    }

    public Teacher( int id,String firstname, String lastname, String address, String subject, String phone, boolean status) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.subject = subject;
        this.phone = phone;
        this.status = status;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Teacher{" + "firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + ", subject=" + subject + ", phone=" + phone + ", status=" + status + ", id=" + id + '}';
    }

    
    
}
