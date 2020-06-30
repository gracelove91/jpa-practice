package kr.gracelove.osivdemo.service;

import kr.gracelove.osivdemo.domain.Member;
import kr.gracelove.osivdemo.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : Eunmo Hong
 * @since : 2020/06/30
 */

@RequiredArgsConstructor
@Transactional
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public void join(Member member) {
        memberRepository.save(member);
    }

    public Member findByName(String name) {
        return memberRepository.findByName(name);
    }
}
