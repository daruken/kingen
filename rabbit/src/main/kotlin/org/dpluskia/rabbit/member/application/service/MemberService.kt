package org.dpluskia.rabbit.member.application.service

import org.dpluskia.rabbit.member.adapter.out.MemberRepository
import org.springframework.stereotype.Service

@Service
class MemberService(
    private val memberRepository: MemberRepository
) {
    suspend fun getMembers() = memberRepository.findAll()
}
