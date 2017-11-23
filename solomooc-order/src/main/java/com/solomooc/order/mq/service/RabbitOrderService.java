package com.solomooc.order.mq.service;

import com.github.miemiedev.mybatis.paginator.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;

public class RabbitOrderService {


    //消费者接受的是生产者提供的数据
    //当前传递的是对象 所以必须序列化 否则不能传输
    public void saveOrder(Order order) {


    }
}
