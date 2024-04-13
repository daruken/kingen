package org.dpluskia.rabbit.member.adapter.out.persistence

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import org.dpluskia.rabbit.member.adapter.`in`.dto.MemberDto
import org.dpluskia.rabbit.member.application.port.out.LoadMemberPort
import org.dpluskia.rabbit.member.application.port.out.SaveMemberPort
import org.dpluskia.rabbit.member.domain.Member
import org.springframework.stereotype.Repository

@Repository
class MemberPersistenceAdapter(
    private val memberMapper: MemberMapper,
    private val memberRepository: MemberRepository
) : LoadMemberPort, SaveMemberPort {
    override suspend fun showMembers(): Flow<Member> {
        val memberEntities = memberRepository.findAll()
        return memberEntities.map { memberMapper.toDomain(it) }
    }

    override suspend fun saveMember(memberDto: MemberDto) {
        val member = Member(
            name = memberDto.name,
            email = memberDto.email,
            phone = memberDto.phone
        )
        memberRepository.save(memberMapper.toEntity(member))
    }
}
