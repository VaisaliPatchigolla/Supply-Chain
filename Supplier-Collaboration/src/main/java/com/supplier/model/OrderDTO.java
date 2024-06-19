package com.supplier.model;

import java.util.Date;

public class OrderDTO {
    private Long orderId;
    private Date orderDate;
    private Integer quantity;
    private ProductDTO product;

    public OrderDTO() {
        super();
    }

    public OrderDTO(Long orderId, Date orderDate, Integer quantity, ProductDTO product) {
        super();
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.quantity = quantity;
        this.product = product;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public ProductDTO getProduct() {
        return product;
    }

    public void setProduct(ProductDTO product) {
        this.product = product;
    }
}
