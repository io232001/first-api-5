package co.develhope.firstapi5.controllers;

import co.develhope.firstapi5.DTO.CarDTO;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")

public class CarController {

    @GetMapping("/getcar/{id}/{modelName}/{price}")
    public CarDTO getCar(@PathVariable String id, @PathVariable String modelName, @PathVariable Integer price){
        return new CarDTO(id, modelName, price);
    }
    @PostMapping("/postcar")
    @ResponseBody
    public String postCar(@Validated @RequestBody CarDTO car){
        System.out.println(car);
        return HttpStatus.CREATED.toString();
    }
}