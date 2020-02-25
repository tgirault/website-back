package fr.girault.thomas.website.services.impl;

import org.springframework.stereotype.Service;

import fr.girault.thomas.website.common.Translator;
import fr.girault.thomas.website.model.dto.MessageDto;
import fr.girault.thomas.website.services.MessageService;

/**
 * The Class MessageServiceImpl.
 */
@Service
public class MessageServiceImpl implements MessageService {

	/**
	 * Translate.
	 *
	 * @param code the code
	 * @return the message
	 */
	public MessageDto translate(String code) {
		return MessageDto.builder().code(code).message(Translator.toLocale(code)).build();
	}
}
