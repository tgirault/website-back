package fr.girault.thomas.website.common;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;

/**
 * The Class Translator.
 */
@Component
public class Translator {

	/** The message source. */
	private static ResourceBundleMessageSource messageSource;

	/**
	 * Instantiates a new translator.
	 *
	 * @param messageSource the message source
	 */
	@Autowired
	Translator(ResourceBundleMessageSource messageSource) {
		Translator.messageSource = messageSource;
	}

	/**
	 * To locale.
	 *
	 * @param msgCode the msg code
	 * @return the string
	 */
	public static String toLocale(String msgCode) {
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage(msgCode, null, locale);
	}
}