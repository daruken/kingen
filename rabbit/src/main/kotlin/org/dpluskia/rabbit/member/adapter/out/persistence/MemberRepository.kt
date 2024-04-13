package org.dpluskia.rabbit.member.adapter.out.persistence

import org.dpluskia.rabbit.member.domain.MemberEntity
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MemberRepository : CoroutineCrudRepository<MemberEntity, Long >  {
    suspend fun save(memberEntity: MemberEntity): MemberEntity
}
