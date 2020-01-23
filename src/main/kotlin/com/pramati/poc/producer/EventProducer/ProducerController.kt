package com.pramati.poc.producer.EventProducer

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.time.Instant

@RestController
class ProducerController {

    @Autowired
    lateinit var clientService: ClientService



    @RequestMapping("/")
    fun index() = "This is the producer !"



    @PostMapping("/newClaim")
    fun createClaim(@RequestBody newComment: NewClaim): Claim {
        val claim = Claim(
                createdBy = newComment.createdBy,
                claimId = newComment.claimId,
                createdDate = Instant.now()
        )

        clientService.saveClaim(claim)

        return claim
    }


}