package com.timetorevenue.openapi.util
//package com.codingwithmitch.cleannotes.business.domain.util

interface EnityMapper <Entity, DomainModel>{

    fun mapFromEntity (entity: Entity): DomainModel

    fun mapToEntity(domainModel: DomainModel): Entity
}