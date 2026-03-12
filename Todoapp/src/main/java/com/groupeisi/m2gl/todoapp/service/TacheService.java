package com.groupeisi.m2gl.todoapp.service;

import com.groupeisi.m2gl.todoapp.model.Tache;
import com.groupeisi.m2gl.todoapp.repository.TacheRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TacheService {

    private final TacheRepository repo;

    public TacheService(TacheRepository repo) {
        this.repo = repo;
    }

    public List<Tache> findAll() { return repo.findAll(); }
    public Tache save(Tache tache) { return repo.save(tache); }
    public void delete(Long id) { repo.deleteById(id); }

    public Tache update(Long id, Tache tache) {
        Tache existing = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Tâche introuvable"));
        existing.setTitre(tache.getTitre());
        existing.setTerminee(tache.isTerminee());
        return repo.save(existing);
    }
}