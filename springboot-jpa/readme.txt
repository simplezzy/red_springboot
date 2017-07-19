ORM框架
1. Spring-data-jpa依赖于Hibernate
   实现：
     1. jar: spring-boot-starter-data-jpa
     2. DB 配置
          spring.datasource.url=jdbc:mysql://localhost:3306/db_wb_test?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC
          spring.datasource.username=root
          spring.datasource.password=123456
          spring.datasource.driver-class-name=com.mysql.jdbc.Driver
          #hibernate的配置属性，其主要作用是：自动创建、更新、验证数据库表结构
          spring.jpa.properties.hibernate.hbm2ddl.auto=update
     3. 创建Entity
     4. 创建数据访问接口
     5. UT
