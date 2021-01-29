package com.github.grieey.core_ext

import kotlin.math.pow

/**
 * description:int 相关的扩展
 * @date: 2021/1/28 17:34
 * @author: Grieey
 */
/**
 * float值
 */
val Int.float: Float
    get() = this.toFloat()

/**
 * double值
 */
val Int.double: Double
    get() = this.toDouble()

/**
 * dp转换为px，结果为px
 */
val Int.dp: Float
    get() = this.float.dp

/**
 * sp转换为px，结果为px
 */
val Int.sp: Float
    get() = this.float.sp


fun Int.pow(n: Int) = this.double.pow(n).float