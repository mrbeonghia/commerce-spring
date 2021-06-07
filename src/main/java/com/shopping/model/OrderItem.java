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
@Table(name = "t_orderitem")
public class OrderItem extends AbstractEntity {

	@OneToOne
	private Product product;

	@ManyToOne
	@JoinColumn(name="order_id")
	private Order order;

	@Column(columnDefinition="INT(11) NOT NULL")
	private Integer quantity;

}
