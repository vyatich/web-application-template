package com.example.innopolis.controller;

import com.example.innopolis.entitiy.animal.Animal;
import com.example.innopolis.service.student.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("animal/")
public class AnimalController {

    private final AnimalService service;

    @Autowired
    public AnimalController(AnimalService service) {
        this.service = service;
    }

    @GetMapping()
    public String getAll(Model model) {
        List<Animal> animalList = service.getAll();
        model.addAttribute("animals", animalList);
        return "animals";
    }

    @GetMapping("{id}")
    public String getById(Model model,
                          @PathVariable long id) {
        Animal animal = service.getById(id);
        model.addAttribute("animal", animal);
        return "animals";
    }

    @PostMapping()
    public String save(Model model,
                       @RequestParam(name = "name") String name) {
        service.save(name);
        return "redirect: animals/";
    }
}
