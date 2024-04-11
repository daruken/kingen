package org.dpluskia.rabbit.member.application.port.`in`

import org.dpluskia.rabbit.member.domain.Member

interface MemberUseCase {
    fun getMembers(): List<Member>
}