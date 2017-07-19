1.统一异常处理
  Spring Boot中实现了默认的error映射，但是在实际应用中，上面你的错误页面对用户来说并不够友好，我们通常需要去实现我们自己的异常提示
  实现：a. 创建全局异常处理类
           @ControllerAdvice  ： 定义统一的异常处理类，而不是在每个Controller中逐个定义
           @ExceptionHandler  ： 用来定义函数针对的异常类型
           当返回html页面：
               将Exception对象和请求URL映射到error.html中
           当返回Json格式：
               创建统一的返回对象：
               自定义异常
               在全局异常处理类添加捕捉自定义异常的方法，注意返回Json数据时,需要添加注解 @ResponseBody


