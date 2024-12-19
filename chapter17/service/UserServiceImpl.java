package chapter17.service;

import chapter17.entity.User;
import chapter17.repository.UserRepository;

public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private User loggedInUser; // 로그인 된 사용자 정보를 저장

    public UserServiceImpl() {
        this.userRepository = new UserRepository();
    }

    @Override
    public void registerUser(String userId, String password, String name, String email) {
        userRepository.save(new User(userId, password, name, email));
        System.out.println("사용자 회원가입 완료: " + name);

    }

    @Override
    public void login(String userId, String password) {
/*         전달 받은 ID에 대한 검증
           값이 존재할 수도 있고 존재하지 않을 수도 있는 객체를 감싸는 Wrapper 클래스
           +) ifPresentOrElse() 메서드
           Optional 객체에 대해 값이 존재할 경우 ifPresent 로직을 처리,
           그렇지 않을 경우 orElse 의 로직을 처리
           ifPresentOrElse(data -> {데이터가 존재할 경우 로직}, 그렇지 않을 경우 로직);
        */
        userRepository.findByUserId(userId).ifPresentOrElse(user -> {
            // 해당 userId의 회원 정보에서 전달 받은 password 가 일치하는지 확인
            if (user.getPassword().equals(password)) {

                loggedInUser = user;
                System.out.println("로그인 성공: " + user.getName());

            } else {
                System.out.println("로그인 실패: 비밀번호가 일치하지 않습니다.");

            }
        }, () -> System.out.println("로그인 실패: 사용자 ID를 찾을 수 없습니다."));

    }

    @Override
    public void logout() {

        if (loggedInUser != null) {

            System.out.println("로그아웃 성공");
            loggedInUser = null;

        } else {
            System.out.println("로그인 상태가 아닙니다.");
        }
    }

    @Override
    public boolean isLoggedIn() {
        return loggedInUser != null;
    }
}