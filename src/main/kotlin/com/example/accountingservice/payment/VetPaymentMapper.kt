package com.example.accountingservice.payment

import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper(componentModel = "spring")
interface VetPaymentMapper {
    fun toDto(payment: VetPayment): PaymentDto
}