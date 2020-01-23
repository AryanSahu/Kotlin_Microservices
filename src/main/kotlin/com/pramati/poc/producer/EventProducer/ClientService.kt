package com.pramati.poc.producer.EventProducer

import org.springframework.stereotype.Service

@Service
class ClientService {

    // Our Spring Data repository

    fun saveClaim(claim: Claim) {

        System.out.println("Claim Saved")
    }
}