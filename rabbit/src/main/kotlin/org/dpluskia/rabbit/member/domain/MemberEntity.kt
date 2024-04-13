package org.dpluskia.rabbit.member.domain

import jakarta.annotation.Generated
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime

@Table("member")
data class MemberEntity(
    val name: String,
    val email: String,
    val phone: String,
) {
    @Id
    @Generated
    var id: Long = 0

    @CreatedDate
    lateinit var createdAt: LocalDateTime

    @LastModifiedDate
    lateinit var updatedAt: LocalDateTime
}
