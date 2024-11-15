1. disk data page cache: 4K L1,L2,L3 cache line: 64bytes
2. Redis分布式锁用lua脚本实现开锁并设置过期时间保证原子性
3. sql语句的执行顺序 from-on-join-where-group by-having-select-distinct-order by-limit
4. 查看SQL语句执行过程 explain关键字
5. 解决哈希冲突的四种方法：开放地址方法(再散列法)，再哈希法，建立公共溢出区，链式地址法
6. GC垃圾回收器：分代收集器的代表是 CMS，分区收集器的代表是 G1 和 ZGC
7. synchronized 是JVM层面的锁，是Java关键字，通过monitor对象来完成（monitorenter与monitorexit），对象只有在同步块或同步方法中才能调用wait/notify方法，ReentrantLock 是从jdk1.5以来（java.util.concurrent.locks.Lock）提供的API层面的锁。

synchronized 的实现涉及到锁的升级，具体为无锁、偏向锁、自旋锁、向OS申请重量级锁，ReentrantLock实现则是通过利用CAS（CompareAndSwap）自旋机制保证线程操作的原子性和volatile保证数据可见性以实现锁的功能
8. MySql隔离级别：Read Uncommitted Read Committed Repeatable Read Serializable
9. 滑动窗口大小的选择根据网络带宽、延迟和丢包率等因素进行调整，发送方的让自己的发送窗口=min(cwnd，接受端接收窗口大小）。说明: 发送方取拥塞窗口与滑动窗口的最小值作为发送的上限。TCP拥塞控制的几种方法：慢启动，拥塞避免，快重传和快恢复。