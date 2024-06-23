package com.example.notes.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.notes.api.entity.Notes;
import com.example.notes.api.service.NotesService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/todo")
public class NotesController {

	@Autowired
	NotesService notesService;

	@PostMapping("/notes")
	public void addNotes(@Valid @RequestBody Notes notes) {
		notesService.saveOrUpdate(notes);
	}

	@GetMapping("/notes/{id}")
	public Notes getNotes(@PathVariable("id") int id) {
		//System.out.println("[DEBUG] getNotes INVOKED!! ID=>" + id);
		return notesService.geNotesById(id);
	}

	@GetMapping("/notes")
	public List<Notes> getAllNotes() {
		System.out.println("[DEBUG] getAllNotes INVOKED!!");
		return notesService.getAllNotes();
	}

	@PutMapping("/notes")
	public void updateNotes(@RequestBody Notes notes) {
		System.out.println("[DEBUG] updateNotes INVOKED!!");
		notesService.saveOrUpdate(notes);
	}

	@DeleteMapping("/notes/{id}")
	public void deleteNotes(@PathVariable("id") int id) {
		//System.out.println("[DEBUG] deleteNotes INVOKED!! ID=>" + id);
		notesService.deleteNotes(id);

	}

}
