# 💻 Address Book

### 📑 Address Book은 자바 스윙을 기초로 하였습니다.
### 📑 JAVA에서 DB에 접속할 수 있도록 도와주는 API인 JDBC를 이용하였습니다.
### 📑 DB와 자바를 연동하여 주소록을 관리할 수 있는 프로그램을 만드는 것을 목표하였습니다.

# 🔨 사용기술
![제목 없음](https://user-images.githubusercontent.com/92250627/139732263-2eab036f-2f89-4dc6-93cd-6e440033ab23.png)


<br>

## 📑 Description

### 다음 유튜브 링크를 참조하여 MVC 디자인 패턴을 적용해 만들려고 노력하였습니다.
( https://www.youtube.com/watch?v=ogaXW6KPc8I&t=4s )

### 프로젝트를 진행하면서 적용한 규칙은 다음 5가지 입니다.

  1. Model은 Controller와 View에 의존하지 않아야 한다. <br>
    (Model 내부에 Controller와 View에 관련된 코드가 있으면 안 된다.)
  2. View는 Model에만 의존해야 하고, Controller에 의존하면 안 된다.<br>
    (View 내부에 Model의 코드만 있을 수 있고, Controller의 코드가 있으면 안 된다.)
  3. View가 Model로부터 데이터를 받을 때는, 사용자마다 다르게 보여주어야 하는 데이터에 대해서만 받아야 한다. 
  4. Controller는 Model과 View에 의존해도 된다.<br>
    (Controller 내부에는 Model과 View의 코드가 있을 수 있다.)
  5. View가 Model로부터 데이터를 받을 때, 반드시 Controller에서 받아야 한다.


### 프로젝트에 MVC 패턴을 적용한 내용은 다음 블로그를 통해 내용을 정리하였습니다.<br>
블로그 링크 : https://determination.tistory.com/entry/%EC%9E%90%EB%B0%94-%EC%9E%90%EB%B0%94-%EC%B4%88%EC%A7%9C-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-MVC-%ED%8C%A8%ED%84%B4%EC%9C%BC%EB%A1%9C-%EC%88%98%EC%A0%95%ED%95%98%EA%B8%B0?category=1048514
