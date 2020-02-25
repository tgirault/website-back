package fr.girault.thomas.website.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.girault.thomas.website.model.entities.Menu;

/**
 * The Interface MenuRepository.
 */
@Repository
public interface MenuRepository  extends JpaRepository<Menu, Long> {
	
	/**
	 * Find by locale.
	 *
	 * @param locale the locale
	 * @return the list
	 */
	public List<Menu> findAllByLocale(String locale);

}
