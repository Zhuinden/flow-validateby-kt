/*
 * Copyright 2020 Gabor Varadi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zhuinden.flowvalidatebykt

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.combine

@ExperimentalCoroutinesApi
fun validateBy(f1: Flow<Boolean>, f2: Flow<Boolean>): Flow<Boolean> = combine(f1, f2) { t1, t2 -> t1 && t2 }

@ExperimentalCoroutinesApi
fun validateBy(f1: Flow<Boolean>, f2: Flow<Boolean>, f3: Flow<Boolean>): Flow<Boolean> = combine(f1, f2, f3) { t1, t2, t3 -> t1 && t2 && t3 }

@ExperimentalCoroutinesApi
fun validateBy(f1: Flow<Boolean>, f2: Flow<Boolean>, f3: Flow<Boolean>, f4: Flow<Boolean>): Flow<Boolean> = combine(f1, f2, f3, f4) { t1, t2, t3, t4 -> t1 && t2 && t3 && t4 }

@ExperimentalCoroutinesApi
fun validateBy(f1: Flow<Boolean>, f2: Flow<Boolean>, f3: Flow<Boolean>, f4: Flow<Boolean>, f5: Flow<Boolean>): Flow<Boolean> = combine(f1, f2, f3, f4, f5) { t1, t2, t3, t4, t5 -> t1 && t2 && t3 && t4 && t5 }

@ExperimentalCoroutinesApi
fun validateBy(f1: Flow<Boolean>, f2: Flow<Boolean>, f3: Flow<Boolean>, f4: Flow<Boolean>, f5: Flow<Boolean>, f6: Flow<Boolean>): Flow<Boolean> = combine(f1, f2, f3, f4, f5, f6) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    (array[0] as Boolean) && (array[1] as Boolean) && (array[2] as Boolean) && (array[3] as Boolean) && (array[4] as Boolean) && (array[5] as Boolean)
}

@ExperimentalCoroutinesApi
fun validateBy(f1: Flow<Boolean>, f2: Flow<Boolean>, f3: Flow<Boolean>, f4: Flow<Boolean>, f5: Flow<Boolean>, f6: Flow<Boolean>, f7: Flow<Boolean>): Flow<Boolean> = combine(f1, f2, f3, f4, f5, f6, f7) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    (array[0] as Boolean) && (array[1] as Boolean) && (array[2] as Boolean) && (array[3] as Boolean) && (array[4] as Boolean) && (array[5] as Boolean) && (array[6] as Boolean)
}

@ExperimentalCoroutinesApi
fun validateBy(f1: Flow<Boolean>, f2: Flow<Boolean>, f3: Flow<Boolean>, f4: Flow<Boolean>, f5: Flow<Boolean>, f6: Flow<Boolean>, f7: Flow<Boolean>, f8: Flow<Boolean>): Flow<Boolean> = combine(f1, f2, f3, f4, f5, f6, f7, f8) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    (array[0] as Boolean) && (array[1] as Boolean) && (array[2] as Boolean) && (array[3] as Boolean) && (array[4] as Boolean) && (array[5] as Boolean) && (array[6] as Boolean) && (array[7] as Boolean)
}

@ExperimentalCoroutinesApi
fun validateBy(f1: Flow<Boolean>, f2: Flow<Boolean>, f3: Flow<Boolean>, f4: Flow<Boolean>, f5: Flow<Boolean>, f6: Flow<Boolean>, f7: Flow<Boolean>, f8: Flow<Boolean>, f9: Flow<Boolean>): Flow<Boolean> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    (array[0] as Boolean) && (array[1] as Boolean) && (array[2] as Boolean) && (array[3] as Boolean) && (array[4] as Boolean) && (array[5] as Boolean) && (array[6] as Boolean) && (array[7] as Boolean) && (array[8] as Boolean)
}

@ExperimentalCoroutinesApi
fun validateBy(f1: Flow<Boolean>, f2: Flow<Boolean>, f3: Flow<Boolean>, f4: Flow<Boolean>, f5: Flow<Boolean>, f6: Flow<Boolean>, f7: Flow<Boolean>, f8: Flow<Boolean>, f9: Flow<Boolean>, f10: Flow<Boolean>): Flow<Boolean> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    (array[0] as Boolean) && (array[1] as Boolean) && (array[2] as Boolean) && (array[3] as Boolean) && (array[4] as Boolean) && (array[5] as Boolean) && (array[6] as Boolean) && (array[7] as Boolean) && (array[8] as Boolean) && (array[9] as Boolean)
}

@ExperimentalCoroutinesApi
fun validateBy(f1: Flow<Boolean>, f2: Flow<Boolean>, f3: Flow<Boolean>, f4: Flow<Boolean>, f5: Flow<Boolean>, f6: Flow<Boolean>, f7: Flow<Boolean>, f8: Flow<Boolean>, f9: Flow<Boolean>, f10: Flow<Boolean>, f11: Flow<Boolean>): Flow<Boolean> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    (array[0] as Boolean) && (array[1] as Boolean) && (array[2] as Boolean) && (array[3] as Boolean) && (array[4] as Boolean) && (array[5] as Boolean) && (array[6] as Boolean) && (array[7] as Boolean) && (array[8] as Boolean) && (array[9] as Boolean) && (array[10] as Boolean)
}

@ExperimentalCoroutinesApi
fun validateBy(f1: Flow<Boolean>, f2: Flow<Boolean>, f3: Flow<Boolean>, f4: Flow<Boolean>, f5: Flow<Boolean>, f6: Flow<Boolean>, f7: Flow<Boolean>, f8: Flow<Boolean>, f9: Flow<Boolean>, f10: Flow<Boolean>, f11: Flow<Boolean>, f12: Flow<Boolean>): Flow<Boolean> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    (array[0] as Boolean) && (array[1] as Boolean) && (array[2] as Boolean) && (array[3] as Boolean) && (array[4] as Boolean) && (array[5] as Boolean) && (array[6] as Boolean) && (array[7] as Boolean) && (array[8] as Boolean) && (array[9] as Boolean) && (array[10] as Boolean) && (array[11] as Boolean)
}

@ExperimentalCoroutinesApi
fun validateBy(f1: Flow<Boolean>, f2: Flow<Boolean>, f3: Flow<Boolean>, f4: Flow<Boolean>, f5: Flow<Boolean>, f6: Flow<Boolean>, f7: Flow<Boolean>, f8: Flow<Boolean>, f9: Flow<Boolean>, f10: Flow<Boolean>, f11: Flow<Boolean>, f12: Flow<Boolean>, f13: Flow<Boolean>): Flow<Boolean> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    (array[0] as Boolean) && (array[1] as Boolean) && (array[2] as Boolean) && (array[3] as Boolean) && (array[4] as Boolean) && (array[5] as Boolean) && (array[6] as Boolean) && (array[7] as Boolean) && (array[8] as Boolean) && (array[9] as Boolean) && (array[10] as Boolean) && (array[11] as Boolean) && (array[12] as Boolean)
}

@ExperimentalCoroutinesApi
fun validateBy(f1: Flow<Boolean>, f2: Flow<Boolean>, f3: Flow<Boolean>, f4: Flow<Boolean>, f5: Flow<Boolean>, f6: Flow<Boolean>, f7: Flow<Boolean>, f8: Flow<Boolean>, f9: Flow<Boolean>, f10: Flow<Boolean>, f11: Flow<Boolean>, f12: Flow<Boolean>, f13: Flow<Boolean>, f14: Flow<Boolean>): Flow<Boolean> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    (array[0] as Boolean) && (array[1] as Boolean) && (array[2] as Boolean) && (array[3] as Boolean) && (array[4] as Boolean) && (array[5] as Boolean) && (array[6] as Boolean) && (array[7] as Boolean) && (array[8] as Boolean) && (array[9] as Boolean) && (array[10] as Boolean) && (array[11] as Boolean) && (array[12] as Boolean) && (array[13] as Boolean)
}

@ExperimentalCoroutinesApi
fun validateBy(f1: Flow<Boolean>, f2: Flow<Boolean>, f3: Flow<Boolean>, f4: Flow<Boolean>, f5: Flow<Boolean>, f6: Flow<Boolean>, f7: Flow<Boolean>, f8: Flow<Boolean>, f9: Flow<Boolean>, f10: Flow<Boolean>, f11: Flow<Boolean>, f12: Flow<Boolean>, f13: Flow<Boolean>, f14: Flow<Boolean>, f15: Flow<Boolean>): Flow<Boolean> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    (array[0] as Boolean) && (array[1] as Boolean) && (array[2] as Boolean) && (array[3] as Boolean) && (array[4] as Boolean) && (array[5] as Boolean) && (array[6] as Boolean) && (array[7] as Boolean) && (array[8] as Boolean) && (array[9] as Boolean) && (array[10] as Boolean) && (array[11] as Boolean) && (array[12] as Boolean) && (array[13] as Boolean) && (array[14] as Boolean)
}

@ExperimentalCoroutinesApi
fun validateBy(f1: Flow<Boolean>, f2: Flow<Boolean>, f3: Flow<Boolean>, f4: Flow<Boolean>, f5: Flow<Boolean>, f6: Flow<Boolean>, f7: Flow<Boolean>, f8: Flow<Boolean>, f9: Flow<Boolean>, f10: Flow<Boolean>, f11: Flow<Boolean>, f12: Flow<Boolean>, f13: Flow<Boolean>, f14: Flow<Boolean>, f15: Flow<Boolean>, f16: Flow<Boolean>): Flow<Boolean> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    (array[0] as Boolean) && (array[1] as Boolean) && (array[2] as Boolean) && (array[3] as Boolean) && (array[4] as Boolean) && (array[5] as Boolean) && (array[6] as Boolean) && (array[7] as Boolean) && (array[8] as Boolean) && (array[9] as Boolean) && (array[10] as Boolean) && (array[11] as Boolean) && (array[12] as Boolean) && (array[13] as Boolean) && (array[14] as Boolean) && (array[15] as Boolean)
}