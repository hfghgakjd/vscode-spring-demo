package com.snowfog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 控制器基类
 *
 * @author 邵静
 */
public abstract class AbstractController {

    /*
     * 日志
     */
    protected static Logger LOGGER = null;

    /**
     * 构造函数
     *
     * @author 邵静
     */
    public AbstractController() {
        LOGGER = LoggerFactory.getLogger(this.getClass().getName());
    }
}
