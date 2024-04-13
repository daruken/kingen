package org.dpluskia.rabbit.member.application.port.`in`

import kotlinx.coroutines.flow.Flow
import org.dpluskia.rabbit.member.adapter.`in`.dto.MemberDto
import org.dpluskia.rabbit.member.domain.Member

interface MemberUseCase {
    suspend fun getMembers(): Flow<Member>
    suspend fun saveMember(memberDto: MemberDto)
}
