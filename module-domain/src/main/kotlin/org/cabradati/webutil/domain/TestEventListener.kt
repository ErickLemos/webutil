package org.cabradati.webutil.domain

import org.springframework.context.event.EventListener
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Component

@Component
class TestEventListener {

    @Async
    @EventListener
    fun onTestEvent(event: TestEvent) {
        println("hello world")
    }

    @Async
    @EventListener
    fun onTestEventA(event: TestEvent) {
        println("hello world A")
    }

    @Async
    @EventListener
    fun onTestEventB(event: TestEvent) {
        println("hello world B")
    }

}