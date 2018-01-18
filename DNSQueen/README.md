# DNSQueen
a socket dns manager ,which's function is send orders to DNSBrood and DNSBee . 

### 使用

* Star本项目

* 通过maven加载project:

     在dependencies标签下添加以下代码
     
        <dependency>
			<groupId>com.liumapp</groupId>
			<artifactId>DNSQueen</artifactId>
			<version>1.2.0</version>
		</dependency>

* 修改Spring配置文件：

    在beans标签下添加以下代码：
    
        <bean name="queenTcpSocketMonitor" class="com.liumapp.DNSQueen.worker.tcp.TCPSocketMonitor">
			<constructor-arg name="host" type="java.lang.String" value="0.0.0.0"></constructor-arg>
			<constructor-arg name="port" type="int" value="40310"></constructor-arg>
    	</bean>
    	<bean name="wokerEar" class="com.liumapp.DNSQueen.worker.process.WokerEar">
    		<property name="startDelay" value="3000"></property>
    	</bean>

* 添加Queen的工人：

    每一个工人视为继承了StandReadyWorker类的子类。
    假设有工人A和B，他们都继承了StandReadyWorker。
    那么Queen发出一条socket指令的时候，A收到指令，执行doWhatYouShouldDo方法执行任务（具体任务是什么由你自己定义），并返回null（当A返回的不是null，而是某一个String时，B将不会执行它的操作）。
    A工人返回null后，B继续收到指令执行它的doWhatYouShouldDo方法，返回“success”，Queen接受到“success”的消息并输出。


* 配置Bean的参数
        
        <?xml version="1.0" encoding="UTF-8"?>
        <beans xmlns="http://www.springframework.org/schema/beans"
               xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:context="http://www.springframework.org/schema/context"
               xmlns:util="http://www.springframework.org/schema/util"
               xsi:schemaLocation="
                 http://www.springframework.org/schema/beans
                 http://www.springframework.org/schema/beans/spring-beans.xsd
                 http://www.springframework.org/schema/context
                 http://www.springframework.org/schema/context/spring-context.xsd
                 http://www.springframework.org/schema/util
                 http://www.springframework.org/schema/util/spring-util.xsd">
        
            <context:annotation-config />
        
            <context:component-scan base-package="${yourpackage}" />
        
            <beans>
        
                <bean name="queenTcpSocketMonitor" class="com.liumapp.DNSQueen.worker.tcp.TCPSocketMonitor">
                    <constructor-arg name="port" type="int" value="40214"></constructor-arg>
                </bean>
        
                <bean name="wokerEar" class="com.liumapp.DNSQueen.worker.process.WokerEar">
                    <property name="startDelay" value="3000"></property>
                </bean>
        
            </beans>
        
        </beans>

