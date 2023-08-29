package com.github.felipovski.testrabbitmq;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-17T16:19:22-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDto toDto(Product entity) {
        if ( entity == null ) {
            return null;
        }

        String name = null;
        double price = 0.0d;

        name = entity.getName();
        price = entity.getPrice();

        ProductDto productDto = new ProductDto( name, price );

        return productDto;
    }

    @Override
    public Product fromDto(ProductDto dto) {
        if ( dto == null ) {
            return null;
        }

        Product product = new Product();

        product.setName( dto.name() );
        product.setPrice( dto.price() );

        return product;
    }

    @Override
    public List<ProductDto> toListDto(List<Product> entity) {
        if ( entity == null ) {
            return null;
        }

        List<ProductDto> list = new ArrayList<ProductDto>( entity.size() );
        for ( Product product : entity ) {
            list.add( toDto( product ) );
        }

        return list;
    }
}
