# grpc-demo

gRPC is a framework/technology for implementing RPC APIs that uses HTTP 2.0 as its underlying transport protocol

## uses cases

```
a) For internal APIs where you don’t have to force technology choices on clients

b) Real-time communication services where you deal with streaming calls

c) Message exchange happens faster, even in devices with a slower CPU like IoT or mobile devices
```

## Start the Application on Dev Mode

```
mvn quarkus:dev

```

## Verify the Application

when we hit the below REST endpoint, the REST resource will invoke the gRPC using Quarkus gRPC client lib. Its Like GrpcClient --> gRPC API

```
curl localhost:8080/sash/blocking/Moses

```
or

```
curl localhost:8080/sash/mutiny/Sashvin

```

Access the gRPC service directly using the grpcurl

```
grpcurl --plaintext -d '{"name": "Sash", "dept": "Management", "age": "25"}' localhost:9000 helloworld.Greeter/SayHello
```

## Running in Native

Compile the application into a native binary

```
mvn clean install -Pnative
```

Run

```
./target/grpc-plain-text-sash-1.0.0-SNAPSHOT-runner

```
