通过JdbcTemplate编写数据访问
1. 数据源配置
   为了连接数据库需要引入jdbc支持, jar包  spring-boot-starter-jdbc
2. 嵌入式数据库支持
   嵌入式数据库通常用于开发和测试环境，不推荐用于生产环境
   提供自动配置的嵌入式数据库有H2、HSQL、Derby，不需要提供任何连接配置就能使用
   如配置使用HSQL：jar包：  hsqldb

3. 连接生产数据源
   mysql：mysql-connector-java
     spring.datasource.url=jdbc:mysql://localhost:3306/db_wb_test
     spring.datasource.driver-class-name=com.mysql.jdbc.Driver
     spring.datasource.data-username=root
     spring.datasource.password=123456

4. 连接JNDI数据源
   将应用部署于应用服务器上的时候想让数据源由应用服务器管理，那么可以使用如下配置方式引入JNDI数据源。
     spring.datasource.jndi-name=java:jboss/datasources/customers

5.error
  Q：使用JDBC连接MySql时出现：The server time zone value '�й���׼ʱ��' is unrecognized or represents more than one time zone.
  You must configure either the server or JDBC driver (via the serverTimezone configuration
  A：：jdbc:mysql://127.0.0.1:3306/test ?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC
