package fr.girault.thomas.website.services.impl;

import java.util.List;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import fr.girault.thomas.website.model.entities.Menu;
import fr.girault.thomas.website.repositories.MenuRepository;
import fr.girault.thomas.website.services.MenuService;

/**
 * The Class MenuServiceImpl.
 */
@Service
public class MenuServiceImpl implements MenuService {
	
	/** The menu repository. */
	private MenuRepository menuRepository;
	
	/**
	 * Instantiates a new menu service impl.
	 *
	 * @param menuRepository the menu repository
	 */
	public MenuServiceImpl(final MenuRepository menuRepository) {
		this.menuRepository = menuRepository;
	}

	/**
	 * Find all.
	 *
	 * @return the list
	 */
	@Override
	public List<Menu> findAll() {
		String locale = LocaleContextHolder.getLocale().getLanguage();
		return menuRepository.findAllByLocale(locale);
	}

}
