<?xml version="1.0" encoding="UTF-8"?>
<hibernate-configuration>
<session-factory>
<property name="hbm2ddl.auto">update</property>
<property name="dialect">org.hibernate.dialect.MySQL8Dialect</property>
<property name="connection.url">jdbc:mysql://localhost:3306/c1234</property>
<property name="connection.username">root</property>
<property name="connection.password">Bhavani@98</property>
<property name="connection.driver_class">com.mysql.cj.jdbc.Driver</property>
<property name="show_sql">true</property>
<mapping class="com.com.employee" />
</session-factory>
</hibernate-configuration>