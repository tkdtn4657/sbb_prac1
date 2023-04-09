https://wikidocs.net/book/7601
💻
**Spring Boot Board**

- [x] 2-01
- [x] 2-02
- [x] 2-03
- [x] 2-04
- [x] 2-05
- [x] 2-06
- [x] 2-07
- [x] 2-08
- [x] 2-09
- [x] 2-10
- [x] 2-11
- [x] 2-12
- [x] 2-13
- [x] 2-14
- [x] 2-15
- [x] 2-16
***
- [x] 3-01
- [x] 3-02
- [x] 3-03
- [x] 3-04
- [x] 3-05
- [x] 3-06
- [x] 3-07
- [x] 3-08
- [x] 3-09
- [x] 3-10
- [x] 3-11
- [ ] 3-12
- [ ] 3-13
- [ ] 3-14
***
이해가 안가서 직접하는 2회차
소단원별 한줄정리 및 평가
- 2-02 : controller의 개념(responsebody 및 getmapping과 controller어노테이션)
- 2-03 : build.gradle, app.properties 설정 추가(jpa, db관련)
- 2-04 : Entity(ORM클래스)선언 각 속성을 선언했으며 1:N일땐 OneToMany 등등 선언하여 외래결속
- 2-05 : SpringBootTest기능활용 Jpa sql쿼리문 사용법을 알아봄
- 2-06 : 리팩토링(도메인별 파일분류 answer, question, user)
- 2-07 : 타임리프속성 알아보기 질문목록제작
- 2-08 : ROOT URL추가
- 2-09 : Service추가 -> Controller에서 QuestionRepository 직접선언 제거
- 2-10 : controller(Model model) -> model.addAttribute("변수명","값") ->
html에 있는 ${Question << 여기로 값이 전부 넘어와서 그대로 값이 정리됨 대충 이런느낌인데 정확히는 아직 모호함
- 2-11 : form을 통해 입력한 th:action을 post형태로 보낸 후 값 처리
- 2-12 : 스태틱디렉터리에 css같은 파일을 넣음
- 2-13 : 부트스트랩적용
- 2-14 : layout.html을 통한 html, css 템플릿 상속
- 2-15 : ❓겁나어려움 Form을 생성해서 검증 후 Controller에서 bindingResult로 결과내고 저쩌구...
- 2-16 : layout.html만든것처럼 공용템플릿 만들었음 form_errors

***
- 3-01 : 네비게이션바 공통항목이라 레이아웃에 등록 동일한 부분 따로 뺌
- 3-02 : 페이징은 여러 라이브러리를 갖다써야하는데 그것도 다 난해한거같다 많이접해봐야할듯...
- 3-03 : 번호 = 전체 게시물 개수 - (현재 페이지 * 페이지당 게시물 개수) - 나열 인덱스 공식 생각해서 Layout페이지 적용
- 3-04 : 타임리프if문으로 question.answerList를 사용해서 1개 이상일 때 표시
- 3-05 : Security Gradle빌드, 모든페이지 접근권한 오픈
- 3-06 : 회원가입 폼 만들고 검증과정이 어렵다 여기도 좀 더 봐야할듯?
- 3-07 : 로그인과 로그아웃에 사용되는 메서드들 연결이 매끄럽지 못함 어려움
- 3-08 : 로그인, 로그아웃 상태에서 폼작성등 검증하는과정 isAuthentication 기능, 엔티티 값 추가
- 3-09 : 글쓴이 표시 추가
- 3-10 : 질문 수정 구현하는데 
```java
java.lang.NullPointerException: Cannot invoke "com.mysite.sbb_prac1.user.UserService.getUser(String)" because "this.userService" is null
```
에러 발생해서 정신나갈뻔... 원인은 Controller에 있는 final선언을 안해줘서 그랬었음. 수정사항 확인하면 될듯?

질문삭제는 그램그램에서 했던거도 있고 해서 약간은 이해가 쉬웠다

답변수정은 수정부분이 항상 어떻게 연결되는지 이해가 잘 안간다. 형태가 헷갈림 어떻게 기존에 있는 텍스트를 받아와서 수정이 가능한지? 이런거

답변삭제는 조금 신경쓰면 내가 만들수도 있을듯..? 그나마 할만함
- 3-11 : 지금 거의 형태 익히는 수준 ㅋㅋㅋ
- 3-12 : 