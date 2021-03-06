package com.byr.project.orderdemo.service;

import com.byr.project.orderdemo.dto.OrderDTO;

/**
 * @ClassName: OrderProduceService
 * @Description: TODO
 * @Author: yanrong
 * @Date: 2019/9/10 18:55
 * @Version: 1.0
 */
public  interface OrderProduceService {
    /**
     * 订单消息生产者服务
     * @param orderDTO
     */
    void produceOrder(OrderDTO orderDTO);
}
