package com.davidbaena.springtraining.topic

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TopicController {

    @RequestMapping("/topics")
    fun getAllTopics(): List<Topic> =
        listOf(
            Topic(id = "spring", name = "Spring Framework", description = "Spring Framework Description"),
            Topic(id = "java", name = "Core Java", description = "Core Java Description"),
            Topic(id = "javascript", name = "Javascript", description = "Javascript Description")

            )
}

data class Topic(val id: String, val name: String, val description: String)