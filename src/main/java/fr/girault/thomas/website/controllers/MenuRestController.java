package fr.girault.thomas.website.controllers;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.girault.thomas.website.services.MenuService;

/**
 * The Class MenuRestController.
 */
@RestController
@RequestMapping("/menu")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces(MediaType.APPLICATION_JSON)
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MenuRestController {

	/** The menu service. */
	private MenuService menuService;
	
	/**
	 * Instantiates a new menu rest controller.
	 *
	 * @param menuService the menu service
	 */
	public MenuRestController(final MenuService menuService) {
		this.menuService = menuService;
	}
	
    /**
	 * Gets the menus.
	 *
	 * @return the menus
	 */
    @GetMapping("")
    public ResponseEntity<?> getMenus() {
        return new ResponseEntity<>(menuService.findAll(), HttpStatus.OK);
    }
}
