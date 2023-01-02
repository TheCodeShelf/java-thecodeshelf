package com.thecodeshelf.learningtestcontainers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {

    @Field("product_id")
    private String productId;

    @Field("sku")
    private String sku;

    @Field("quantity")
    private Integer quantity;

    // Placed it here to avoid multiple Query 'at once' when retrieving cart Details
    // When an item is added (saved to DB) the cartName is populated
    @Field("category_name")
    private String categoryName;

}
