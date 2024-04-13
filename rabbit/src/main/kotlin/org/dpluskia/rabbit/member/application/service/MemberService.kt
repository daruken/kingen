package org.dpluskia.rabbit.member.application.service

import kotlinx.coroutines.flow.Flow
import org.dpluskia.rabbit.member.adapter.`in`.dto.MemberDto
import org.dpluskia.rabbit.member.application.port.`in`.MemberUseCase
import org.dpluskia.rabbit.member.application.port.out.LoadMemberPort
import org.dpluskia.rabbit.member.application.port.out.SaveMemberPort
import org.dpluskia.rabbit.member.domain.Member
import org.springframework.stereotype.Service

@Service
class MemberService(
    private val loadMemberPort: LoadMemberPort,
    private val saveMemberPort: SaveMemberPort
) : MemberUseCase {
    override suspend fun getMembers(): Flow<Member> {
        return loadMemberPort.showMembers()
    }

    override suspend fun saveMember(memberDto: MemberDto) {
        saveMemberPort.saveMember(memberDto)
    }
}
