# IT 대기업 현업 개발자와 함께 하는 백엔드 개발 실무

### 3주차 REST API 구현

1. 스프링부트로 개발 환경 설정하기

* 프로젝트 셋팅 (완료)
  + Spring Starter Project 생성
  + pom.xml 설정
    - Spring Boot 2.2.2. RELEASE 버전 / ojdbc8 / tomcat-embed-jasper / jstl 의존성 추가
  + application.properties 수정
    - port 번호 추가 / ContextPath / view.prefix / view.suffix / DataSource 설정
  + 테스트를 위한 폴더, 파일 생성
  + 테스트 컨트롤러 작성 후 브라우저에서 확인
  ![result01](https://user-images.githubusercontent.com/59604987/102009013-fb36b080-3d77-11eb-8b7a-ed1198bf2022.PNG)

2. 통계 API를 위한 DB, Table 생성 (완료)
* requestInfo / requestCode / users 테이블 생성
* requestInfo에 테스트 데이터 Insert

3. RestController를 활용한 간단한 API 구현
* Model / Controller 클래스 작성
  + YearStasticVO - 응답결과를 리턴하는 클래스
  + StatisticDAO (Interface), StatisticDAOImpl - SqlSession 객체로 DB와 직접 통신
  + StatisticService (Interface), StatisticServiceImpl - DAO 객체를 호출
  + StatisticController - RestController / Request Parameter을 처리 후 응답 객체(YearStasticVO)를 생성하여 return (@ResponseBody)
* mapping 파일 작성
  + statistic-mapping.xml
    + "sqlyearStatistic" : year(String) 파라미터를 받아 로그인 횟수를 integer로 리턴
* 서버구동 후 결과 확인
