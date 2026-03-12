package com.groupeisi.m2gl.todoapp.repository;

import com.groupeisi.m2gl.todoapp.model.Tache;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TacheRepository extends JpaRepository<Tache, Long> {}