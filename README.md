## SpringBoot JPA Demo

**16301070**  **梁洪铭**

### JavaEE四次作业
[第一次作业](https://github.com/PegasusLiang/EE_homework_1_JPA)

[第二次作业](https://github.com/PegasusLiang/EE_homework_2)

[第三次作业](https://github.com/PegasusLiang/EE_homework_3)

[第四次作业](https://github.com/PegasusLiang/EE_homework_4)

第一次作业的基础：

> 实现了基础的注册登录功能，同时展示t_gym跟t_user两表的数据。

> 实现了两表关联，UserEntity跟Gym是多对一的关系，在Gym类中建立关联。

> 实现Spring Cache，多次查询在第一次查询后不再从数据库中查询。

> 实现了分页，但未在前端页面显示。

> 实现了Auditing，创建时间，更新时间自动生成。> 前端的展示我用了thymeleaf来映射数据。

第二次作业基础：

1. Restful Service , restful api的设计。修改了上次的url设计
2. RateLimiting 限流实现，简单的限流。100s内允许10次访问为测试用例。
3. Online API documentation。 Using swagger实现接口文档生成
4. Cache部分保留之前的spring cache
5. Spring Security 尝试配置，但配置尚未完成。

第三次作业基础：

Kafka消息队列的应用


## **本次完成的点**

根据WebFlux重写RESTFUL services



1. 创建两个实体类

   用户**MemberReadHistory**浏览历史记录，以及**Gym**场馆。

   

   ![1560758914323](D:\A-University\3.5\笔记\typora-user-images\1560758914323.png)





2. DAO层 repository接口

   ![1560759042270](D:\A-University\3.5\笔记\typora-user-images\1560759042270.png)





3.  **GymHandler** 实现增删改查方法

![1560759178152](D:\A-University\3.5\笔记\typora-user-images\1560759178152.png)



4. **MemberReadHistoryServiceImpl** 实现浏览记录的相关操作方法

![1560759322637](D:\A-University\3.5\笔记\typora-user-images\1560759322637.png)



5. Controller层

**GymWebFluxController**

**MemberReadHistoryController**



GymWebFluxController将controller的服务改为RESTFUL形式，其中MemberReadHistoryController并没有更改路由。

Controller调用Handler实现的服务Service

![1560759529422](D:\A-University\3.5\笔记\typora-user-images\1560759529422.png)



**MemberReadHistoryController**

![1560759672663](D:\A-University\3.5\笔记\typora-user-images\1560759672663.png)



## 测试效果

先启动MongoDB服务

 mongod --dbpath ../../MongoDBPath

![1560758713779](D:\A-University\3.5\笔记\typora-user-images\1560758713779.png)

再在另一个命令行打开mongo服务，

mongo

![1560758725477](D:\A-University\3.5\笔记\typora-user-images\1560758725477.png)





运行SpringBoot

![1560758786702](D:\A-University\3.5\笔记\typora-user-images\1560758786702.png)



我们运用swagger来测试



![1560758604941](D:\A-University\3.5\笔记\typora-user-images\1560758604941.png)



输入POST的json数据，保存一个新的gym信息。



![1560758432418](D:\A-University\3.5\笔记\typora-user-images\1560758432418.png)



submit后我们到MongoDB中查看结果。

运行Robo 3T 图形化管理工具，发现新的场馆信息被存入了。



![1560758505297](D:\A-University\3.5\笔记\typora-user-images\1560758505297.png)
