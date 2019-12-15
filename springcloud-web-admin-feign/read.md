创建服务消费者(Feign)

Feign 是自带熔断器的，但默认是关闭的需要在配置文件中配置打开它，在配置文件增加以下代码：
feign:
  hystrix:
    enabled: true