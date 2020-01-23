package fr.girault.thomas.website.service;

import org.springframework.stereotype.Service;

import fr.girault.thomas.website.common.Translator;
import fr.girault.thomas.website.model.Message;

@Service
public class BusinessService {

	public Message translate(String code) {
		return Message.builder().code(code).message(Translator.toLocale(code)).build();
	}
}
