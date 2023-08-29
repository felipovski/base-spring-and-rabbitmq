package com.github.felipovski.notification;

import org.springframework.stereotype.Component;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@Component
public class OnProductCreatedListener {

    @RabbitListener(queues = "products.v1.product-created.notification")
    public void onProductCreated(ProductDto dto) {
        System.out.println("Mensagem: \n\n" + dto + "\n\n");
    }

}
