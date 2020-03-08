### config-server启动报没有配置git rui问题

* 排查思路：直接用java -jar 启动服务，不要光靠idea自带的启动功能
* 问题解决：pom中添加resource，将yaml文件打包到jar中

### 注册中心没有正确的发现配置中心，注册失败

* 注册中心地址，需要稳定的网络标识
* 网络标识不是service-name，而是eureka-server-0.eureka-server.test

### Cannot clone or checkout repository

* 查看服务日志，报错：not authorized，账号信息没有识别到
* 账号密码放在configmap中没问题，放入secret中就报错！