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
@Table(name = "t_useraddress")
public class UserAddress extends AbstractEntity {

	@Column(columnDefinition="VARCHAR(64) DEFAULT NULL")
	private String address;

	@Column(columnDefinition="VARCHAR(32) DEFAULT NULL")
	private String phone;

	@Column(columnDefinition="VARCHAR(16) DEFAULT NULL")
	private String zipcode;

	@Column(columnDefinition="VARCHAR(16) DEFAULT NULL")
	private String consignee;

	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

}
