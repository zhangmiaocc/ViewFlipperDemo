# ViewFlipperDemo
ViewFlipper的使用，仿淘宝头条垂直滚动广告条。

> 学习，学习，学以致用
ViewFlipper是安卓自带的控件，很多人可能很少知道这个控件，这个控件很简单，也很好理解。

![](https://ws2.sinaimg.cn/large/006tNbRwgy1fyhz70e763g30b70500tv.gif)

从源码可以看出，其实ViewFlipper间接的继承了FrameLayout，也可以说ViewFlipper其实就是个FrameLayout，只不过在内部封装了动画实现和Handler实现一个循环而已。
