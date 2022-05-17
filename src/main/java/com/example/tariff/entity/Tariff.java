package com.example.tariff.entity;



import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tariff", schema = "public")
public class Tariff {
    @Id
    @Column(name = "device_id")
    private Long id;

    @Column(name = "cnum")
    private String cnum;

    @Column(name = "tariff_key")
    private String tariffKey;

    @Column(name = "tariff_type")
    private Integer tariffType;

    @Column(name = "tariff_fix")
    private String tariffFix;

    @Column(name = "tariff_percent")
    private Double tariffPercent;

    @Column(name = "tariff_min")
    private String tariffMin;
}
