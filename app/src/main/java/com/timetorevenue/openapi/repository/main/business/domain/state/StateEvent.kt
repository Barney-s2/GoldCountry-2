package com.timetorevenue.openapi.repository.main.business.domain.state


interface StateEvent {

    fun errorInfo(): String

    fun eventName(): String

    fun shouldDisplayProgressBar(): Boolean
}