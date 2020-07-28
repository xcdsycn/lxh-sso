# project 说明
1. spring boot 升级到2.2.9
2. Spring cloud 2.2.2
3. Spring security 5.2.3
4. 升级以后需要注意的地方
  - PasswordEncoder 方式发生变化，需要在前面加{id}，否则会返回id为null的错误
  - 客户端需要注入authenticationManager，所以需要在配置文件中以@Bean的形式注入，虽然spring的官方已经有issue发出来了，可是目前没有解决办法
  - 升级过程中，最需要注意的就是spring的各种版本问题，所以针对目前的状况，Spring的版本管理还是不能一致的命名，而spring boot与spring cloud
  分别命名版本号，导致升级的时候，一定要注意
  - spring.io.pom工程，在2019年已经停止维护了，所以不要再使用了，官方推荐直接使用spring-boot-dependencies或另外的一个东西，这个在官网有说
 
 # 总结
 1. 采用最新版本的Spring framework组件 还是需要一些耐心的，遇到问题直接解决问题就行了
 2. 对于出现的错误，出现一个解决一个，最好的办法仍然是google或baidu，这样解决问题最快，先解决，再去知道为什么，特别是没有思路的时候，就这样去做
 3. 对于提示中出现的问题，不要大改，要改的尽量少
 4. 对于实再没办法解决的，就要放一下，过一天，有精神了再去处理，这样效果会好些

