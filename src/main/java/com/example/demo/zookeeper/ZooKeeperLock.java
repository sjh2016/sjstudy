package com.example.demo.zookeeper;


import org.I0Itec.zkclient.ZkClient;

/**
 * 创建临时的循序节点。
 */
public class ZooKeeperLock {

    private ZkClient zkClient;


    public ZooKeeperLock(){
        zkClient = new ZkClient("xxx",5000,20000);
    }
    /**
     * 获得锁
     * @param lockId
     * @param timeout
     * @return
     */
    public Lock lock(String lockId,long timeout){
        return null;
    }

    /**
     * 激活锁
     * @param lock
     * @return
     */
    public Lock tryActiveLock(Lock lock){
        return null;
    }

    /**
     * 释放锁
     * @param lock
     */
    public void unlock(Lock  lock){

    }

    public Lock createLockNode(String lockId){
        String path = zkClient.createEphemeralSequential("/songjie-lock/" + lockId, "w");
        return null;
    }
}
