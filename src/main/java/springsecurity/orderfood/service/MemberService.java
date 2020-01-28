package springsecurity.orderfood.service;


import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springsecurity.orderfood.model.Member;
import springsecurity.orderfood.repository.MemberRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    //final 처리시 변경하지않는다.
    private final MemberRepository memberRepository;

    //생성자에서 주입 해준다.
    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }



    @Transactional
    public Long SingUp(Member member) {
        
        validateDuplicateMember(member);
        memberRepository.save(member);
    }

    private void validateDuplicateMember(Member member) {
        List<Member> findMembers = memberRepository.findByName(member.getName());
        if(!findMembers.isEmpty()) {
            throw  new IllegalStateException("회원가입된 사람입니다.");
        }


    }

    public List<Member> findMembers() {
        return memberRepository.findAll();

    }

    public Member findOne(Long memberId) {

        return memberRepository.find(memberId);
    }

}

//뭐지 lombok 처리가 안됨 ㅜㅜ