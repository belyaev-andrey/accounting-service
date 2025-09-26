package com.example.accountingservice.vet

import org.springframework.data.repository.ListCrudRepository

interface VetSalaryRepository : ListCrudRepository<VetSalary, Long> {
    fun findByVetId(vetId: Long): VetSalary?
}
