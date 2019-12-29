package kr.co.fastcampus.eatgo.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class RestaurantTest {

    @Test
    public void creation() {
        Restaurant restaurant = new Restaurant("Bob zip", "Seoul");
        Assertions.assertThat(restaurant.getName()).isEqualTo("Bob zip");
        Assertions.assertThat(restaurant.getAddress()).isEqualTo("Seoul");
    }

    @Test
    public void information() {
        Restaurant restaurant = new Restaurant("Bob zip", "Seoul");
        Assertions.assertThat(restaurant.getInformation()).isEqualTo("Bob zip in Seoul");
    }
}