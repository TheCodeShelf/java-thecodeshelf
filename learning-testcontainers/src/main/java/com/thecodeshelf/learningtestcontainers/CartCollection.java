package com.thecodeshelf.learningtestcontainers;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.List;

/**
 * Cart will be converted to an Order
 */

@Data
@Document(collection = "cart")
public class CartCollection{

    @Id
    private ObjectId _id;

    @Field("cart_id")
    private String cartId;

    @Field("user_id")
    private String userId;

    @Field("customer_user_name")
    private String customerUserName;

    @Field("cart_items")
    private List<String> cartItems;

}
