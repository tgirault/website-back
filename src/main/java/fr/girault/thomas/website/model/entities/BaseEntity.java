package fr.girault.thomas.website.model.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

/**
 * The Class BaseEntity.
 */
@Data
@MappedSuperclass
public class BaseEntity {
	
	/** The created on. */
    @CreationTimestamp
    @Column(name = "created_on")
    private LocalDateTime createdOn;
	
	/** The updated on. */
    @UpdateTimestamp
    @Column(name = "updated_on")
    private LocalDateTime updatedOn;

	/** The version. */
	@Version
    private Integer version;
}
