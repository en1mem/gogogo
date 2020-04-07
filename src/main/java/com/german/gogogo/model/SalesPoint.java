package com.german.gogogo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "sales_point")
@Getter
@Setter
public class SalesPoint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "total_profit")
    private Long totalProfit;

    @Column(name = "total_value")
    private Long totalValue;

    public SalesPoint() {}
}
