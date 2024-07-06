/*
 * *
 *  * Copyright (C) 2024 Lei Dong
 *  *
 *  * All rights reserved. This software is the intellectual property of Lei Dong,
 *  * and is protected by applicable copyright and other laws.
 *
 */
package com.lllddd.fruitsserver

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * author: lllddd
 * created on: 2024/5/22 9:54
 * description:应用Application
 */
@SpringBootApplication
open class FruitsServerApplication {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(FruitsServerApplication::class.java, *args)
        }
    }
}