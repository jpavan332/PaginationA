package com.pagination.Dao;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import org.springframework.boot.autoconfigure.web.WebProperties;


@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@SuperBuilder
//@Getter @Setter
@JsonInclude(JsonInclude.Include.NON_DEFAULT)


public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String name;
    private String email;
    private  String status;
    private String address;
    private String phone;
    private String imageUrl;

    public User(Long id, String name, String email, String status, String address, String phone, String imageUrl) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.status = status;
        this.address = address;
        this.phone = phone;
        this.imageUrl = imageUrl;
    }

    public User() {

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
