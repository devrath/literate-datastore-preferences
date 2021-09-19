package com.example.android.code.data

import com.example.android.code.data.model.Course
import com.example.android.code.data.model.CourseLevel
import kotlinx.coroutines.flow.flowOf

fun getCourseList() = flowOf(
  listOf(
    Course(
      name = "Apache Kafka Series",
      description = "Kafka - Master Avro, the Confluent Schema Registry and Kafka REST Proxy. Build Avro Producers/Consumers, Evolve Schemas",
      level = CourseLevel.BEGINNER,
      completed = true
    ),
    Course(
      name = "WireMock for Java Developers",
      description = "Learn to build robust RESTFUL API Clients, Service Virtualization in Java and SpringBoot applications using WireMock.",
      level = CourseLevel.BEGINNER,
      completed = false
    ),
    Course(
      name = "Develop Minecraft Plugins",
      description = "High-quality tutorials providing you with the most sustainable practices available to make Minecraft plugins.",
      level = CourseLevel.ADVANCED,
      completed = false
    ),
    Course(
      name = "Introduction to Apache Solr 8",
      description = "Fundamental concepts and use-cases of Apache Solr",
      level = CourseLevel.BEGINNER,
      completed = false
    ),
    Course(
      name = "Unit Testing Swift Mobile App",
      description = "Apply Test-Driven Development(TDD) process to iOS mobile app development in Swift",
      level = CourseLevel.ADVANCED,
      completed = true
    ),
    Course(
      name = "Ionic - Build with Ionic & Angular",
      description = "Build Native iOS & Android as well as Progressive Web Apps with Angular, Capacitor and the Ionic Framework (Ionic 4+).",
      level = CourseLevel.BEGINNER,
      completed = false
    )
  )
)