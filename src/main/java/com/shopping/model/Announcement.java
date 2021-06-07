/**
 *
 */
package com.shopping.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Setter
@Getter
@Table(name = "t_announcement")
public class Announcement extends AbstractEntity {

    @Column(columnDefinition="VARCHAR(512) NOT NULL")
    private String content;

    @ManyToOne
    @JoinColumn(columnDefinition="BIGINT(20) NOT NULL")
    private Admin createAdmin;

}
