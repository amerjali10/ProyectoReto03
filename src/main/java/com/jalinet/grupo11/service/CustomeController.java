/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jalinet.grupo11.service;

import com.jalinet.grupo11.entities.Custome;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JaliNet
 */
@RestController
@RequestMapping("/api/Custome")
public class CustomeController {
    @Autowired
    private CustomeService customeService;
    
    @CrossOrigin(origins = "http://132.226.240.254")
    @GetMapping("/all")
      public List<Custome> getCustomes() {return customeService.getAll();};

    @CrossOrigin(origins = "http://132.226.240.254")
    @GetMapping("/{id}")
      public Optional<Custome> getCustome(@PathVariable("id") int customeId) {
          return customeService.getCustome(customeId);
      }
      @CrossOrigin(origins = "http://132.226.240.254")
      @PostMapping("/save")
      public Custome save(@RequestBody Custome custome) {return customeService.save(custome);};
      
   
}
