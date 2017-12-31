# SpringRabbitMQ-Exchange-FanOut
Spring rabbitmq's one exchange type for Fanout.



本例子是关于spring rabbitmq Fanout Exchange 消息广播的模式的实现。

创建一个新的exchange "fanoutExchange",
创建三个queue ：
Queue fanout.A
Queue fanout.B
Queue fanout.C

当一个message被发出，会同时推送到三个queue,message不会在queue中停留。
