package com.example.accountingservice.payment

import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper(componentModel = "spring")
interface VetPaymentMapper {
    @Mapping(source = "amount", target = "payment")
    fun toDto(payment: VetPayment): PaymentDto

    @Mapping(source = "amount", target = "payment")
    fun toDto(payments: List<VetPayment>): List<PaymentDto>

}