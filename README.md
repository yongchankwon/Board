# 🧩Board project
> 게시판 프로젝트입니다.

![메인 화면](https://user-images.githubusercontent.com/94505665/154907999-f3c0294e-365d-4d84-a767-f7fdd64bef43.png)

## Contents
- Introduction and features
  - 프로젝트 소개
  - 프로젝트 기능
  - 개발 환경

- structure and design
  - 패키지 구조
  - DB 설계
  - API 설계
 
- Review

## Introduction and features
**1. 프로젝트 소개**

**2. 프로젝트 기능**

- **게시판 -** CRUD 기능, 조회수, 페이징 처리
- **사용자 -** Security 회원가입 및 로그인, 회원정보 수정
- **댓글 -** CRUD 기능

**3. 개발 환경**

- **언어 :** Java
- **DBMS :** MySQL 8.0
- **JDK 버전 :** openjdk 8(openjdk version 1.8.0)
- **Bootstrap 버전 :** Bootstrap v5.0
- **개발도구 :** Eclipse 2021-12 (4.22.0)
- **개발 운영체제 :** Window 10


## structure and design
**1. 패키지 구조**

<details>
  
<summary>보기</summary>
  
  
```
📦src
 ┣ 📂main
 ┃ ┣ 📂java
 ┃ ┃ ┗ 📂controller
 ┃ ┃ ┃ ┗ 📂auth
 ┃ ┃ ┃ ┃ ┗ 📜LoginProcController.java
 ┃ ┃ ┃ ┃ ┗ 📜LogoutProcController.java
 ┃ ┃ ┃ ┣ 📂board
 ┃ ┃ ┃ ┃ ┣ 📜BoardDeleteController.java
 ┃ ┃ ┃ ┃ ┣ 📜BoardDeleteReqController.java
 ┃ ┃ ┃ ┃ ┣ 📜BoardDownloadControllerg.java
 ┃ ┃ ┃ ┃ ┣ 📜BoardListController.java
 ┃ ┃ ┃ ┃ ┣ 📜BoardPostController.java
 ┃ ┃ ┃ ┃ ┣ 📜BoardReadController.java
 ┃ ┃ ┃ ┃ ┣ 📜BoardReplylistController.java
 ┃ ┃ ┃ ┃ ┣ 📜BoardReplypostController.java
 ┃ ┃ ┃ ┃ ┣ 📜BoardUpdateController.java
 ┃ ┃ ┃ ┃ ┗ 📜BoardUpdateReqController.java
 ┃ ┃ ┃ ┣ 📂home
 ┃ ┃ ┃ ┃ ┗ 📜HomeForwardingController.java
 ┃ ┃ ┃ ┣ 📂introduce
 ┃ ┃ ┃ ┃ ┗ 📜IntroduceListController.java
 ┃ ┃ ┃ ┣ 📂member
 ┃ ┃ ┃ ┃  ┣ 📜MemberDeleteController.java
 ┃ ┃ ┃ ┃  ┣ 📜MemberJoinController.java
 ┃ ┃ ┃ ┃  ┣ 📜MemberListController.java
 ┃ ┃ ┃ ┃  ┣ 📜MemberSearchController.java
 ┃ ┃ ┃ ┃  ┗ 📜MemberUpdateController.java
 ┃ ┃ ┃ ┣ 📂notice
 ┃ ┃ ┃ ┃  ┣ 📜NoticeListController.java
 ┃ ┃ ┃ ┃  ┗ 📜NoticePostController.java
 ┃ ┃ ┃ ┣ 📜Controller.java
 ┃ ┃ ┃ ┣ 📜FrontController.java
 ┃ ┃ ┃ ┗ 📜HttpUtil.java
 ┃ ┃ ┣ 📂dao
 ┃ ┃ ┃ ┣ 📜BoardDAO.java
 ┃ ┃ ┃ ┗ 📜MemberDAO.java
 ┃ ┃ ┣ 📂Filter
 ┃ ┃ ┃ ┗ 📜AuthorityFilter.java
 ┃ ┃ ┣ 📂service
 ┃ ┃ ┃ ┣ 📜BoardService.java
 ┃ ┃ ┃ ┗ 📜MemberService.java
 ┃ ┃ ┣ 📂tmp
 ┃ ┃ ┃ ┣ 📜Bcrypt.java
 ┃ ┃ ┃ ┗ 📜BoardPost1000.java
 ┃ ┃ ┗ 📂vo
 ┃ ┃ ┃ ┣ 📜BoardVO.java
 ┃ ┃ ┃ ┣ 📜MemberVO.java
 ┃ ┃ ┃ ┗ 📜ReplyVO.java
 ┃ ┣ 📂webapp
 ┃ ┃ ┣ 📂META-INF
 ┃ ┃ ┃ ┗ 📜MANIFEST.MF
 ┃ ┃ ┣ 📂resources
 ┃ ┃ ┃ ┣ 📂css
 ┃ ┃ ┃ ┃ ┗ 📜common.css
 ┃ ┃ ┃ ┗ 📂img
 ┃ ┃ ┃ ┃ ┣ 📜1banner.jpg
 ┃ ┃ ┃ ┃ ┣ 📜2banner.jpg
 ┃ ┃ ┃ ┃ ┣ 📜3banner.jpg
 ┃ ┃ ┃ ┃ ┣ 📜autumn.jpg
 ┃ ┃ ┃ ┃ ┣ 📜reply.jpg
 ┃ ┃ ┃ ┃ ┣ 📜spring.jpg
 ┃ ┃ ┃ ┃ ┣ 📜summer.jpg
 ┃ ┃ ┃ ┃ ┗ 📜winter.css
 ┃ ┃ ┣ 📂WEB-INF
 ┃ ┃ ┃ ┣ 📂layouts
 ┃ ┃ ┃ ┃ ┗ 📜Layout.jsp
 ┃ ┃ ┃ ┣ 📂lib
 ┃ ┃ ┃ ┃ ┣ 📜commons-collections4-4.4.jar
 ┃ ┃ ┃ ┃ ┣ 📜commons-dbcp2-2.9.0.jar
 ┃ ┃ ┃ ┃ ┣ 📜commons-pool2-2.11.1.jar
 ┃ ┃ ┃ ┃ ┣ 📜jbcrypt-0.4.jar
 ┃ ┃ ┃ ┃ ┗ 📜mysql-connector-java-8.0.28.jar
 ┃ ┃ ┃ ┣ 📂module
 ┃ ┃ ┃ ┃ ┣ 📜banner.jsp
 ┃ ┃ ┃ ┃ ┣ 📜footer.jsp
 ┃ ┃ ┃ ┃ ┣ 📜header.jsp
 ┃ ┃ ┃ ┃ ┣ 📜items.jsp
 ┃ ┃ ┃ ┃ ┣ 📜link.jsp
 ┃ ┃ ┃ ┃ ┣ 📜meta_header.jsp
 ┃ ┃ ┃ ┃ ┣ 📜nav_tab.jsp
 ┃ ┃ ┃ ┃ ┗ 📜nav.jsp
 ┃ ┃ ┃ ┗ 📂View
 ┃ ┃ ┃ ┃ ┣ 📂board
 ┃ ┃ ┃ ┃ ┃ ┣ 📜isDelete.jsp
 ┃ ┃ ┃ ┃ ┃ ┣ 📜isUpdate.jsp
 ┃ ┃ ┃ ┃ ┃ ┣ 📜list.jsp
 ┃ ┃ ┃ ┃ ┃ ┣ 📜read.jsp
 ┃ ┃ ┃ ┃ ┃ ┣ 📜list.jsp
 ┃ ┃ ┃ ┃ ┃ ┗ 📜update.jsp
 ┃ ┃ ┃ ┃ ┣ 📂introduce
 ┃ ┃ ┃ ┃ ┃ ┗ 📜list.jsp
 ┃ ┃ ┃ ┃ ┣ 📂notice
 ┃ ┃ ┃ ┃ ┃ ┣ 📜list.jsp
 ┃ ┃ ┃ ┃ ┃ ┗ 📜post.jsp
 ┃ ┃ ┃ ┃ ┣ 📜MemberJoinResult.jsp
 ┃ ┃ ┃ ┃ ┣ 📜SearchResult.jsp
 ┃ ┃ ┃ ┃ ┗ 📜usermain.jsp
 ┃ ┃ ┣ 📜board_tbl_query
 ┃ ┃ ┣ 📜Login.jsp
 ┃ ┃ ┣ 📜mem_Tbl_query
 ┃ ┃ ┣ 📜MemberJoin.jsp
 ┃ ┃ ┣ 📜reply_tbl_query
 ┃ ┃ ┣ 📜update
 ┃ ┃ ┗ 📜updatereq
 ```
  
 </details>
 
 
**2. DB 설계**

![shopdb-diagram](https://user-images.githubusercontent.com/94505665/155258039-b2f7b754-3c4b-4f3c-8d67-2c94f586d073.png)
<br>
![member_tbl](https://user-images.githubusercontent.com/94505665/155098027-ac27acc7-735e-449e-a189-0c548600619f.png)
<br>
![board_tbl](https://user-images.githubusercontent.com/94505665/155098120-ceda41e5-07e4-489d-89da-1770086ef683.png)
<br>
![reply_tbl](https://user-images.githubusercontent.com/94505665/155258170-ae1289d7-ce19-49f6-9929-c52133c8e87a.png)
<br>


**3. API 설계**




## Review
