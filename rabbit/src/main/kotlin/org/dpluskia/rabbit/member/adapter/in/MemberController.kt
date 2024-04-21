package org.dpluskia.rabbit.member.adapter.`in`

import org.dpluskia.rabbit.member.adapter.`in`.dto.MemberDto
import org.dpluskia.rabbit.member.application.port.`in`.MemberUseCase
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/rabbit/members")
class MemberController(
    private val memberUseCase: MemberUseCase
) {
    @GetMapping
    suspend fun getMembers() = ok(memberUseCase.getMembers())

    @PostMapping
    suspend fun saveMember(@RequestBody memberDto: MemberDto) = memberUseCase.saveMember(memberDto)
}
