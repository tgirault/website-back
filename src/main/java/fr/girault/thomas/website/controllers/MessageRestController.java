package fr.girault.thomas.website.controllers;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.girault.thomas.website.services.MessageService;

/**
 * The Class MessageRestController.
 */
@RestController
@RequestMapping("/message")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces(MediaType.APPLICATION_JSON)
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MessageRestController {
 
	/** The message service. */
	private MessageService messageService;
	
	/**
	 * Instantiates a new message rest controller.
	 *
	 * @param messageService the message service
	 */
	public MessageRestController(final MessageService messageService) {
		this.messageService = messageService;
	}
	
    /**
	 * Gets the.
	 *
	 * @param code the code
	 * @return the response entity
	 */
    @GetMapping("/{code}")
    public ResponseEntity<?> getMessage(@PathVariable String code) {
        return new ResponseEntity<>(messageService.translate(code), HttpStatus.OK);
    }
}