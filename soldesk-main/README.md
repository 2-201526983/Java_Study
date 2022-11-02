# 자바 프로젝트 

### 기능 및 사용 언어

- 기능 : 수업시간에 사용했던 회원가입 툴을 활용한 로그인 회원가입, 마우스 리스너를 이용한 마우스 클릭이벤트로 이미지 바꾸기, 메뉴바를 통한 화면이동, 랜덤함수로 맛집 랜덤 추천 등

- 사용언어 : Java, swing

     
#### 난관

- 설계 : 외부 프로젝트를 가져와서 어떤식으로 변경을 하고 어떤 기능을 넣어서 설계를 해야할지 많은 고민

- 코드이해 : 가져온 외부 프로젝트나 기능을 넣을때에 코드를 이해하지 못해 많은 오류 발생

- 구현불가 : 구현하고 싶은 기능이 많았지만 (DB에 이미지 삽입 후 랜덤함수로 불러 오고 불러온 주소를 api 문자서비스를 이용해 휴대폰에 전송 등등) 아직 배우지 않은 프로그램을 사용한다던가 구현하기가 난해해 기능등을 제외하고 나머지를 하드코딩으로 구현해야 했음. 

            
#### 사용방법

- DB소스코드
        
      create table member(
	  id number primary key,
      username varchar2(15),
      password varchar2(15),
      name varchar2(15),
      email varchar2(30),
      phone varchar2(15),
      createDate timestamp
      );
      create sequence member_seq
      start with 1
      increment BY 1
      maxvalue 10000;

      commit;
	  
- 	DB소스코드 실행후 random_restaurant/src/main/main.java 파일로 실행 로그인 하려면 먼저 회원가입 필요 -> 로그인시 id password 체크
           
#### 가져온 외부 프로젝트
- 맛집 랜덤추천 프로그램

https://github.com/m-veloper/soldesk/tree/main/random_restaurant

![20211229_183612](https://user-images.githubusercontent.com/58251630/147650019-0d9b5e0d-fd96-4a63-833f-b4736c8082c6.png)
![20211229_183635](https://user-images.githubusercontent.com/58251630/147650021-362f95a4-04ac-4aff-9dac-c135494026c4.png)








    
