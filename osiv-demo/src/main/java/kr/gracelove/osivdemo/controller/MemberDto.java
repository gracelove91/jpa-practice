package kr.gracelove.osivdemo.controller;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * @author : Eunmo Hong
 * @since : 2020/07/01
 */

@ToString
@Getter
public class MemberDto {

    private String name;
    private String teamName;

    @Builder
    public MemberDto(String name, String teamName) {
        this.name = name;
        this.teamName = teamName;
    }
}
