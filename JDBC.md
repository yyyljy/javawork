## JDBC

- java로 DBMS와 연동하는 기술
  - SQL문을 자바로 만든 시스템을 통해 실행할 수 있도록 만들어진 자바의 기술

### JDBC처리 순서

1. jdbc드라이버를 제조사 홈페이지에서 다운로드 받는다.

   -> C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\ojdbc6.jar
   
2. JVM이 인식할 수 있는 위치에 연결

   1)` 이클립스`를 사용하는 경우(Application)

   ​	가. 작업중인 프로젝트 선택

   ​	나. 프로젝트에서 - [build path] - [Configure Build path]

   ​	다. [Libraries]탭 선택

   ​	라.[Add External jar] 선택, ` ojdbc6.jar`파일을 등록

### JDBC API사용하기

1. 오라클 드라이버 로딩

   ``` java
   Class.forname("oracle.jdbc.driver.OracleDriver");
   //[mysql] - "com.mysql.jdbc.Driver"
   ```

2. DBMS 연결 - DriverManager클래스의 getConnection메소드를 통해 작업

   - static 메소드이므로 클래스 이름으로 엑세스

   - throws SQLException하고 있고 SQLException은 RuntimeException의 하위가

     아니므로 try ~ catch를 이용해서 exception에 대한 처리를 해야 한다.

   ```java
   String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
   //127.0.0.1 - 로컬에 연결할 때
   //[mysql] - jdbc:mysql://ip:port/DB명  (port - 3306)
   String user = "scott";
   String password = "tiger";
   Connection con = DriverManager.getConnection(url, user, password);
   //연결 정보를 java.sql.Connection타입으로 리턴
   ```

   - 내부에서 접속된 DBMS회사에서 제공하는 라이브러리 속 Connection이 리턴되도록

     다형성이 적용되어 있다.

3. SQL을 실행하는 기능을 갖고 있는 Statement객체 생성

   - Statement

     - 정적 SQL을 실행
     - 보안에 취약 - SQLInjection에 취약
     - 쿼리를 읽고 분석 -> 컴파일 -> 실행 을 매번 반복해서 실행하고 작업

   - PreparedStatement (재사용 불가)

     - 동적 SQL을 실행

     - 시큐어코딩에 적합

     - 처음 실행할 때 캐시에 저장한 뒤 그 후로는 캐시를 읽어서 작업

     - sql문을 작성할 때 외부에서 입력받는 부분을 ? 로 정의한다.

     - PreparedStatement객체에 정의되어있는 setXXXX메소드를 이용

     - setXXXX(index, 값) - index는 ?의 순서

       char, varchar2		->	setString(1,"asdaw")

       number, integer	->	setInt(1,0000)

       소수점 number	  ->	setDouble(1,0.0)

       date						 ->	setDate(1, java.sql.Date객체)

   - CallableStatement

     - 각 DBMS에 특화된 SQL을 실행
     - ex) 오라클 - PL-SQL

   ```java
   //Statement 객체를 이용
   Statement stmt = con.createStatement();
   //PreparedStatement 객체를 이용
   PreparedStatement ptmt = con.prepareStatement(sql);
   ```

4. SQL 실행 (insert,delete,update)

   ```java
   //몇 개의 row가 변경됐는지 return
   //statement
   int result = stmt.executeUpdate(sql);
   //preparedstatement
   int result = ptmt.executeUpdate();
   ```

   SQL 실행(select)

   - executeQuery메소드 사용

   ```java
   //ResultSet 객체로 결과를 반환
   //statement
   ResultSet rs = stmt.executeQuery(sql);
   //preparedstatement
   ResultSet rs = ptmt.executeQuery();
   ```

   - ResultSet안에서 모든 레코드를 읽어서 처리할 수 있도록 반복문을 이용해서 처리

   - 한 번에 하나의 컬럼만 읽을 수 있다.

     - ResultSet내부에서 제공되는 getXXXX메소드 이용

       ```java
       re.getString()
       //테이블 순서가 아니라 조회되는 컬럼의 순서대로 
       //varchar2 or char - getString()
       //number or integer - getInt()
       //소수점 있는 number - getDouble()
       //date - getDate()
       ```

       

     ```java
     while(rs.next()){
         System.out.println(rs.getString(1));
         System.out.println(rs.getString("ename"));
     }
     ```

   - 

5. 결과 처리

   - insert, delete, update - int로 결과를 return

     ```java
     System.out.println(result+"개 행이 xx되었습니다.");
     ```

6. 자원반납

   - ResultSet, Statement, Connection 모두 반납해야 한다.
   - close메소드를 이용해서 자원해제
   - 가장 마지막에 만들어진 객체부터 해제

```java
String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
String user = "scott";
String password = "tiger";
String sql = "insert into tb_board values(board_seq.nextval,'jang','연습','연습',sysdate,0)";
Class.forname("oracle.jdbc.driver.OracleDriver");
Connection con = DriverManager.getConnection(url, user, password);
Statement stmt = con.createStatement();
int result = stmt.executeUpdate(sql);
```



