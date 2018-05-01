《spring in action》

第一章：Spring之旅
一.bean的生命周期
1.Spring对bean进行实例化
2.Spring将值和bean的引用注入到bean对应的属性中
3.如果bean实现了BeanNameAware接口 Spring将bean的ID传递给setBean-Name()方法
4.如果bean实现了BeanFactoryAware接口 Spring将调用setBeanFactory()方法
将BeanFactory容器实例传入
5.如果bean实现了ApplicationContextAware接口
Spring将调用setApplicationContext()方法 将bean所在的应用上下文的引用传入进来
6.如果bean实现了BeanPostProcessor接口 Spring将调用它们的postProcessBeforeInitialization()方法
7.如果bean实现了InitializingBean接口 Spring将调用它们的after-PropertiesSet()方法
类似地 如果bean使用init-method声明了初始化方法 该方法也会被调用
8.如果bean实现了BeanPostProcessor接口 Spring将调用它们的postProcessAfterInitialization()方法
9.此时bean已经准备就绪 可以被应用程序使用了
它们将一直驻留在应用上下文中 直到该应用上下文被销毁
10.如果bean实现了DisposableBean接口 Spring将调用它的destroy()接口方法
同样如果bean使用destroy-method声明了销毁方法 该方法也会被调用

第二章：装配Bean
Spring提供了三种主要的装配机制：
1.在XML中进行显示配置
2.在Java中进行显示配置
3.隐式的bean发现机制和自动装配

第三章：高级装配
1.spring.profile
profile:dev
profile:sit
profile:produce
根据不同环境来装配不同的Bean

2.bean的作用域
在默认情况下 Spring应用上下文中所有bean都是作为以单例(singleton)的形式创建的
也就是说 不管给定的一个bean被注入到其他bean多少次 每次注入的都是同一个实例

Spring定义了多种作用域
单例(Singleton)：在整个应用中 只创建bean的一个实例
原型(Prototype)：每次注入或者通过Spring应用上下文获取的时候 都会创建一个新的bean实例
    适用于易变的类型
会话(Session)：在web应用中 为每个会话创建一个bean实例
    如果购物车是单例的话 那么将会导致所有的用户都会向同一个购物车中添加商品
    如果购物车是原型作用域的 那么在应用中某一个地方往购物车中添加商品
    在应用的另外一个地方可能就不可用了 因为在这里注入的是另外一个原型作用域的购物车
    购物车bean来说 会话作用域是最为合适的 因为它与给定的用户关联性最大
请求(Request)：在web应用中 为每个请求创建一个bean实例

第四章：面向切面的Spring
一.Spring提供了4种类型的AOP支持
1.基于代理的经典Spring AOP
2.纯POJO切面
3.@AspectJ注解驱动的切面
4.注入式AspectJ切面(适用于Spring各版本)
前三种都是Spring AOP实现的变体 Spring AOP构建在动态代理基础之上
因此 Spring对AOP的支持局限于方法拦截

151 start







