# Java 面向对象程序设计（课程作业）

> Java 课程作业合集：基础语法、类与对象、集合、AWT 图形界面。

![Java](https://img.shields.io/badge/Java-8%2B-ED8B00?style=flat&logo=openjdk&logoColor=white)
![status](https://img.shields.io/badge/status-coursework-lightgrey)

## 章节

| 目录 | 内容 |
| --- | --- |
| `chapter02/` | 基础语法与数组 |
| `chapter03/` | 类与对象：Complex、Circle、Rectangle、Point、Book |
| `chapter04/` | 字符串与集合基础 |
| `chapter05/` | LinkedList 与集合应用：KTV 点歌系统 |
| `chapter06/` | AWT 图形界面：RGB 调色板等 |
| `study/` | 面向对象综合练习：People、Teacher、Movie |
| `实验题集答案/` | 教材实验参考答案 |

## 项目结构

```text
Java_Basic/
├── chapter02/        # 基础语法与数组
├── chapter03/        # 类与对象
├── chapter04/        # 字符串与集合
├── chapter05/        # LinkedList / 集合应用
├── chapter06/        # AWT 图形界面
├── study/            # 面向对象综合练习
└── 实验题集答案/      # 教材实验参考答案
```

## 环境要求

- JDK 8+
- IntelliJ IDEA（可选，仓库带 `.iml` 模块配置）

## 运行

用 IntelliJ IDEA 打开对应章的 `.iml` 模块，直接运行 `main` 方法。

命令行方式：

```bash
javac -d out chapter02/src/com/yskye/work1/test1.java
java -cp out com.yskye.work1.test1
```

`out/` 是编译输出目录，可忽略或自行清理。

## 技术栈 / 学习点

- Java 基础语法、数组、字符串
- 类与对象、封装、继承、多态
- 集合框架、LinkedList
- AWT 图形界面与事件监听

## 说明

- 本仓库为课程作业，不是生产项目。
- 各章代码按教材章节归档，`实验题集答案/` 为练习参考答案。
