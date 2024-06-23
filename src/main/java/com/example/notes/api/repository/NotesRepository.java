package com.example.notes.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.notes.api.entity.Notes;

@Repository
public interface NotesRepository extends CrudRepository<Notes, Integer> {

}
