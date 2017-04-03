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
public class Parents {

    private String firstname, lastname, studentname, address,phone;
    private boolean status;

    public Parents(String firstname, String lastname, String studentname, String address, String phone, boolean status) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.studentname = studentname;
        this.status = status;
        this.address = address;
        this.phone = phone;
    }

    public Parents() {
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

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
        return   "firstname=" + firstname + ", lastname=" + lastname + ", studentname=" + studentname + ", address=" + address + ", phone=" + phone + ", status=" + status + ']';
    }

}
