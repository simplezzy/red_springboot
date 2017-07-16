1. application.properties 主要用来配置数据库连接、日志相关配置等

2. 自定义属性与加载
   自定义:
      spring.com.github.username = simplezzy
      spring.com.github.desc = github 自定义属性
   加载：
      @Value("${属性名}")注解来加载对应的配置属性

3.

4.获取属性后出现中文乱码
  添加属性：spring.http.encoding.force=true
  或者：@PropertySource(value = "classpath:application.properties", encoding = "UTF-8")


