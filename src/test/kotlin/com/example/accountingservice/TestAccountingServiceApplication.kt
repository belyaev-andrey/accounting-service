package com.example.accountingservice

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
    fromApplication<AccountingServiceApplication>().with(TestcontainersConfiguration::class).run(*args)
}
