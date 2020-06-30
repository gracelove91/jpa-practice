package kr.gracelove.osivdemo.controller;

import kr.gracelove.osivdemo.domain.Member;
import kr.gracelove.osivdemo.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Eunmo Hong
 * @since : 2020/06/30
 */

@RequiredArgsConstructor
@RestController
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/members/{name}")
    public MemberDto findMember(@PathVariable String name) {
        Member member = memberService.findByName(name);
        return MemberDto.builder()
                .name(member.getName())
                .teamName(member.getTeam().getTeamName())
                .build();
    }
}
