package org.dpluskia.rabbit.member.adapter.out

import org.dpluskia.rabbit.member.domain.Member
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MemberRepository : CoroutineCrudRepository<Member, Long >  {
}