package com.betfair.aping.api;
import java.util.List;
import com.betfair.aping.entities.PriceSize;

import java.util.List;

public class StrategyManager {
    private List<PriceSize> oddsLowerBand;
 //   private double oddsLowerBand = 1;

    public List<PriceSize> getOddsLowerBand() {
        return oddsLowerBand;
    }

    public void setOddsLowerBand(List<PriceSize> oddsLowerBand) {
        this.oddsLowerBand = oddsLowerBand;
    }



}
