package com.thecodeshelf.learningtestcontainers;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface CartRepository extends MongoRepository<CartCollection, String> {


}
