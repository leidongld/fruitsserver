/*
 * *
 *  * Copyright (C) 2024 Lei Dong
 *  *
 *  * All rights reserved. This software is the intellectual property of Lei Dong,
 *  * and is protected by applicable copyright and other laws.
 *
 */
package com.lllddd.fruitsserver.mapper

import com.lllddd.fruitsserver.entity.FruitEntity
import org.apache.ibatis.annotations.Mapper
import org.springframework.stereotype.Repository

/**
 * author: lllddd
 * created on: 2024/5/21 16:18
 * description:水果Mapper
 */
@Repository
@Mapper
interface FruitsMapper : BaseMapper<FruitEntity> {
    override fun add(t: FruitEntity)

    override fun delete(id: Int)

    override fun modify(t: FruitEntity)

    override fun queryById(id: Int): FruitEntity

    override fun queryAll(): List<FruitEntity>
}