package fr.girault.thomas.website.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Instantiates a new menu.
 */
@Entity
@Table(name="website_menu")
@Data
@EqualsAndHashCode(callSuper=true)
public class Menu extends BaseEntity {

	/** The id. */
	@Id
	@SequenceGenerator(name = "menuSequenceGenerator", sequenceName = "menu_seq", initialValue = 5, allocationSize = 100)
	@GeneratedValue(generator = "menuSequenceGenerator")
	private Long id;

	/** The name. */
	private String name;
	
	/** The locale. */
	private String locale;

}
