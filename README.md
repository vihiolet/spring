# 1차 과제
## 개발환경 버전
- JDK1.8 (가이드 동일)
- 톰켓 9(가이드 동일)
- 이클립스 2019.9
- mysql 5

## 작업 과정 중 에러
1. 이클립스 'Failed to create the Java Virtual Machine' 경고창 뜨고 열리지 않음
<https://shanepark.tistory.com/32> 참고하여 Info.plist 수정
2. 스프링 설치 시 errors running builder 'java builder' on project 에러
이클립스 버그
3. 서버 실행 에러 Error creating bean with name 'homeController': Unsatisfied dependency expressed through field 'service'
movieService.java에 @Service 어노테이션 추가

<br><br>
# 2차 과제

## 이론 학습
**1. 필수 이론 과제**
- HTTP    
데이터를 주고 받기 위한 프로토콜(약속)이다.

- REST API    
REST API는 REST 원리로 만들어진 API이다.
REST 원리에 따라 자원을 명시하고(HTTP URI) 자원에 대한 행위를 통해(HTTP Method) 내용을 표현(CRUD Operation)한다.
REST API 설계 규칙을 잘 지킨 시스템을 RESTful이라고 한다.

  REST : 자원을 구분하여 해당 자원의 상태를 주고 받는 모든 것
  REST 구성요소    
  자원(Resource), 행위(verb), 표현(Representation)

- JSON    
데이터를 저장/전송할 때 사용하는 경량의 data 교환 형식이다.    
자바스크립트 객체 형식을 기반으로 만들어졌다. 그래서 key와 value로 구성되고 key와 문자열은 항상 쌍따옴표로 감싸야한다.    
JSON은 데이터 포맷일 뿐 데이터를 불러오기 위해서는 XMLHttpRequest() 메서드를 사용해야 한다.    

- @PathVariable    
데이터를 받아올 때 값을 쿼리스트링으로 전달하지 않는 경우에 사용한다.    
쿼리스트링을 사용하는 경우는 @RequestParam을 사용한다.(Get 방식 통신)    

**2. 추가 이론 과제(필수 이론 과제하면서 학습)**
- URI 와 URL    
URI : 특정 리소스를 식별하는 식별자
URL : 컴퓨터 네트워크 상에서 리소스의 위치

- HTTP Method(Get과 Post 외 Method 개념 학습)    
Get : 조회    
Post : 등록    
Put : 수정 - 리소스가 있으면 덮어쓰고(수정) 없으면 생성    
Patch : 수정 - 리소스 일부를 변경(수정)    
Delete : 제거 


# 3차 과제
## 결과 스크린샷
<div>
  <img width="312" src="https://github.com/vihiolet/spring/assets/108925254/d2dd35f5-860a-4aa0-9cc3-e5d18c8ec563">
  <img width="453" src="https://github.com/vihiolet/spring/assets/108925254/7a2db646-ccd0-4622-8c87-06f4e7f4cb39">
</div>

## 작업 과정 중 에러
1. Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.    
2. Error creating SQL Model Connection connection to springboot MySQL.    
   해결 방법 : application.properties 파일에 있는 spring.datasource 정보를 mysql로 수정

3. 스프링프로젝트 The selection cannot be run on any server
   <a href="https://stackoverflow.com/questions/32731672/the-selection-cannot-be-run-on-any-server">참고한 스택오버플로우</a>

## 작업 과정 중 새로 알게된 정보    
1. 스프링부트 Snapshot버전    
   Snapshot : 아직은 안정화되지 않은 데일리 빌드버전(최신 버전)    
   M (Milestone) : 주요 기능이 구현될 때마다 배포하고 피드백을 받는 버전(M2는 '마일스톤 2번째'라는 의미)    
   <a href="https://m.blog.naver.com/PostView.naver?blogId=doyoung0205&logNo=221783121918&categoryNo=1&proxyReferer=">참고한 블로그</a>    

2. sql LEFT( string,length )    
   문자열의 왼쪽부터 일정 길이만큼 출력하는 함수

## SW활용 현황 통계 API 구축을 위한 SQL
1. 월별 접속자 수    
   select count(*) as loginCnt from requestinfo where left(createDate, 2) = #{year} and substring(createDate, 3,2) = #{month};

3. 일자 접속자 수    
   select count(*) from requestinfo where left(createDate, 2) = #{year} and substring(createDate, 3,2) = #{month} and substring(createDate, 5, 2) = #{day};

5. 평균 하루 로그인 수    
   select floor(avg(countDate)) from (select date, count(date) as countDate from user group by date) as t1;

7. 휴일을 제외한 로그인    
   select count(*) from user where left(date, 4)= #{month} and holiday_fg = 'N';

9. 부서별 월별 로그인 수    
   select count(*) from user where HR_ORGAN = #{dept};

   <br><br>
   
# 4차 과제
## 결과 스크린샷
<div>
  <img width="748" src="https://github.com/vihiolet/spring/assets/108925254/6bc42679-238f-4073-9b00-1b388777b678">
  <img width="877" src="https://github.com/vihiolet/spring/assets/108925254/d74bc7b2-7b95-4579-b5fc-34512e38ef36">
  <img width="603" src="https://github.com/vihiolet/spring/assets/108925254/e499c60f-b0af-469e-aa7c-ad22f47f7ff3">
  <img width="728" src="https://github.com/vihiolet/spring/assets/108925254/de101155-24e8-42c8-b11d-38f93146572d">
  <img width="728" src="https://github.com/vihiolet/spring/assets/108925254/fd8b9b7f-802a-498d-abc1-edcbbbc3a0c2">
</div>
