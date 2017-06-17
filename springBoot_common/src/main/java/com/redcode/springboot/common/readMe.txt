1.SpringBoot Web 项目集成jsp
  a.官方不推荐使用JSP，而且它的官方使用的是模块theamleaf,需要创建webApp/WEB-INF/view结构
  b.在application.properties添加配置文件
    # 页面默认前缀目录
    spring.mvc.view.prefix=/WEB-INF/view/
    # 响应页面默认后缀
    spring.mvc.view.suffix=.jsp
  c.在pom.xml文件中依赖对jsp支持的相关包
    <!--支持jsp的两个pkg-->
    		<dependency>
    			<groupId>org.apache.tomcat.embed</groupId>
    			<artifactId>tomcat-embed-jasper</artifactId>
    			<version>9.0.0.M20</version>
    		</dependency>

    		<dependency>
    			<groupId>javax.servlet</groupId>
    			<artifactId>jstl</artifactId>
    			<version>1.2</version>
    		</dependency>
  d.run app测试

  一个问题:加入thmeleaf后,jsp就不能再进行解析了,后面再解决该问题


2.热部署
  a.在pom.xml添加依赖以及配置项
     <!--使用spring-boot-1.3以后有的热部署功能-->
     		<dependency>
     			<groupId>org.springframework.boot</groupId>
     			<artifactId>spring-boot-devtools</artifactId>
     			<version>1.5.4.RELEASE</version>
     			<optional>true</optional>
     		</dependency>

     在plugin添加
            <!--热部署开启-->
            				<configuration>
            					<fork>true</fork>
            				</configuration>
  b.IDEA需要打开两设置
     atl+cmd+shift+/  设置registry  app.running
     cmd+,   设置build,compile,  make projects automatecally

  c.在properties中,设置
     #开发时关闭缓存,用于页面热部署
     spring.thymeleaf.cache=false

3.thymeleaf 引擎
  a.在pom.xml添加依赖
     <!--官方推荐的试图解析器-->
     		<!--spring-boot-starter-thymeleaf包括了spring-boot-starter-web-->
     		<dependency>
     			<groupId>org.springframework.boot</groupId>
     			<artifactId>spring-boot-starter-thymeleaf</artifactId>
     			<version>1.5.4.RELEASE</version>
     		</dependency>
  b.默认路径中编写.html
       #spring.thymeleaf.prefix=classpath:/templates/
       #spring.thymeleaf.suffix=.html
    resources文件夹下，static文件夹下存放静态文件，比如css、js、html和图片等
    templates下存放html文件，controller默认访问该文件夹下的html文件。

  c.配置文件中关闭thymeleaf缓存
    spring.thymeleaf.cache=false
  d.controller 测试

