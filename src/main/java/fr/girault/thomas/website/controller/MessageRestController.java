package fr.girault.thomas.website.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.girault.thomas.website.service.BusinessService;

@RestController
@RequestMapping("/message")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces(MediaType.APPLICATION_JSON)
public class MessageRestController {
 
	@Autowired
	private BusinessService businessService;
	
    @GetMapping("/{code}")
    public ResponseEntity<?> get(@PathVariable String code) {
        return new ResponseEntity<>(businessService.translate(code), HttpStatus.OK);
    }
}