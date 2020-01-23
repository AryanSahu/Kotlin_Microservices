package com.pramati.poc.producer.EventProducer

import com.fasterxml.jackson.annotation.JsonCreator
import java.time.Instant

data class  Claim(
        val createdBy: String,
        val claimId: String,
        val createdDate: Instant
)

data class NewClaim @JsonCreator constructor(
        val createdBy: String,
        val claimId: String
)