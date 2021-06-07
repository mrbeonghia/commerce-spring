package com.shopping.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Setter
@Getter
@Entity
@DynamicUpdate
@Table(name = "t_picture")
public class Picture extends AbstractEntity {

    @Column(columnDefinition="VARCHAR(32) NOT NULL")
    private String title;

    @Column(columnDefinition="VARCHAR(128) NOT NULL")
    private String memo;

    @Column(columnDefinition="VARCHAR(64) NOT NULL")
    private String url;

    @ManyToOne
    @JoinColumn
    private Admin updateAdmin;


}
