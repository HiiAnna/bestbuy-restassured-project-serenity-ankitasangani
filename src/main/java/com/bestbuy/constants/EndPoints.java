package com.bestbuy.constants;

public class EndPoints {

    /**
     * This is Endpoints of stores api
     */
    public static final String GET_ALL_STORES = Path.STORES;
    public static final String GET_SINGLE_STORE_BY_ID = Path.STORES +"/{id}";
    public static final String UPDATE_STORE_BY_ID = Path.STORES +"/{id}";
    public static final String DELETE_STORE_BY_ID = Path.STORES +"/{id}";


    /**
     * This is Endpoints of products api
     */
    public static final String GET_ALL_PRODUCTS = Path.PRODUCTS;
    public static final String GET_SINGLE_PRODUCT_BY_ID = Path.PRODUCTS + "/{id}";
    public static final String UPDATE_PRODUCT_BY_ID = Path.PRODUCTS + "/{id}";
    public static final String DELETE_PRODUCT_BY_ID = Path.PRODUCTS + "/{id}";



}
