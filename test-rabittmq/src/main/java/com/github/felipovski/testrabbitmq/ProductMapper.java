package com.github.felipovski.testrabbitmq;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductDto toDto(Product entity);
    Product fromDto(ProductDto dto);
    List<ProductDto> toListDto(List<Product> entity);
}
