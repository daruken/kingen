package org.dpluskia.rabbit.member.application.port.out

import kotlinx.coroutines.flow.Flow
import org.dpluskia.rabbit.member.domain.Member

interface LoadMemberPort {
    suspend fun showMembers(): Flow<Member>
}
