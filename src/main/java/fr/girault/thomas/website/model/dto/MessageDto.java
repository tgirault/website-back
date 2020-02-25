package fr.girault.thomas.website.model.dto;

import lombok.Builder;
import lombok.Data;

/**
 * The Class Message.
 */
@Data
@Builder
public class MessageDto {
	
	/** The code. */
	private String code;
	
	/** The message. */
	private String message;
}