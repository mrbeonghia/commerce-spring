package com.shopping.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.List;

/**
 * @author Vito
 * @email zhouwentao16@gmail.com
 * @date 2013-7-9
 */
@Setter
@Getter
@Entity
@DynamicUpdate
@Table(name = "t_product")
public class Product extends AbstractEntity {

    @Column(columnDefinition="VARCHAR(64) NOT NULL")
    private String title;

    @Column(columnDefinition="DOUBLE NOT NULL COMMENT")
    private Integer point;

    @ManyToOne
    @JoinColumn
    private Picture masterPic;//主图

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Picture> slavePic;//关联图

    @Lob
    @Column(columnDefinition = "TEXT COMMENT")
    private String note;

    @Column(columnDefinition="VARCHAR(32) NOT NULL")
    private String code;

    @Column(columnDefinition="VARCHAR(32) NOT NULL")
    private String model;

    @Column(columnDefinition="INT(11) NOT NULL")
    private Long stock;

    @ManyToOne
    @JoinColumn
    private Admin inputUser;

}
