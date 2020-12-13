# IT 대기업 현업 개발자와 함께 하는 백엔드 개발 실무

### 3주차 REST API 구현

1. 스프링부트로 개발 환경 설정하기

* 프로젝트 셋팅 (완료)
  + Spring Starter Project 생성
  + pom.xml 설정
    - Spring Boot 2.2.2. RELEASE 버전 / ojdbc6 / tomcat-embed-jasper / jstl 의존성 추가
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

![result02](https://user-images.githubusercontent.com/59604987/102009599-cd536b00-3d7b-11eb-9b0a-41ee99c32b68.PNG)

4. Rest API란?
* HTTP 통신
  + HTTP(Hyper Text Transfer Protocol)
    + Hyper Text 즉, HTML 문서를 전송하기 위한 프로토콜
    + 요청 Request, 응답 Response로 이루어진다.
    + 클라이언트가 서버에게 요청을 보내면, 서버는 요청에 대한 응답결과를 보낸다.
    + 각각의 통신은 비연결적이기 때문에 상태를 저장하지 않는다. => 상태를 기억하는 것처럼 보이게 하기 위해 세션/쿠키 사용
  + HTTP 패킷
    + HTTP 통신은 요청을 보내고 응답을 받을 때 정보들을 패킷(Packet)에 넣어 보낸다.
    + 패킷의 구조 : Header(전송지 주소, 패킷 생명 시간) / Body (실제 전달하고자 하는 내용)
  + HTTP 메소드
    + GET : URI가 가진 정보를 검색하기 위해 서버 측에 요청하는 형태이다.
    + POST : Form Action과 함께 전송, 이때 헤더 정보에 포함되지 않고 데이터 부분에 요청 정보가 들어가게 된다.
    + PUT : 해당 리소스를 수정한다.
    + DELETE : 해당 리소스를 삭제한다.
  + HTTP 통신 과정
    1. 사용자가 브라우저에 URL 주소 입력
    2. DNS 서버에 웹 서버의 호스트 이름을 IP 주소로 변경 요청
    3. 웹 서버와 TCP 연결 시도
    4. 서버에게 GET/POST/PUT/DELETE 명령을 전송한다.
    5. 서버가 클라이언트에게 데이터를 회신한다.
    6. 서버-클라이언트 간 연결을 해제한다.
    7. 웹 브라우저가 데이터(웹 문서)를 출력한다.
    
 
