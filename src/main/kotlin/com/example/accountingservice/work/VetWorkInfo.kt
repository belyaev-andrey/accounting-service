package com.example.accountingservice.work

import java.time.LocalDate

data class VetWorkInfo(val date: LocalDate, val vetId: Long, val workHours: Int)
