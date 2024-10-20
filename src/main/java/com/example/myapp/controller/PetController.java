package com.example.myapp.controller;

import com.example.myapp.model.Pet;
import com.example.myapp.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {

    private final PetService petService;

    @Autowired
    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping
    public List<Pet> getAllPets() {
        return petService.getAllPets();
    }

    @GetMapping
    public Pet getPetById(@PathVariable Long id) {
        return petService.getPetById(id);
    }

    @PostMapping
    public Pet createPet(@RequestBody Pet pet) {
        return petService.createPet(pet);
    }

    @PutMapping
    public Pet updatePet(@PathVariable Long id, @RequestBody Pet pet) {
        pet.setId(id);
        return petService.updatePet(pet);
    }

    @DeleteMapping("/id")
    public void deletePet(@PathVariable Long id) {
        petService.deletePet(id);
    }
}
