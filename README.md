# java-learn
A beginner learn java.

## git学习
抓取远程代码的步骤：

1. 抓取代码（抓取到git system里）

2. 把fetch到的代码合并到git里，叫 git merge
```bash
git fetch
git merge origin/master(optional: 之后写branch）

```

本地到远程
1. git commit(git 提交到git system里),optional: -am+String。 "-"相当于java argument里的括号，
a 是all的意思。-am = -a -m。写后面String这个message
之前一定要写-m。


2. git push 把要修改的内容push到远程的github上去
```bash
git commit -am "comment"
git push
```
