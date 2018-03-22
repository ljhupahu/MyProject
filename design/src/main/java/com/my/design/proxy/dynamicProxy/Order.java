package com.my.design.proxy.dynamicProxy;

/**
 * Created by jli on 3/21/2018.
 */
public class Order implements OrderApi {
    /**
     * 产品名称
     */
    private String productName;
    /**
     * 产品数量
     */
    private int productNum;
    /**
     * 下订单的用户
     */
    private String orderUser;

    @Override
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public int getProductNum() {
        return productNum;
    }

    public void setProductNum(int productNum) {
        this.productNum = productNum;
    }

    @Override
    public String getOrderUser() {
        System.out.println("getOrderUser");
        return orderUser;
    }

    public void setOrderUser(String orderUser) {
        this.orderUser = orderUser;
    }
}