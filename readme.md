# 计201 2020310567
## 一、目的
掌握对象传值的影响，并修改程序，实例化多个Lake对象，同一Fish对象均setFish 其中，通过调用输出方法，查看weight的变化情况。
## 二、对象传值
#### 整体思路
利用传递是指向真实内容的地址值，在调用方法时，实参传递给形参，在方法体中实参和形参指向同一地址，对形参操作会影响实参。
##三、 代码结合
1. 首先实例化了一个Fish对象niqiu，并输出此时其重量。
```
        Fish niqiu = new Fish();
        System.out.println("泥鳅：" +niqiu.weight);
```
2. 然后，将niqiu通过Lake中setfish方法放入其中，并用eat方法增重，显示此时taihu中taihu中niqiu重量以及niqiu本身就是重量。
```
		Lake taihu  = new Lake();
		taihu.setFish(niqiu);
		taihu.eat(10);
		System.out.println("泥鳅：" +niqiu.weight);
		System.out.println("太湖里的泥鳅：" +taihu.fish.weight);
```
3. 再实例化另一个Lake对象lake，将niqiu放入其中，同样用eat方法增重，显示此时taihu中，lake中niqiu，以及niqiu本身的重量。
```
        Lake lake1 = new Lake();
		lake.setFish(niqiu);
		lake.eat(250);
		System.out.println("泥鳅：" + niqiu.weight);
		System.out.println("大明湖畔里的泥鳅：" +lake.fish.weight);
		System.out.println("太湖里的泥鳅：" +taihu.fish.weight);
```
4. 对比发现，当对象在方法中做形参时，实际指向了实参的地址，因此，在方法调用时，改变形参的同时也改变了实参。不仅如此，还同时改变了同样指向这一地址的其他类里面的该对象。
## 四、运行截图
![](https://github.com/123456-lyp/java-homework02/blob/main/1.png)
