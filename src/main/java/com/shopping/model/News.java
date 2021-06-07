/**
 *
 */
package com.shopping.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "t_news")
public class News extends AbstractEntity {

	@Column(columnDefinition="VARCHAR(64) NOT NULL")
	private String title;

	@Column(columnDefinition="VARCHAR(512) NOT NULL ")
	private String content;

	@ManyToOne
	@JoinColumn
    private Admin  inputUser;

}
