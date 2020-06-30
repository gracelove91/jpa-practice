package kr.gracelove.osivdemo;

import kr.gracelove.osivdemo.domain.Member;
import kr.gracelove.osivdemo.domain.Team;
import kr.gracelove.osivdemo.repository.MemberRepository;
import kr.gracelove.osivdemo.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author : Eunmo Hong
 * @since : 2020/07/01
 */

@RequiredArgsConstructor
@Component
public class Init implements ApplicationRunner {
    private final MemberRepository memberRepository;
    private final TeamRepository teamRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Team teamA = teamRepository.save(new Team("teamA"));
        memberRepository.save(Member.builder()
                .name("member1")
                .team(teamA)
                .build());
    }
}
