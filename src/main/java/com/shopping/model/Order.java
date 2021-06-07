/**
 *
 */
package com.shopping.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "t_order")
public class Order extends AbstractEntity {

    @Column(columnDefinition="VARCHAR(64) NOT NULL")
    private String orderNumber;

    @ManyToOne
    @JoinColumn(name = "user_id",columnDefinition="BIGINT(20) NOT NULL")
    private User user;

    @Column(columnDefinition="VARCHAR(512) NOT NULL")
    private String address;

    @Column(columnDefinition="VARCHAR(16) NOT NULL")
    private String phone;

    @Column(columnDefinition="VARCHAR(8) NOT NULL")
    private String zipcode;

    @Column(columnDefinition="VARCHAR(16) NOT NULL")
    private String consignee;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems;

    @Column(columnDefinition="DATETIME DEFAULT")
    private Date payTime;//付款时间

    @Column(columnDefinition="DATETIME DEFAULT")
    private Date shipTime;//发货时间

    @Column(columnDefinition="DATETIME DEFAULT")
    private Date confirmTime;//确认收货时间

    @Column(columnDefinition="INT(11) NOT NULL")
    private Integer status;//状态

    @Column(columnDefinition="DOUBLE NOT NULL")
    private Double finalPrice;//实际成交价

    @Column(columnDefinition="DOUBLE NOT NULL")
    private Double totalPrice;//总价

}
