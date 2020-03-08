# config-server启动报没有配置git rui问题

* 排查思路：直接用java -jar 启动服务，不要光靠idea自带的启动功能
* 问题解决：pom中添加resource，将yaml文件打包到jar中