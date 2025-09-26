package com.example.accountingservice.payment

import org.springframework.data.repository.ListCrudRepository
import java.time.LocalDate

interface VetPaymentRepository : ListCrudRepository<VetPayment, Long> {
    fun findByVetIdAndDate(vetId: Long, date: LocalDate): VetPayment?
    fun findVetPaymentByDate(date: LocalDate): MutableList<VetPayment>
}