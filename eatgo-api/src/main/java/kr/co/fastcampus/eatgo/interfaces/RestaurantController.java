package kr.co.fastcampus.eatgo.interfaces;

import kr.co.fastcampus.eatgo.domain.Restaurant;
import kr.co.fastcampus.eatgo.domain.RestaurantRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {

    private final RestaurantRepository restaurantRepository = new RestaurantRepository();

    @GetMapping("/restaurants")
    public List<Restaurant> list() {
        List<Restaurant> restaurants = restaurantRepository.findAll();
        return restaurants;
    }


    @GetMapping("/restaurants/{id}")
    public Restaurant detail(@PathVariable Long id) {
        return restaurantRepository.findById(id);
    }
}
