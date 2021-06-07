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
@Table(name = "t_payment")
public class Payment extends AbstractEntity {

	@Column(columnDefinition="VARCHAR(20) NOT NULL")
	private String name;

}
