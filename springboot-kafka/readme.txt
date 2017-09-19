kafka:
1.引入pom
   <dependency>
       <groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-starter</artifactId>
   </dependency>

   <dependency>
       <groupId>org.springframework.kafka</groupId>
       <artifactId>spring-kafka</artifactId>
       <version>1.1.1.RELEASE</version>
   </dependency>

2.kafka基础配置
  spring.kafka.bootstrap-servers=101.132.33.120:9092
  spring.kafka.consumer.group-id=myGroup

  #指定消息key和消息体的编解码方式
  spring.kafka.consumer.key-deserializer=org.apache.kafka.common.serialization.StringDeserializer
  spring.kafka.consumer.value-deserializer=org.apache.kafka.common.serialization.StringDeserializer
  spring.kafka.producer.key-serializer=org.apache.kafka.common.serialization.StringSerializer
  spring.kafka.producer.value-serializer=org.apache.kafka.common.serialization.StringSerializer

3.消息发送class
   @Autowired
      private KafkaTemplate kafkaTemplate;

      kafkaTemplate.send("test-topic", "hello") /kafkaTemplate.send("test-topic", "key", "hello")

4.listener
  用@KafkaListener指定哪个方法处理消息即可。同时指定该方法用于监听kafka中哪些topic。
  @KafkaListener(topics = {"test-topic"})