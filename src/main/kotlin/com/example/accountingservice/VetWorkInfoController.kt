package com.example.accountingservice

import com.example.accountingservice.payment.PaymentDto
import com.example.accountingservice.payment.VetPaymentMapper
import com.example.accountingservice.work.VetWorkInfo
import com.example.accountingservice.work.VetWorkService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import java.time.LocalDate

@RestController
@RequestMapping("/api/vetWorkInfo")
class VetWorkInfoController(
    private val vetWorkService: VetWorkService,
    private val vetPaymentMapper: VetPaymentMapper
) {

    @PostMapping("")
    fun postWorkInfo(@RequestBody workInfo: VetWorkInfo): ResponseEntity<Void> {
        vetWorkService.addWorkInfo(workInfo)
        return ResponseEntity.accepted().build()
    }

    @GetMapping("")
    fun getVetPayment(
        @RequestParam("vetId") vetId: Long,
        @RequestParam("date") salaryDate: LocalDate
    ): ResponseEntity<PaymentDto> {
        val vetPayment = vetWorkService.getVetPayment(vetId, salaryDate)
        val dto = vetPaymentMapper.toDto(vetPayment)
        return ResponseEntity.ok(dto)
    }

    @GetMapping("date/{date}")
    fun getSalariesByMonth(@PathVariable(name = "date") date: LocalDate): ResponseEntity<List<PaymentDto>> {
        val vetPayments = vetWorkService.getVetPayments(date)
        return ResponseEntity.ok(vetPaymentMapper.toDto(vetPayments))
    }
}
