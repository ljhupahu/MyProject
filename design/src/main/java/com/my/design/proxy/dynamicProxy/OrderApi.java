package com.my.design.proxy.dynamicProxy;

/**
 * Created by jli on 3/21/2018.
 */
public interface OrderApi {
    public String getProductName();

    public void setProductName(String productName);

    public int getProductNum();

    public void setProductNum(int productNum);

    public String getOrderUser();

    public void setOrderUser(String orderuser);
}
