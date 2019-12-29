package kr.co.fastcampus.eatgo.domain;

import lombok.Getter;

@Getter
public class Restaurant {


    private String name;
    private String address;


    public Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getInformation() {
        return name + " in " + address;
    }
}
