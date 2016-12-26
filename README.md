Spring Cloud Stream Demo
========================

Demo for stream listener and message sending.

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
