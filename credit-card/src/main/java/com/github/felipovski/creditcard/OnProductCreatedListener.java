package com.github.felipovski.creditcard;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class OnProductCreatedListener {

    @RabbitListener(queues = "products.v1.product-created.credit-card")
    public void onProductCreated(ProductDto dto) {
        System.out.println("Mensagem: \n\n" + dto + "\n\n");
    }

}
