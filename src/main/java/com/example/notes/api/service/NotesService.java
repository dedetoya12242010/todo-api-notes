package com.example.notes.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.notes.api.entity.Notes;
import com.example.notes.api.repository.NotesRepository;

@Service
public class NotesService {

	@Autowired
	NotesRepository notesRepository;

	public List<Notes> getAllNotes() {
		List<Notes> notes = new ArrayList<Notes>();
		notesRepository.findAll().forEach(employee -> notes.add(employee));
		return notes;
	}
	
	public Notes geNotesById(int id) {
	   return notesRepository.findById(id).get();
	}

	public void updateNotes(Notes notes) {
		notesRepository.save(notes);
	}

	public void deleteNotes(int id) {
		notesRepository.deleteById(id);
	}

	public void saveOrUpdate(Notes notes) {
		notesRepository.save(notes);
	}

}
