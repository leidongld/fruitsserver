/*
 * *
 *  * Copyright (C) 2024 Lei Dong
 *  *
 *  * All rights reserved. This software is the intellectual property of Lei Dong,
 *  * and is protected by applicable copyright and other laws.
 *
 */
package com.lllddd.fruitsserver.resp

import java.io.Serializable

/**
 * author: lllddd
 * created on: 2024/5/22 9:54
 * description:返回封装
 */
data class Resp @JvmOverloads constructor(var respCode: Int, var respMsg: String, val data: Any? = null) : Serializable {
    companion object {
        // 成功码
        const val SUCCESS_CODE = 1000

        // 失败码
        const val FAIL_CODE = 1001

        // 成功消息
        const val SUCCESS_MSG = "Success"

        // 失败消息
        const val FAIL_MSG = "Fail"
    }
}