package com.thecodeshelf.learningtestcontainers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

import java.util.UUID;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@Testcontainers
class LearningTestcontainersApplicationTests {

	@Autowired
	private CartRepository cartRepository;

	@Container
	private static MongoDBContainer container = new MongoDBContainer(DockerImageName.parse("mongo:4.0.10"));

	@DynamicPropertySource
	public static void overrideProps(DynamicPropertyRegistry registry){
		registry.add("spring.data.mongodb.uri",container::getReplicaSetUrl);
	}

	@Test
	void firstTest() {
		CartCollection cart = new CartCollection();
		cart.setCartId(UUID.randomUUID().toString());
		cartRepository.save(cart);
		System.out.println("Cart has been saved to the Test Container");
		int totalCartCount = (int) cartRepository.count();
		System.out.println("Cart Count from Mongo Test Container is : " + totalCartCount);
	}

}
