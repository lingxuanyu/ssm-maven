

## 错误知道

### 文件位置（第一步）
```bash
src/main/java: 放置程序包
src/main/java: 放置配置文件(spring.xml  springmvc.xml db.properties  log4j.properties等文件信息)
注意，src 下的 main 与 test需要通过Project Structure 设置一个文件类型。

web/：
	防止网页资源文件

web/WEB-INF/:
	web.xml 文件位置	
	机密文件
```

### web.xml 设置（第二步）

### 主要配置文件位置：file-> Project Structure  与 file->setting

```bash
1、 点击 file ->Project Structure->Facets:
修改	Deployment Descriptors 位置: 
	(默认maven采用了自己的web.xml文件位置，修改为自己项目下的web.xml文件位置）
修改 Web Resource Directories 位置:
	(默认maven采用了自己的，我们设置为自己的resources文件位置，一般为src/main/resources)；

2、 点击 file->	Project Structure ->Artifacts:
点击中间的 ”+“ 添加一个WebApplication（Exploed or artifacts），就是打成一个war包，
这样IDEA配置的tomcate即可运行war包程序了；

3、接着上一步，将Available 下的文件，点击右键 add output 添加到左侧；

4、 点击OK；

```


### 配置Tomcate与运行程序（第三步）
```bash
1、点击 Run/Debug Configurations 进入，点击左上角的 “+” 号，找到tomcate server -> local；

2、 填写Name（项目启动名称）
中间的: On 'Update' action : Update classes and 	resources
		On 'frame' deactivation	'Update classes and resources'；

3、 port端口号

4、 点击Deployment, 点击 “+” 添加刚才的 Artifacts ，如果没有设置Artifacts，
可以点击下方的 "+"(before branch:)
	Build 'xxxx' : war exploded artifacts ；

```

### 测试
- http://localhost:8080/ssm01/index；

```bash
（自己配置数据库连接）

修改src/main/resources 的db.properties文件信息：
jdbc.user=root
jdbc.password=
jdbc.jdbcUrl=jdbc:mysql://localhost:3306/user
jdbc.driverClass=com.mysql.jdbc.Driver
jdbc.minPoolSize=10
jdbc.maxPoolSize=20；
```

- 结果为：{"id":1,"username":"lilngxaunyu","password":"lingxuanyu"}；

### 错误处理办法
```bash
只出现 ： No Spring WebApplicationInitializer types detected on classpath
web.xml文件没有进入入口，查看并且修改第二步操作；

server：

Tomcate Catalina Log:
	服务器启动信息日志；

Tomcate Localhost Log
	本地信息日志；
	
```

