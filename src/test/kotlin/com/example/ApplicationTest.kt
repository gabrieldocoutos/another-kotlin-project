package com.example

import io.kotest.core.spec.style.FunSpec
import io.kotest.core.spec.style.Test
import io.kotest.matchers.shouldBe
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import io.ktor.http.HttpStatusCode
import io.ktor.server.testing.testApplication
import kotlin.test.assertEquals

class ApplicationTest : FunSpec({

    test("my first test") {

        testApplication {
            val response = client.get("/")

            assertEquals(HttpStatusCode.OK, response.status)
            assertEquals("Hello World!", response.bodyAsText())
        }
    }
})
