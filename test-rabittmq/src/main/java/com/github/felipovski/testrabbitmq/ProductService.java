package com.github.felipovski.testrabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRespository repository;
    private final ProductMapper mapper;
    private final RabbitTemplate rabbitTemplate;
    public ProductService(ProductRespository repository, ProductMapper mapper, RabbitTemplate rabbitTemplate) {
        this.repository = repository;
        this.mapper = mapper;
        this.rabbitTemplate = rabbitTemplate;
    }

    public ProductDto add(ProductDto dto) {

        var saved = mapper.toDto(repository.save(mapper.fromDto(dto)));
        rabbitTemplate.convertAndSend("products.v1.product-created.notification", dto);
        rabbitTemplate.convertAndSend("products.v1.product-created.credit-card", dto);

        return saved;
    }
}
