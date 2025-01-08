package org.examaple.bug

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

public object Dummy {
    @Serializable
    data class Data(val x: Int)

    fun getSomeData(): String = Json.encodeToString(Data(42))
}
