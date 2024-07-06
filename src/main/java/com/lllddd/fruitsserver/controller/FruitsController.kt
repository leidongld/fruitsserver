/*
 * *
 *  * Copyright (C) 2024 Lei Dong
 *  *
 *  * All rights reserved. This software is the intellectual property of Lei Dong,
 *  * and is protected by applicable copyright and other laws.
 *
 */
package com.lllddd.fruitsserver.controller

import com.lllddd.fruitsserver.entity.FruitEntity
import com.lllddd.fruitsserver.mapper.FruitsMapper
import com.lllddd.fruitsserver.resp.Resp
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * author: lllddd
 * created on: 2024/5/21 16:14
 * description:水果Controller
 */
@RestController
class FruitsController {
    @Autowired
    private val fruitsMapper: FruitsMapper? = null

    @GetMapping("/queryAll")
    fun queryAll(): Resp {
        return try {
            val content = fruitsMapper!!.queryAll()
            Resp(Resp.SUCCESS_CODE, Resp.SUCCESS_MSG, content)
        } catch (e: Exception) {
            e.printStackTrace()
            Resp(Resp.FAIL_CODE, Resp.FAIL_MSG, e.message)
        }
    }

    @PostMapping("/queryById")
    fun queryById(@RequestParam(name = "id") id: Int): Resp {
        return try {
            val content = fruitsMapper!!.queryById(id)
            Resp(Resp.SUCCESS_CODE, Resp.SUCCESS_MSG, content)
        } catch (e: Exception) {
            e.printStackTrace()
            Resp(Resp.FAIL_CODE, Resp.FAIL_MSG, e.message)
        }
    }

    @PostMapping("/add")
    fun add(@RequestBody fruit: FruitEntity): Resp {
        return try {
            fruitsMapper!!.add(fruit)
            Resp(Resp.SUCCESS_CODE, Resp.SUCCESS_MSG)
        } catch (e: Exception) {
            e.printStackTrace()
            Resp(Resp.FAIL_CODE, Resp.FAIL_MSG, e.message)
        }
    }

    @PostMapping("/delete")
    fun delete(@RequestParam(name = "id") id: Int): Resp {
        return try {
            fruitsMapper!!.delete(id)
            Resp(Resp.SUCCESS_CODE, Resp.SUCCESS_MSG)
        } catch (e: Exception) {
            e.printStackTrace()
            Resp(Resp.FAIL_CODE, Resp.FAIL_MSG, e.message)
        }
    }

    @PostMapping("/modify")
    fun modify(@RequestBody fruit: FruitEntity): Resp {
        return try {
            fruitsMapper!!.modify(fruit)
            Resp(Resp.SUCCESS_CODE, Resp.SUCCESS_MSG)
        } catch (e: Exception) {
            e.printStackTrace()
            Resp(Resp.FAIL_CODE, Resp.FAIL_MSG)
        }
    }

//    companion object {
//        @JvmStatic
//        fun main(args: Array<String>) {
//            println("haha")
//        }
//    }
}