## spring-cloud-demo
> spring cloud 学习笔记  
> 详细内容：https://blog.csdn.net/houwanle/article/details/114231943

### 1. 环境
约定 > 配置 > 编码

- spring cloud：Hoxton.SR1
- spring boot：2.2.2.RELEASE
- spring cloud Alibaba：2.1.0.RELEASE
- jdk：1.8
- maven：3.5及以上（阿里云仓库）
- mysql：5.7及以上
- lombok：idea 插件
- zookeeper：docker 安装 zookeeper
- consul：Windows 安装版

### 2. 模块划分
- cloud-provider-payment8001：服务提供者-----支付模块
- cloud-provider-payment8002：服务提供者-----支付模块
- cloud-consumer-order80：服务消费者-----订单模块
- cloud-api-commons：自定义jar包-----公共模块
- cloud-eureka-server7001：服务注册中心------Eureka模块
- cloud-eureka-server7002：服务注册中心------Eureka模块
- cloud-provider-payment8004：服务提供者-----支付模块(注册到zookeeper)
- cloud-consumerzk-order80：服务消费者------订单模块(注册到zookeeper)
- cloud-providerconsul-payment8006：服务提供者------支付模块(注册到consul)
- cloud-consumerconsul-order80：服务消费者------订单模块(注册到consul)
- cloud-consumer-feign-order80：使用 OpenFeign 的消费者模块
- cloud-provider-hystrix-payment8001：使用 Hystrix 的服务提供者模块
- cloud-consumer-feign-hystrix-order80：使用 Hystrix 的消费者模块
- cloud-consumer-hystrix-dashboard9001：Hystrix Dashboard 模块
- cloud-gateway-gateway9527：网关 Gateway 模块
- cloud-config-center-3344：配置中心模块
- cloud-config-client-3355：配置中心客户端
- cloud-config-client-3366：配置中心客户端
- cloud-stream-rabbitmq-provider8801：消息驱动之生产者模块
- cloud-stream-rabbitmq-provider8801：消息驱动之消费者模块