1.细节
  Collections.synchronizedMap &&  ConcurrentHashMap && Hashtable
  Hashtable： 使用 synchronized 来保证线程安全的，效率低下
  Collections.synchronizedMap： 调用 synchronizedMap() 方法后会返回一个 SynchronizedMap 类的对象，而在 SynchronizedMap 类中使用了 synchronized 同步关键字来保证对 Map 的操作是线程安全的
  ConcurrentHashMap：
      spring的底层数据结构就是使用ConcurrentHashMap实现的
      JDK8摒弃了旧版本Segment（锁段）的概念，而是启用了一种全新的方式实现,利用CAS算法
      底层依然由“数组”+链表+红黑树的方式思想；增加了很多辅助的类，例如TreeBin，Traverser等对象内部类做到并发
      大量使用了U.compareAndSwapXXX的方法，这个方法是利用一个CAS算法实现无锁化的修改值的操作，他可以大大降低锁代理的性能消耗

2.Swagger2：提供了强大的页面测试功能来调试每个RESTful API
  实现过程：
  a.jar包
     springfox-swagger2
     springfox-swagger-ui
  b.配置
    @Bean
        public Docket createRestApi()
  c.添加注解
     @ApiOperation(value = "获取用户列表", notes = "用户列表")



