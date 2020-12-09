package com.zhuinden.flowvalidatebykt


import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test


class BasicTest {
    @Test
    fun checkFlows() {
        val flow1 = flow<Boolean> {
            emit(true)
        }
        val flow2 = flow<Boolean> {
            emit(false)
            emit(true)
        }

        var emissionCount = 0

        GlobalScope.run {
            runBlocking {
                validateBy(flow1, flow2)
                    .collectLatest { isValid ->
                        if (emissionCount == 0) {
                            assertThat(isValid).isFalse()
                            emissionCount++
                        } else if (emissionCount == 1) {
                            assertThat(isValid).isTrue()
                        }
                    }
            }
        }
    }
}