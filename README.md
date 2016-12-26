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

### references

* http://start-scs.cfapps.io/
