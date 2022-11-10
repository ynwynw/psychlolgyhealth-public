# 校园心理咨询平台

这个项目实现了校园在线心理测试和心理咨询的基本功能，提供了后台管理。网站界面简单但是适合学习使用。

## Run

- 导入数据库，SQL 脚本在 `sql` 目录内

- 运行前端工程 `tequila`

  ```
  cd tequila/
  npm install
  npm run serve
  ```

- 在 `gin/src/main/resources/application.properties`修改数据库连接参数

- 运行后端工程 `gin`

  ```
  cd gin/
  mvn spring-boot:run
  ```

- 访问 `localhost:8080` 并登入网站（初始用户名 admin 密码 123456）

## Screenshots

用户在线测试

<img src="screenshots/user-test.png" alt="user-test" style="zoom:50%;" />

用户个人中心

<img src="screenshots/user-chat.png" alt="user-chat" style="zoom:50%;" />

后台用户管理

<img src="screenshots/admin-user.png" alt="user-chat" style="zoom:50%;" />

后台文章管理

<img src="screenshots/admin-post.png" alt="user-chat" style="zoom:50%;" />

后台测试管理

<img src="screenshots/admin-result.png" alt="user-chat" style="zoom:50%;" />

后台回复咨询

<img src="screenshots/admin-chat.png" alt="user-chat" style="zoom:50%;" />

