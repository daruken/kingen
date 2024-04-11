package org.dpluskia.rabbit.member.domain

import jakarta.annotation.Generated
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("member")
data class Member(
    val name: String,
    val email: String,
    val phone: String,
) {
    @Id
    @Generated
    var id: Long = 0
}
