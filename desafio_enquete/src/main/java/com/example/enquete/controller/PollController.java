package com.example.enquete.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.enquete.model.Poll;
import com.example.enquete.repository.PollRepository;

@RestController
@RequestMapping("/poll")
public class PollController {

	@Autowired
	private PollRepository pollRepo;

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Collection<Poll>> getPoll() {
		return new ResponseEntity<>(pollRepo.findAll(), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> addPoll(@RequestBody Poll poll) {
		return new ResponseEntity<>(pollRepo.saveAndFlush(poll), HttpStatus.CREATED);
	}

}
