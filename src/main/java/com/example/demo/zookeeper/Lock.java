package com.example.demo.zookeeper;

import lombok.Data;

@Data
public class Lock {
    private String lockId;
    private String path;
    private boolean active;

    public Lock(String lockId, String path, boolean active) {
        this.lockId = lockId;
        this.path = path;
        this.active = active;
    }
}
