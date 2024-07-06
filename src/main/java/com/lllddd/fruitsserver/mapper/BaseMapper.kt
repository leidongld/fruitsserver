/*
 * *
 *  * Copyright (C) 2024 Lei Dong
 *  *
 *  * All rights reserved. This software is the intellectual property of Lei Dong,
 *  * and is protected by applicable copyright and other laws.
 *
 */
package com.lllddd.fruitsserver.mapper

import org.apache.ibatis.annotations.Mapper

/**
 * author: lllddd
 * created on: 2024/5/21 16:19
 * description:基础Mapper
 */
interface BaseMapper<T> {
    /**
     * 增加
     *
     * @param t 对象
     */
    fun add(t: T)

    /**
     * 删除
     *
     * @param id id
     */
    fun delete(id: Int)

    /**
     * 更改
     *
     * @param t 对象
     */
    fun modify(t: T)

    /**
     * 通过id查对象
     *
     * @param id id
     * @return 对象
     */
    fun queryById(id: Int): T

    /**
     * 查找所有对象
     *
     * @return 对象列表
     */
    fun queryAll(): List<T>?
}