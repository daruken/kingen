package org.dpluskia.rabbit.member.adapter.`in`

import org.dpluskia.rabbit.member.application.service.MemberService
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/members")
class MemberController(
    private val memberService: MemberService
) {
    @GetMapping
    suspend fun getMembers() = ok(memberService.getMembers())
}
