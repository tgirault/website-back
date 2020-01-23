package fr.girault.thomas.website.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Message {
	private String code;
	private String message;
}