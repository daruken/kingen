package org.dpluskia.rabbit.member.application.port.out

import org.dpluskia.rabbit.member.adapter.`in`.dto.MemberDto

interface SaveMemberPort {
    suspend fun saveMember(memberDto: MemberDto)
}
