package com.example.accountingservice.vet

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.math.BigDecimal

@Table
data class VetSalary(@Id val id: Long, val vetId: Long, val salary: BigDecimal)
