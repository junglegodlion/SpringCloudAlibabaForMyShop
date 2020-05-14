package com.funtl.spring.security.oauth2.resource.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "shop")
public class Shop implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "`name`")
    private String name;

    @Column(name = "remark_score")
    private BigDecimal remarkScore;

    @Column(name = "price_per_man")
    private Integer pricePerMan;

    @Column(name = "latitude")
    private BigDecimal latitude;

    @Column(name = "longitude")
    private BigDecimal longitude;

    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "tags")
    private String tags;

    @Column(name = "start_time")
    private String startTime;

    @Column(name = "end_time")
    private String endTime;

    @Column(name = "address")
    private String address;

    @Column(name = "seller_id")
    private Integer sellerId;

    @Column(name = "icon_url")
    private String iconUrl;

    private static final long serialVersionUID = 1L;
}