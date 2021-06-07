package com.shopping.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2017/2/13
 */
@Setter
@Getter
@Entity
@Table(name = "t_remember")
public class Remember extends AbstractEntity {

    @ManyToOne
    @JoinColumn
    private User user;

}
