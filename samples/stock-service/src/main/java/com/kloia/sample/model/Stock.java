package com.kloia.sample.model;

import com.kloia.eventapis.spring.model.JpaEntity;
import com.kloia.eventapis.view.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

/**
 * Created by zeldalozdemir on 17/02/2017.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@javax.persistence.Entity(name = "STOCK")
public class Stock extends JpaEntity {
    private String stockName;
    private long remainingStock;
    private StockState state;
}
