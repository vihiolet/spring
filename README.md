# 개발환경 버전
- JDK1.8 (가이드 동일)
- 톰켓 9(가이드 동일)
- 이클립스 2019.9
- mysql 5

# 작업 과정 중 에러
1. 이클립스 'Failed to create the Java Virtual Machine' 경고창 뜨고 열리지 않음
<https://shanepark.tistory.com/32> 참고하여 Info.plist 수정
2. 스프링 설치 시 errors running builder 'java builder' on project 에러
이클립스 버그
3. 서버 실행 에러 Error creating bean with name 'homeController': Unsatisfied dependency expressed through field 'service'
movieService.java에 @Service 어노테이션 추가


