1.mongo DB
    一个基于分布式文件存储的数据库，它是一个介于关系数据库和非关系数据库之间的产品，
  其主要目标是在键/值存储方式（提供了高性能和高度伸缩性）和传统的RDBMS系统（具有丰富的功能）之间架起一座桥梁，它集两者的优势于一身
    数据结构非常松散，是类似json的bson格式，因此可以存储比较复杂的数据类型，在Nodejs程序应用中使用非常流畅

    较常见的，可以直接用MongoDB来存储键值对类型的数据，验证码、Session等；
    由于MongoDB的横向扩展能力，也可以用来存储数据规模会在未来变的非常巨大的数据，如：日志、评论等；由于MongoDB存储数据的弱类型，
    也可以用来存储一些多变json数据，如：与外系统交互时经常变化的JSON报文。
    而对于一些对数据有复杂的高事务性要求的操作，如：账户交易等就不适合使用MongoDB来存储。

2,应用
  1. jar包：spring-data-mongodb
  2. Entity
  3. 数据访问对象
  4. 参数配置
       spring.data.mongodb.uri=mongodb://username:password@localhost:27017/test
