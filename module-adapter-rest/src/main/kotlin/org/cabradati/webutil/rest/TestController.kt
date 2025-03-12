package org.cabradati.webutil.rest

import org.cabradati.webutil.domain.TestEvent
import org.springframework.context.ApplicationEventPublisher
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(
    private val applicationEventPublisher: ApplicationEventPublisher,
) {

    @GetMapping
    fun test() {
        try {
            applicationEventPublisher.publishEvent(TestEvent("teste"))
        } catch (e: Exception) {
            e.printStackTrace()
        } finally {
            println("completo")
        }
    }

}