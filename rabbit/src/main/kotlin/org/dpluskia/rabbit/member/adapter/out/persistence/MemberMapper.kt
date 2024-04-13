package org.dpluskia.rabbit.member.adapter.out.persistence

import org.dpluskia.rabbit.member.domain.Member
import org.dpluskia.rabbit.member.domain.MemberEntity
import org.springframework.stereotype.Component

@Component
class MemberMapper {
    fun toEntity(member: Member): MemberEntity {
        return MemberEntity(
            name = member.name,
            email = member.email,
            phone = member.phone
        )
    }

    fun toDomain(memberEntity: MemberEntity): Member {
        return Member(
            name = memberEntity.name,
            email = memberEntity.email,
            phone = memberEntity.phone
        )
    }
}
