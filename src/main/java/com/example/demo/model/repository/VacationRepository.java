package com.example.demo.model.repository;

import com.example.demo.entity.Vacation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "vacations", path = "vacations")
public interface VacationRepository extends JpaRepository<Vacation, Long> {
}