package com.ruoyi.sfc.service.impl;

import com.ruoyi.sfc.service.ISFCService;
import org.springframework.stereotype.Service;

import java.util.concurrent.locks.ReentrantLock;

@Service
public class SFCServiceImpl implements ISFCService {

    public void testReentranceLock(){
        ReentrantLock reentrantLock = new ReentrantLock();
    }
}
