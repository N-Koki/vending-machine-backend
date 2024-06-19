package com.vendingmachine.framework.annotation

// kotlin の data class で MyBatis を利用するために
// 引数なしのコンストラクタを生成するためのアノテーションを定義
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
annotation class NoArgsConstructor
