package kr.co.fastcampus.eatgo.domain;

import lombok.Getter;

@Getter
public class Restaurant {


    private Long id;
    private String name;
    private String address;


    public Restaurant(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getInformation() {
        return name + " in " + address;
    }
}
