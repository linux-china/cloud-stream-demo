Spring Cloud Stream Demo
========================

Demo for stream listener and message sending.

### Vocabulary

* Source: 源，向其发送信息, data source
* Sink: 接收器，从其接收信息, data sink
* Processor: 处理器，从sink接收，然后处理，最后在发送到source， one input and one output channel
* Transformer: 编译器/转换器，将接收消息的内容进行转换成为不同的内容
* Binder: Binder abstraction for use in connecting to physical destinations at the external middleware
* Aggregation: Spring Cloud Stream provides support for aggregating multiple applications together, connecting their input and output channels directly and avoiding the additional cost of exchanging messages via a broker

### Processor Example with Reactive

```
@EnableBinding(Processor.class)
@EnableAutoConfiguration
public static class UppercaseTransformer {

  @StreamListener
  @Output(Processor.OUTPUT)
  public Flux<String> receive(@Input(Processor.INPUT) Flux<String> input) {
    return input.map(s -> s.toUpperCase());
  }
}
```
### Kafka Integration

* Please start Kafka by Spring Cloud CLI
```
     $ spring cloud kafka
```
* Create topic
```
     $ ./kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic testTopic
     $ ./kafka-topics.sh --list --zookeeper localhost:2181
```
or
```
     $ docker exec -ti kafka_container_id /opt/kafka_2.11-0.9.0.1/bin/kafka-topics.sh --list --zookeeper 127.0.0.1:2181
```
### Terraform

If you use terraform, please install terraform kafka plugin, then execute:
```
    $ terraform apply
```

### references

* http://start-scs.cfapps.io/
