/**
 *
 */
package com.shopping.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Setter
@Getter
@Entity
@Table(name = "t_admin")
public class Admin extends AbstractEntity {

	@Column(columnDefinition="VARCHAR(16) NOT NULL")
	private String username;

	@Column(columnDefinition="VARCHAR(32) NOT NULL")
	private String password;

}
