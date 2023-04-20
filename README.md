# **CampingMall Project**

<br>
<div align="center">
    <img style="width:300px; height:400px;" src="https://user-images.githubusercontent.com/117332869/218310675-ac69e653-025a-4b30-bb22-af611652570a.png">
</div>
<br>


# 🏕 1. 프로젝트 주제
- <b>캠핑장 종합 예약 웹 서비스</b>
<br>: 여러 상호의 캠핑장을 둘러보며 예약할 수 있고, 각 관리자는 본인의 캠핑장 컨텐츠를 관리할 수 있음 
<br><br><br>

# 🏕 2. 기획 의도 및 목적
- 팀 프로젝트 과정을 통해 협업에 필요한 커뮤니케이션과 다양한 툴 사용 경험 증진
- 교육받은 내용을 바탕으로 팀원 모두 프론트/백을 설계, 개발하며 프로세스 이해도 향상
- 네이버 클라우드 플랫폼(NCP)을 사용한 배포를 통해 도메인, 서버에 대한 이해도 향상 및 서버 운영, 유지 보수 경험 축적
- 아임포트, kakao, naver, google 등의 다양한 API(예약/결제 및 소셜 로그인, 카카오맵, 날씨 기능, 챗봇 등)사용 경험 축적
- 유저(이용 고객)와 관리자(캠핑장 업체) 페이지를 별도로 두어 보안을 강화한 캠핑장 종합 예약 웹 서비스가 되도록 기획
- 다양한 API 활용과 반응형 웹, 직관적인 UI로 사용자 편의 제공
- 캠핑장 업체 관리자의 넓은 웹 컨텐츠 수정 권한 제공
<br><br><br>


# 🏕 3. 프로젝트 구성원 및 담당/WBS
<br>

## 3-a. 구성원(4인) 및 담당

NAME | Representative  
---- | ----
공통 | - 주제 선정, 일정 수립, 기획 <br> - 개발환경 구축, 테이블/주요 기능 설계 <br> - 디자인 레이아웃 설계 <br> - 테스트, 디버깅, 검수, 포트폴리오 제작|
강무성 | - DB설계 <br> - ERD/DDL/DML 제작 <br> - 메인/서브 페이지 레이아웃 작업 <br> - 예약 시스템, 예약 조회시스템 <br> - ADMIN통계 페이지, 예약정보 관리 페이지 개발|
김태욱 | - 메인/서브 레이아웃 작업 <br> - 예약 조회시스템, 예약 상세, 결제 시스템 <br> - 날씨 시스템 개발 <br> - ADMIN통계 페이지 <br> - 환불 처리 페이지 개발|
박지원 | - UI, 로고, CSS 등 디자인 작업 <br> - 와이어프레임 제작 <br> - 프레임 작업, 메인/서브 페이지 레이아웃 작업 <br> - 메인 페이지 CRUD, 공지사항 CRUD, 구역소개 CRUD <br> - 로그인 화면 제작 <br> - 지도 시스템, 챗봇 시스템 개발|
윤동섭 | - DB설계 <br> - ERD/DDL/DML 제작 <br> - 메인/서브 페이지 레이아웃 작업 <br> - 메인 페이지 CRUD, 시설 CRUD, 상호 CRUD, 홈 CRUD <br> - 로그인/SNS로그인/로그아웃/회원가입/수정, 마이페이지 개발 <br> - 회원가입 시 암호화(AES512)<br> - 예약 시스템, 예약 조회시스템 <br> - 리뷰시스템 <br> - 다국어 처리 <br> - 파일업로드(중복이름파일, 교체된 이미지 삭제 처리)<br> - ADMIN로그인, 회원관리, 휴무일 지정, 예약정보 관리 페이지 개발|

<br><br>

## 3-b. WBS
### WBS - 진행 일정(약 6주)
![WBS_1](https://user-images.githubusercontent.com/117332903/218639451-34e7105b-0062-4f2a-ac78-08678cfb1617.png)
<br>

### WBS - 상세
![WBS_2](https://user-images.githubusercontent.com/117332869/222756210-6cf8459e-591a-4b7d-ac9f-7fc644797a80.png)
<br>
- 수행할 목록을 작성하고 크게 분리하여 각 파트마다 마감 일정을 지정
- 지연되는 일정을 확인하고, 해당 일정은 담당 외 다른 인원이 함께 개발하여 일정을 관리함
- 마감 이후 다시 추가 및 수정했던 수행 목록들을 확인, 추후 다른 프로젝트의 개발 일정에 참고할 수 있음
<br><br><br>

# 🏕 4. 시스템 구성/개발도구

### 시스템 구성도

![시스템구성도](https://user-images.githubusercontent.com/117332869/233350467-951dc088-0841-4bb5-be48-338cf735d31a.png)

<br>

### 개발도구

| IDE | Back | Front | DB | FrameWork | API | Etc - Tools | Server |
| :-: | :-: | :-: | :-: | :-: | :-: | :-: | :-: |
| Eclipse<br> IntelliJ<br> VSCode | Java JDK 11 | HTML<br> JavaScript<br> Jquery<br> Ajax | MySQL<br> v8.0.31 | SpringBoot<br> ThymeLeaf<br>Mybatis | Weather API<br> Kakao API<br> Import API<br> Naver ChatBot | GitHub<br> WorkBanch<br> Gather Town<br> Coggle<br> Figma<br> ERDCloud<br> CloudCraft<br> Google Sheet |	NCP(Naver Cloud Platform) |


<br><br><br>

# 🏕 5. DB 설계/기능 흐름도
###   DB 설계(ERD)

![Camping](https://user-images.githubusercontent.com/117332903/218227527-60f4175b-2ff7-4791-914c-4c860873fece.png)

<br>

###  기능 흐름도(USER페이지)

<img width="100%" src="https://user-images.githubusercontent.com/117332869/218310757-3d3b9295-02d1-43d5-ba35-6271559f319c.jpg">

<br>

###  기능 흐름도(ADMIN페이지)

<img width="100%" src="https://user-images.githubusercontent.com/117332869/218310760-6426fec6-d29e-4695-9703-99d0ea36cf9d.jpg">

<br><br><br>

# 🏕 6. 웹 서비스 구현 화면
## [ USER 페이지 ]
- 시작 페이지에서 인삿말, 업체 메인 이미지 슬라이드, 각 메뉴 탭의 요약 정보가 제공되며 read more/메뉴의 각 탭 클릭시 상세 정보를 이용할 수 있도록 구성
<br>
<img src="https://user-images.githubusercontent.com/117332869/226212469-8eabb2ae-39c0-4167-a521-1850a087c17c.gif" width="650">
<img src="https://user-images.githubusercontent.com/117332869/226212599-b4710d25-eca4-446b-9d48-b17b33aaec02.PNG" width="650">
<img src="https://user-images.githubusercontent.com/117332869/226212606-d163e479-1046-4cdd-b0e3-7eb477596261.gif" width="650">
<img src="https://user-images.githubusercontent.com/117332869/226212616-c9387459-d78d-49db-a916-d5b32c1cd663.PNG" width="650">
<img src="https://user-images.githubusercontent.com/117332869/226212619-2d6ef5a3-f0cc-46eb-83d9-20361d92f670.PNG" width="650">
<img src="https://user-images.githubusercontent.com/117332869/226215059-58201daf-f596-4c34-8236-a39c7a30e30e.PNG" width="650">

<br>
<br>
<br>

## a. 캠핑장 업체 선택 / 오류 페이지
![캠핑장선택,에러](https://user-images.githubusercontent.com/117332903/218694227-71c871e4-3b50-4101-b2e3-a055b1e03e06.gif)
- 여러 캠핑장을 종합한 예약 웹 사이트이므로 첫 페이지에서 캠핑장을 선택하도록 구성
- 세션으로 캠핑장 업체를 구분하며 세션에 따라 DB에서 업체별 데이터를 불러옴
- 잘못된 주소 및 세션 만료시 에러 페이지 대신 캠핑장 선택페이지로 이동, 사용자가 에러 페이지를 보는 것을 방지함
<br><br><br>

## b. 회원가입 / 탈퇴
![회원가입](https://user-images.githubusercontent.com/117332903/218677920-775f388e-deb6-421e-a031-c0b114fe7b64.gif)
- 회원가입시 각 input마다 정규식을 사용해 유효성검사를 시행
- 비밀번호는 AES512 단방향 암호화 방식을 채택하여 DB에 저장
<br><br><br>

![회원탈퇴](https://user-images.githubusercontent.com/117332903/218682110-bc409d95-eb5e-44cf-ada5-7b2565153402.gif)
- 로그인 후 마이페이지에서 탈퇴 가능
- 탈퇴 시 DB에 있는 데이터 ID앞에 구분자가 삽입되며 ID 외 나머지 개인정보는 삭제 처리
- ID는 통계 및 환불 등의 데이터 사용을 위해 탈퇴 처리만 구분하고 보존됨
<br><br><br>

## c. 예약하기
### c-1. 캠핑 일정-사이트 선택
![달력클릭](https://user-images.githubusercontent.com/117332903/218662949-bda7ae32-500f-4cf1-8e58-69242d989b79.gif)
- 캠핑할 일자를 선 선택 후 그 일자에 예약되지 않은 사이트(자리)를 선택하는 과정
- JavaScript의 cell을 이용하여 달력 구현/함수 로직으로 선택된 일자를 표시
- DB에서 관리자가 설정한 휴무일을 제외한 일자에서만 사이트(자리)선택 활성화
- 선택한 일자 중 예약완료 사이트를 제외한 사이트(자리)만 선택 활성화
- 기상청 날씨 API를 통해 해당 캠핑장 업체 지역의 날씨정보를 제공하여 예약 시 편의성 제공
<br><br>

### c-2. 결제
![결제](https://user-images.githubusercontent.com/117332903/218663003-53309dde-5ce3-4ee1-b263-cd3f45ec21ab.gif)
- import API를 이용해 결제 요청 후 결제 정보를 DB에 저장
- 검증단계에서 import restAPI를 통해 검증과 webhook서비스를 이용한 결제정보 동기화작업을 수행
- 결제 완료 후 예약/환불 정보를 마이페이지에서 확인 가능
<br><br><br>


## d. 리뷰시스템
![리뷰](https://user-images.githubusercontent.com/117332903/218890857-968dc169-d8d1-4caf-8ca1-10350483e854.gif)
- 실 캠핑장 이용 고객의 한줄평과 별점 부여 기능
- 해당 사이트(자리) 실제 이용자 이외에는 작성할 수 없음(비 로그인 및 이용 전 단순 예약상태에서는 작성불가)
<br><br><br>

## e. 반응형
![반응](https://user-images.githubusercontent.com/117332903/218700164-2800e2f8-9370-4b4b-87ec-2abe7cb90ea5.gif)
- 반응형 웹 형식으로 제작하여 태블릿/모바일 등의 환경에서도 사용이 용이하게 구현
- 출력되는 페이지의 가로 사이즈에 따라 컨텐츠 정렬 및 폰트가 변화
<br><br><br>

---
<br>

## [ ADMIN 페이지 ]

- 업체 정보, 통계, 유저 관리 등이 가능한 캠핑장 업체 관리자용 페이지

<br>

## a. 관리자 로그인
![다른admin](https://user-images.githubusercontent.com/117332903/218661687-8e01e069-6f00-46ea-b027-0a6d88878d65.gif)
- 각 업체별 관리 페이지가 존재하며, 업체가 직접 홈페이지 내용을 관리 할 수 있음
- 잘못된 주소 및 세션 만료시 에러 페이지 대신 로그인 페이지로 이동
<br><br><br>

## b. 통계 및 요약
![통계보기](https://user-images.githubusercontent.com/117332903/218662168-3a821845-020a-4389-b1bf-5dfadae77d9d.gif)
- 매출(월/년별), 예약 수, 방문객, 구역별 매출/방문객 통계를 선택하여 확인 가능
- 최근 예약 정보 및 검색, 최근 리뷰/별점을 요약 확인 가능
<br><br><br>

## c. 홈페이지 관리
### c-1. 업체 정보 수정

<img src="https://user-images.githubusercontent.com/117332869/226213175-c26913d1-4daa-431c-8d5f-ed2bf49e6c24.PNG" width="650">
<img src="https://user-images.githubusercontent.com/117332869/226213176-2c04956d-d09a-457d-b78c-1dbf7abc2a2b.PNG" width="650">

- USER 페이지의 캠핑장 선택/메인 화면에서 제공되는 업체 정보를 직접 수정할 수 있음
- 관리자가 지정한 캠핑장의 위도/경도에 따라 USER페이지의 지도 및 날씨가 반영됨
<br><br>

### c-2. 공지 글 관리

<img src="https://user-images.githubusercontent.com/117332869/226213598-eaf178aa-696a-43a8-b42c-cedf9349bdcd.PNG" width="650">
<img src="https://user-images.githubusercontent.com/117332869/226213601-775e4c46-62be-4460-9239-e832638f3bad.PNG" width="650">

- 홈페이지 메인과 공지사항 탭에 제공되는 공지사항 작성 기능
- 작성/수정시 주요공지로 올리면 메인에 노출+공지사항 게시판 상단에 위치시켜 공지를 강조할 수 있음
- JavaScript로 글자수를 확인하며 작성 가능
<br><br>

### c-3. 구역-사이트(자리) 관리

<img src="https://user-images.githubusercontent.com/117332869/226213767-08016172-db84-4a96-b328-b63b7d7d9936.PNG" width="650">
<img src="https://user-images.githubusercontent.com/117332869/226213770-2fbe0637-76bb-466a-92ac-89250a0801dd.PNG" width="650">

![이미지변경](https://user-images.githubusercontent.com/117332903/218695525-c05362f7-e7b2-4362-a655-a79e5dfbe34a.gif)

- 구역과 구역 안의 사이트(자리)를 관리하는 기능
- 설명과 이미지 관리 추가 및 수정이 가능
- 이미지 수정 시 업로드한 파일은 ADMIN프로젝트의 이미지 폴더로 저장, 기존 이미지 파일은 삭제 처리됨
- 사용중인 파일명과 중복된 파일명일 경우 파일명 뒤에 (숫자)가 추가되어 저장됨
- USER페이지에서는 DB에 기록된 ADMIN프로젝트 이미지 폴더의 파일을 불러와서 USER화면에 출력하도록 개발

<br><br><br>


##  d. 휴무일 지정

![휴일추가](https://user-images.githubusercontent.com/117332903/218662412-bc440727-d840-4a9a-81bc-1f95e87d78e6.gif)

- 달력에서 휴무일을 지정하여 해당 일자는 예약 불가능하게 설정하는 기능
- 관리자가 확인할 수 있는 휴무 사유 메모 가능
- USER페이지와 마찬가지로 JavaScript의 cell을 이용하여 달력 구현/함수 로직으로 선택된 일자를 표시

<br><br><br>

##  e. 회원관리

<img src="https://user-images.githubusercontent.com/117332869/226214400-9528b5f4-1fb1-4329-8009-d0c2ce5e4927.PNG" width="650">
<img src="https://user-images.githubusercontent.com/117332869/226214402-f07851ed-005e-4986-8ad1-a5d37799bce3.PNG" width="650">

- 현재 캠핑장을 사용한 사용자의 이름, 생년월일, 예약횟수, 연락처, 최근 예약일, 탈퇴여부를 확인하는 기능
- 이름 클릭시 예약과 관련한 상세정보 확인 가능

<br><br><br>


## f. 환불 처리

![환불](https://user-images.githubusercontent.com/117332903/218693075-58da665b-4ee6-4398-9181-a8062725ba12.gif)

- 유저가 요청한 환불 리스트를 확인 가능한 페이지
- 관리자가 환불 승인/거절을 처리할 수 있음
- 환불이 거절되었을 경우 유저는 환불 재요청 가능

<br><br><br>

---
<br>

## [ API ]

- 홈페이지 개발에 활용한 API 기능들

## a. 카카오 Login

![카카오](https://user-images.githubusercontent.com/117332903/218676346-55c65cb9-8312-44b4-b5a8-1e7b1590fa79.gif)

- 카카오에서 제공하는 sns 정보로 가입/로그인하는 기능
- 탈퇴시 DB에서 일반 회원가입과 같은 시스템으로 DB에서 데이터가 삭제되며 카카오와의 연결도 끊어짐
<br><br><br>

## b. 기상청 날씨, 카카오 Map

![좌표수정](https://user-images.githubusercontent.com/117332903/218662484-7c76086b-9a62-4ac4-b4c9-49f7c49ee9a4.gif)

- 수정된 위도, 경도가 USER페이지의 지도 및 날씨에 반영됨
- 날씨API의 경우 입력한 위도/경도가 기상청 API가 요구하는 x좌표/y좌표로 변환되어 이용됨
<br><br><br>

## c. NCP 챗봇

<img src="https://user-images.githubusercontent.com/117332903/218676813-58f0a4e3-6d83-4951-a70b-3795e5182227.gif" width="310px">

- 챗봇을 통한 문의 기능
- NCP(네이버 클라우드 플랫폼)의 AI 챗봇서비스를 이용하여 구현
- 답변할 수 없는 질문의 경우 유선전화로 안내

<br><br><br>

# 🧨 7. 트러블 슈팅
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
<br>
<br>

end
