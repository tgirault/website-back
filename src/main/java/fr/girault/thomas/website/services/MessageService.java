package fr.girault.thomas.website.services;

import fr.girault.thomas.website.model.dto.MessageDto;

/**
 * The Interface MessageService.
 */
public interface MessageService {

	/**
	 * Translate.
	 *
	 * @param code the code
	 * @return the message
	 */
	MessageDto translate(String code);
}
