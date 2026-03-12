package com.groupeisi.m2gl.todoapp.controller;

import com.groupeisi.m2gl.todoapp.model.Tache;
import com.groupeisi.m2gl.todoapp.service.TacheService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/taches")
@CrossOrigin(origins = "*")
public class TacheController {

    private final TacheService service;

    public TacheController(TacheService service) {
        this.service = service;
    }

    @GetMapping
    public List<Tache> getAll() { return service.findAll(); }

    @PostMapping
    public ResponseEntity<Tache> create(@RequestBody Tache tache) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(tache));
    }

    @PutMapping("/{id}")
    public Tache update(@PathVariable Long id, @RequestBody Tache tache) {
        return service.update(id, tache);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}