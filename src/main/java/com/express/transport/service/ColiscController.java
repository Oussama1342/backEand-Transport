package com.express.transport.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.express.transport.DAO.ColisRepository;
import com.express.transport.entity.Colis;

@RestController
@RequestMapping("/colis")
public class ColiscController {

@Autowired
ColisRepository colisRepository ;

@PostMapping("/addcolis")
public Colis addColis(@RequestBody Colis colis) {
	
	return colisRepository.save(colis);
	
}
}

