# Spring-Vue 全栈开发学习项目

一个用于学习 Spring Boot + Vue.js 全栈开发的完整项目集合，包含多个子项目用于不同的学习阶段。

## 📋 项目概述

本项目是一个全栈开发学习资源，主要包含：
- **大事件管理系统** - 完整的前后端分离项目
- **Vue.js 基础教程** - 从入门到进阶的 Vue 学习案例
- **Axios 演示项目** - HTTP 请求库的使用示例

## 🛠️ 技术栈

### 后端技术
- **Spring Boot 3.1.3/3.1.4** - 主框架
- **Java 17** - 开发语言
- **MyBatis 3.0.0** - 持久层框架
- **MySQL** - 数据库
- **Redis** - 缓存数据库
- **JWT** - 身份认证
- **阿里云 OSS** - 文件存储
- **PageHelper** - 分页插件
- **Lombok** - 代码简化
- **Spring Validation** - 参数校验

### 前端技术
- **Vue 3.5.18** - 前端框架
- **Vite 7.0.6** - 构建工具
- **Axios** - HTTP 客户端
- **Node.js 20.19.0+** - 运行环境

## 📁 项目结构

```
spring-vue-starter/
├── big-event/                 # 大事件管理系统后端
│   ├── src/main/java/com/goodlab/
│   │   ├── controller/        # 控制器层
│   │   ├── service/          # 业务层
│   │   ├── mapper/           # 数据访问层
│   │   ├── pojo/             # 实体类
│   │   ├── utils/            # 工具类
│   │   ├── config/           # 配置类
│   │   ├── interceptors/     # 拦截器
│   │   └── exception/        # 异常处理
│   └── src/main/resources/
│       └── application.yml   # 配置文件
├── big-event-client/          # Vue 3 前端项目
│   ├── src/
│   │   ├── components/       # 组件
│   │   └── assets/          # 静态资源
│   └── package.json         # 依赖配置
├── big-event-vue/            # Vue 基础学习案例
│   ├── 01快速入门.html
│   ├── 02指令v-for.html
│   ├── 03指令v-bind.html
│   ├── 04指令v-if&v-show.html
│   ├── 05指令v-on.html
│   ├── 06指令v-model.html
│   ├── 07axios使用.html
│   └── 08vue案例.html
├── axios_demo/               # Axios 使用演示
│   └── src/main/java/com/itheima/
└── docs/                     # 项目文档
    ├── big_event.sql         # 数据库脚本
    └── 大事件接口文档.md      # API 接口文档
```

## 🚀 快速开始

### 环境要求
- Java 17+
- MySQL 8.0+
- Redis 6.0+
- Node.js 20.19.0+
- Maven 3.6+

### 数据库配置

#### MySQL 连接
```bash
mysql -u root -p --socket=/var/run/mysqld/mysqld.sock
```

#### 数据源配置
```yaml
# 生产环境配置示例
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://127.0.0.1:3306/AI_platform?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=root123456

# 项目实际配置（big-event项目）
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/big_event
    username: root
    password: root123456
  data:
    redis:
      host: localhost
      port: 6379
```

### 运行项目

#### 1. 初始化数据库
```bash
# 执行数据库脚本
mysql -u root -p < docs/big_event.sql
```

#### 2. 启动后端服务

##### 大事件管理系统
```bash
cd big-event
mvn clean install
mvn spring-boot:run
```
服务启动后访问：`http://localhost:8080`

##### Axios 演示项目
```bash
cd axios_demo
mvn clean install
mvn spring-boot:run
```

#### 3. 启动前端项目
```bash
cd big-event-client
npm install
npm run dev
```
开发服务器启动后访问：`http://localhost:5173`

#### 4. Vue 基础学习
直接在浏览器中打开 `big-event-vue/` 目录下的 HTML 文件即可学习 Vue.js 基础用法。

## 📚 学习路径

### 阶段一：Vue.js 基础
1. **01快速入门.html** - Vue 3 基本语法
2. **02指令v-for.html** - 循环渲染
3. **03指令v-bind.html** - 属性绑定
4. **04指令v-if&v-show.html** - 条件渲染
5. **05指令v-on.html** - 事件处理
6. **06指令v-model.html** - 双向数据绑定
7. **07axios使用.html** - HTTP 请求
8. **08vue案例.html** - 综合案例

### 阶段二：后端开发
1. **Axios Demo** - 学习前后端数据交互
2. **大事件系统** - 完整的后端 API 开发

### 阶段三：全栈整合
1. **前端项目** - Vue 3 + Vite 现代化开发
2. **前后端联调** - 完整的全栈应用

## 🔧 核心功能

### 大事件管理系统
- 用户注册与登录（JWT 认证）
- 用户信息管理
- 文章分类管理
- 文章发布与管理
- 文件上传（阿里云 OSS）
- 分页查询
- Redis 缓存

### API 接口
详细的接口文档请参考：[大事件接口文档.md](docs/大事件接口文档.md)

主要接口包括：
- 用户相关：注册、登录、信息管理
- 分类管理：增删改查
- 文章管理：发布、编辑、删除、查询
- 文件上传：支持图片上传

## 🔐 安全配置

项目已配置以下安全特性：
- JWT 令牌认证
- 登录拦截器
- 参数校验
- 全局异常处理
- 密码 MD5 加密

## 📖 开发规范

- 后端遵循 RESTful API 设计规范
- 前端采用组件化开发模式
- 统一的响应格式和错误处理
- 完整的参数校验和异常处理

## 🤝 贡献指南

欢迎提交 Issue 和 Pull Request 来改进项目！

## 📄 许可证

本项目仅用于学习目的，请勿用于商业用途。