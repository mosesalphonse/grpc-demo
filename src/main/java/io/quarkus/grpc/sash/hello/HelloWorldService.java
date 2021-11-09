package io.quarkus.grpc.sash.hello;

import java.util.concurrent.atomic.AtomicInteger;

import sash.Greeter;
import sash.HelloReply;
import sash.HelloRequest;
import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;

@GrpcService
public class HelloWorldService implements Greeter {

    AtomicInteger counter = new AtomicInteger();

    @Override
    public Uni<HelloReply> sayHello(HelloRequest request) {
        System.out.println("Request Payload :"+request);
        int count = counter.incrementAndGet();
        String name = request.getName();
        String message=request.getName() + request.getDept();
        return Uni.createFrom().item("RPC Hello " + name)
                .map(res -> HelloReply.newBuilder().setMessage(res).setNewMessage(message).setCount(count).build());
    }
}
