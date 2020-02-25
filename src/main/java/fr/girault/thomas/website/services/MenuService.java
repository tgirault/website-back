package fr.girault.thomas.website.services;

import java.util.List;

import fr.girault.thomas.website.model.entities.Menu;

/**
 * The Interface MenuService.
 */
public interface MenuService {

	/**
	 * Find all.
	 *
	 * @return the list
	 */
	List<Menu> findAll();
}
