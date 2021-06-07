/**
 *
 */
package com.shopping.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Setter
@Getter
@Entity
@NoArgsConstructor
@Table(name = "t_user")
public class User extends AbstractEntity {

	@Column(columnDefinition="VARCHAR(32) DEFAULT NULL")
	private String account;

	@Column(columnDefinition="VARCHAR(32) NOT NULL")
	private String username;

	@Column(columnDefinition="DOUBLE DEFAULT 0 NOT NULL")
	private Long balance;

	@Column(columnDefinition="DOUBLE DEFAULT 0 NOT NULL")
	private Long point;

	@Column(columnDefinition="VARCHAR(32) DEFAULT NULL")
	private String phone;

	@Column(columnDefinition="VARCHAR(32) DEFAULT NULL")
	private String telPhone;

	@Column(columnDefinition="VARCHAR(64) DEFAULT NULL")
	private String address;

	@Column(columnDefinition="VARCHAR(16) DEFAULT NULL")
	private String zipCode;

	@Column(columnDefinition="VARCHAR(32) DEFAULT NULL")
	private String remark;

	@Column(columnDefinition="VARCHAR(64) NOT NULL")
	private String password;


	@OneToMany(mappedBy="user")
	private List<UserAddress> addresses;


	@OneToMany(mappedBy = "user")
	private List<Order> orders;


	@Column(columnDefinition="VARCHAR(64) DEFAULT NULL")
    private String slat;

	/**
	 * @param id
	 * @param username
	 * @param password
	 */
	public User(Integer id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

}
