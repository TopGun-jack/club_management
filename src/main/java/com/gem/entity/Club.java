package com.gem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @author 张文涛
 * @date 2019/9/11/011 10:34
 */
@Data
@Entity
@Table(name = "club")
@NoArgsConstructor
@AllArgsConstructor
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String name;
    private String principal;
    @Enumerated
    private ClubType clubType;

    private Date createTime;
    private String activities;
    private String members;

    private String remarks;

}
