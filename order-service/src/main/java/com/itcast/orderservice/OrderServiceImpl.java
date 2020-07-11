package com.itcast.orderservice;
import com.itcast.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class OrderServiceImpl implements OrderService {

    @GetMapping("/orders")
    public String orders() {
        return "return orders";
    }
}
