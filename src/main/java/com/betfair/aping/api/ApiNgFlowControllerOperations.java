package com.betfair.aping.api;

import com.betfair.aping.entities.*;
import com.betfair.aping.enums.*;
import com.betfair.aping.exceptions.APINGException;
//import com.betfair.aping.util.JsonConverter;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Locale;


public class ApiNgFlowControllerOperations {
    //extends ApiNgOperations {

    //move Strings from ApiNGOperations into here
    protected final String FILTER = "filter";
    protected final String LOCALE = "locale";
    protected final String SORT = "sort";
    protected final String MAX_RESULT = "maxResults";
    protected final String MARKET_IDS = "marketIds";
    protected final String MARKET_ID = "marketId";
    protected final String INSTRUCTIONS = "instructions";
    protected final String CUSTOMER_REF = "customerRef";
    protected final String MARKET_PROJECTION = "marketProjection";
    protected final String PRICE_PROJECTION = "priceProjection";
    protected final String MATCH_PROJECTION = "matchProjection";
    protected final String ORDER_PROJECTION = "orderProjection";
    protected final String locale = Locale.getDefault().toString();

}
//    private static ApiNgFlowControllerOperations instance = null;

//    private ApiNgFlowControllerOperations(){}

 //   public static ApiNgFlowControllerOperations getInstance(){
  //      if (instance == null){
  //          instance = new ApiNgFlowControllerOperations();
  //      }
 //      return instance;
  //  }

 //list EventTypeResult was here

 //MarketBook was here

//MarketCatalogue was here

 //PlaceExecutionReport was here


 //  MakeRequest was here

 //   }
//}nh removal of makerequest

