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

```
curl localhost:8080/sash/blocking/Moses

curl localhost:8080/sash/mutiny/Sashvin

```
