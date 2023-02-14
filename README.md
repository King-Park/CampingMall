# **CampingMall Project**

<br>
<div align="center">
    <img style="width:300px; height:400px;" src="https://user-images.githubusercontent.com/117332869/218310675-ac69e653-025a-4b30-bb22-af611652570a.png">
</div>
<br>


# 1. 프로젝트 주제 및 기획의도

### 🏕  프로젝트 주제

**Spring boot기반의 다양한 API를 활용한 캠핑장 종합 예약 웹 서비스 구축**
<br><br>

### 🏕  기획의도/차별점

- 회원 및 예약과 결제 서비스가 활용되면서 유저(이용 고객)와 관리자(캠핑장 업체) 모두 사용하는 웹 서비스인 캠핑장 종합 예약 웹 서비스로 기획
- 다양한 API 활용과 반응형 웹, 직관적인 UI로 사용자 편의 제공
- 캠핑장 업체 관리자의 넓은 웹 컨텐츠 수정 권한 제공
- 차별성이나 강조할거 또 뭐있지...
<br><br><br>

# 2. 프로젝트 목적

- 팀 프로젝트 과정으로 협업에 필요한 여러 툴을 사용한 프로젝트 완성
- 교육받은 내용을 바탕으로 팀원 모두 프론트/백을 설계, 개발하며 프로세스 이해도 향상 
- 네이버 클라우드 플랫폼(NCP)을 사용한 배포를 통해 도메인, 서버에 대한 이해도 향상 및 서버 운영, 유지 보수 경험 축적
- 아임포트, kakao, naver, google 등의 다양한 API를 이용하여 예약/결제 및 소셜 로그인, 카카오맵, 날씨 기능, 챗봇 등 구현
- Spring boot OAuth2 방식 로그인 인증 구현
- 추가및수정예정
<br><br><br>

# 3. 시스템 구성/개발도구

### 🏕  시스템 구성
<img width="1743" alt="Camping Mall" src="https://user-images.githubusercontent.com/117332903/218227062-2f92280a-312b-4d4d-b7ba-4dd7c381bc2c.png">

<br>

### 🏕  개발도구표넣을예정


<br><br><br>

# 4. 프로젝트 구성원 및 담당/WBS

### 🏕  프로젝트 구성원

NAME | Representative  
---- | ----
공통 | - 주제 선정, 일정 수립, 기획 <br> - 개발환경 구축, 테이블/주요 기능 설계 <br> - 디자인 레이아웃 설계 <br> - 테스트, 디버깅, 검수, 포트폴리오 제작
강무성 | - DB설계 <br> - ERD/DDL/DML 제작 <br> - 메인/서브 페이지 레이아웃 작업 <br> - 예약 시스템, 예약 조회시스템 <br> - ADMIN통계 페이지, 예약정보 관리 페이지 개발
김태욱 | - 메인/서브 레이아웃 작업 <br> - 예약 조회시스템, 예약 상세, 결제 시스템 <br> - 날씨 시스템 개발 <br> - ADMIN통계 페이지 <br> - 환불 처리 페이지 개발
박지원 | - 와이어프레임 설계 <br> - 프레임 작업, 메인/서브 페이지 레이아웃 작업 <br> - 메인 페이지 ~~C~~R~~UD~~, 공지사항 CRUD, 구역소개 CRUD <br> - 로그인 화면 <br> - 지도 시스템, 챗봇 시스템 개발
윤동섭 | - DB설계 <br> - ERD/DDL/DML 제작 <br> - 메인/서브 페이지 레이아웃 작업 <br> - 메인 페이지 CRUD, 구역소개 CRUD, 시설소개 CRUD <br> - 로그인/SNS로그인/로그아웃/회원가입, 마이페이지 개발 <br> - 예약 시스템, 예약 조회시스템 <br> - 리뷰시스템 <br> - 다국어 처리 <br> - ADMIN로그인, 회원관리, 휴무일 지정, 예약정보 관리 페이지 개발

기본적으로 wbs시트에 있는ㄱ거만 넣었습니다 각자 추가하고 수정하기!!! 

<br>

### 🏕  wbs시트수정하고추가예정


<br><br><br>


# 5. DB 설계/기능 흐름도
### 🏕  DB 설계(ERD)

![Camping](https://user-images.githubusercontent.com/117332903/218227527-60f4175b-2ff7-4791-914c-4c860873fece.png)

<br>

### 🏕  기능 흐름도(USER페이지)

<img width="100%" src="https://user-images.githubusercontent.com/117332869/218310757-3d3b9295-02d1-43d5-ba35-6271559f319c.jpg">

<br>

### 🏕  기능 흐름도(ADMIN페이지)

<img width="100%" src="https://user-images.githubusercontent.com/117332869/218310760-6426fec6-d29e-4695-9703-99d0ea36cf9d.jpg">

<br><br><br>

# 6. 웹 서비스 구현 화면

촬영하고설명하고
<br><br><br>

# 7. 트러블 슈팅🧨
1. BootStrap 사용시 하위맵핑에서 js파일 실행안되는 현상 발생 (ex. localhost/user/register) - 해결
> Thymeleaf 사용시 src를 th:src로 변경하여 해결<br>
<br>

2. Mapping 실행시 추가적으로 GETMapping이 실행되는 현상 발생 - 해결
> 템플릿파일 중 JS파일에서 맵핑을 두번실행되는 것으로 추정됨<br>
> 해결은 했지만, 아직 완벽한 원인을 파악하지 못함….<br>
<br>

3. IntelliJ에서 main.java에 있는 xml파일 인식 못하는 문제 발생 - 해결
> IntelliJ 이슈인것으로 추측됨.<br>
> resources하위폴더로 Path를 새로 잡아준 후 해결<br>
> mybatis.mapper-locations=classpath:mybatis//*.xml
<br>

4. 다른페이지에서 Login시 url이 중첩되어지는 현상 발생 - 해결
> ex) Notice페이지에 맵핑된 페이지에서 Login 모달 실행시 /notice/login/loginOk로 맵핑됨<br>
> 맵핑 주소 앞에 ‘ / ‘ 를 삽입하여 해결<br>
<br>

5. Kakao Map 로그인, 회원가입 후 500에러 현상 발생 - 해결
> Controller에서 ‘ / ‘ 로 맵핑시 데이터가 전달되도록 설정되어 있음<br>
> UserController에서 main으로 return하던것을 redirect를 사용하여 ‘ / ‘ 로 리턴시켜 해결<br>
<br>

6. 예약페이지 달력에서 background-color 클릭이벤트시 한자리 숫자와 두자리 숫자 클릭시 표시 불량 - 해결
> 처음에 클릭하는 숫자앞에 0을 문자타입으로 붙여서 숫자로 인식 못하는 문제 발생<br>
> 해당 문자를 숫자로 인식하게 하기 위해 0일 빼주어 숫자로 인식하게 만듬<br>
<br>

7. Controller에서 같은 변수명 List형식으로 받아지지 않는 현상 발생 - 해결
> Controller에서 매개변수 설정시 에노테이션을 작성해 주어야함<br>
> @RequestParam 에노테이션 작성 후 문제 해결<br>
<br>

8. Admin 페이지에 파일을 upload하기 때문에 User페이지에서 데이터를 못 받아오는 현상 발생 - 해결
> Class를 생성해서 WebMVCConfigurer를 상속받아 addResourceHandlers 메서드를 Override 함<br>
> Configuration 에노테이션을 Class에 선언해주어야 함<br>
> 경로 작성시 ‘ / ‘ 닫는거 유의!!<br>
<br>

9. Jquery 동작 안하는 현상 발생.. - 해결
> $(document).ready(); 를 선언해주지 않아 작동하지 않음..<br>
<br>

10. sidebar에 데이터 뿌려주는거 main페이지에서만 작동하고 다른페이지에서 작동 안하는 현상 발생 - 해결
> 페이지 이동시 데이터를 불러오고 보내주는 단계가 없어 데이터 뿌려주지 못함<br>
> session을 이용하여 해결<br>
<br>

11. 서버와 MySQL연동시 Query문 작동 안하는 문제 발생 - 해결
> 컬럼은 상관없지만, 테이블명에서 대소문자를 구분하기 시작함<br>
> ddl에 만든 테이블명을 소문자로 입력후 dml을 사용하니 해결 됨<br>
<br>

12. 서버 배포후 지연시간이 길다고 나와 연결 안되는 문제 발생 - 해결
> ACG설정에서 다른 포트들은 넣었지만 80포트를 추가하지 않아 접속이 안됨<br>
> 80포트 추가후 해결<br>
<br>

13. Local에서는 작동하나 배포 후 siteedit맵핑에 에러발생(500) - 해결
> 코드에 불필요한 코드 삭제 후 DB에서 맵핑으로 인한 대소문자 구분해준 후 해결<br>
<br>
