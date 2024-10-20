package com.example.myapp.service;

import com.example.myapp.model.Owner;
import com.example.myapp.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OwnerService {
    
    private final OwnerRepository ownerRepository;

    @Autowired
    public OwnerService(OwnerRepository ownerRepository) {
        System.out.println("ХУУУУУУУУУУУУУЙ");
        this.ownerRepository = ownerRepository;
    }

    public List<Owner> getAllOwners() {
        return ownerRepository.findAll();
    }

    public Owner getOwnerById(Long id) {
        return ownerRepository.findById(id).orElse(null);
    }

    public Owner createOwner(Owner owner) {
        System.out.println("ХУУУУУУУУЙЦААААААААААААА");
        return ownerRepository.save(owner);
    }

    public Owner updateOwner(Owner owner) {
        return ownerRepository.save(owner);
    }
    
    public void deleteOwner(Long id) {
        ownerRepository.deleteById(id);
    }
}
