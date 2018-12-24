### My Blog：[zhangmiao.cc](https://zhangmiao.cc/2018/12/24/Android%E5%9F%BA%E7%A1%80%E6%8E%A7%E4%BB%B6ViewFlipper%E7%9A%84%E4%BD%BF%E7%94%A8%EF%BC%8C%E5%9E%82%E7%9B%B4%E6%BB%9A%E5%8A%A8%E5%B9%BF%E5%91%8A%E6%9D%A1/)
# ViewFlipperDemo
ViewFlipper的使用，仿淘宝头条垂直滚动广告条。

> 学习，学习，学以致用
ViewFlipper是安卓自带的控件，很多人可能很少知道这个控件，这个控件很简单，也很好理解。

![](https://ws2.sinaimg.cn/large/006tNbRwgy1fyhz70e763g30b70500tv.gif)

从源码可以看出，其实ViewFlipper间接的继承了FrameLayout，也可以说ViewFlipper其实就是个FrameLayout，只不过在内部封装了动画实现和Handler实现一个循环而已。
