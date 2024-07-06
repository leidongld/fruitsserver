/*
 * *
 *  * Copyright (C) 2024 Lei Dong
 *  *
 *  * All rights reserved. This software is the intellectual property of Lei Dong,
 *  * and is protected by applicable copyright and other laws.
 *
 */
package com.lllddd.fruitsserver.entity

import org.springframework.context.annotation.Bean

/**
 * author: lllddd
 * created on: 2024/5/21 16:16
 * description:水果实体
 */
data class FruitEntity(val id: Int = 0, val name: String? = null, val avatar: String? = null, val detail: String?, val valid: String? = null, val price: Float = 0F) {
//    private val id = 0
//    private val name: String? = null
//    private val avatar: String? = null
//    private val detail: String? = null
//    private val valid: String? = null
//    private val price = 0f
}