package io.quarkus.grpc.sash.hello;

import static io.restassured.RestAssured.get;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
class HelloWorldEndpointTest {

    @Test
    public void testHelloWorldServiceUsingBlockingStub() {
        String response = get("/sash/blocking/neo").asString();
        assertThat(response).startsWith("RPC Hello neo");
    }

    @Test
    public void testHelloWorldServiceUsingMutinyStub() {
        String response = get("/sash/mutiny/neo-mutiny").asString();
        assertThat(response).startsWith("RPC Hello neo-mutiny");
    }

}
