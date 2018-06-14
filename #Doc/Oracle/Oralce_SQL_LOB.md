# LOB(BLOB, CLOB, NCLOB) 이란 ?
## 1. LOB
* LOB은 TEXT, 그래픽, 이미지, 비디오, 사운드 등 구조화되지 않는 대형 데이터를 저장하는데 사용한다.
* 일반적으로 테이블에 저장되는 구조화된 데이터들은 크기가 작지만, 멀티미디어 데이터는 크다.
* LONG, LONG RAW 데이터 유형은 예전에 사용 했지만, 현재는 대부분 LOB 데이터 유형을 사용한다.
* TO_LOB 함수를 이용하여 LONG, LONG RAW를 LOB를 변경할 수 있다.

### 1.2. LOB 종류
* CLOB: 문자 대형 객체(Character), Oracle Server는 CLOB과 VARCHAR2 사이에 암시적 변환을 수행
* BLOB: 이진 대형 객체(Binary), 이미지, 동영상, MP3등
* NCLOB: 내셔널 문자 대형 객체 (National). 오라클에서 정의되는 National Character Set을 따르는 문자.
* BFILE: OS에 저장되는 이진 파일의 이름과 위치를 저장. 읽기 전용 모드로만 액세스 가능.

### 1.3. 데이터베이스 내부, 외부에 따라
* 내부 : BLOB, CLOB, NCLOB - Table에 LOB 형식의 컬럼을 생성하고 이곳에 데이터의 실제위치를 가리키는 Locator(위치자) 저장.
* 외부 : BFILE

### 1.4. 특징
* 하나의 테이블에 여러 개의 LOB 열(column) 가능
* 최고 4GB까지 저장
* SELECT로 위치자 반환
* 순서대로 또는 순서없이 데이터 저장
* 임의적 데이터 액세스

### 1.5. LOB 구성
* LOB 값 : 저장될 실제 객체를 구성하는 데이터
* LOB 위치자 : 데이터베이스에 저장된 LOB값의 위치에 대한 포인터
* LOB열에는 데이터가 없고 LOB 위치자만 들어있다.	

## 2. 내부 LOB
* LOB값은 데이터베이스에 저장된다.
* 사용자 정의 유형 속성, 테이블의 열, 바인드 변수, 호스트 변수, PL/SQL변수, 파라미터 또는 결과
* 동시성 방식, 리두 로그 및 복구 방식, 커밋또는 롤백 트랜잭션 사용 가능
* BLOB 데이터 유형은 Oracle Server 내에서 비트 스트림으로 해석된다.
* CLOB 데이터 유형은 단일 바이트 문자 스트림으로 해석된다.
* NCLOB 데이터 유형은 데이터베이스 national character set 의 바이트 길이에 따라 멀티바이트 문자 스트림으로 해석된다.

## 3. 내부 LOB 관리
* LOB 데이터 유형을 포함하는 테이블을 생성한 후 이를 채운다.
* 프로그램에서 LOB 위치자를 선언하고 초기화한다.
* SELECT FOR UPDATE를 사용하여 LOB이 포함된 행을 잠그고 해당 행 값을 LOB 위치자에 넣는다.
* LOB 위치자를 LOB값에 대한 참조로 사용하여 DBMS_LOB 패키지 프로시저, OCI호출, OLE용 오라클 객체, 오라클 선행 컴파일러 또는 JDBC를 통해 LOB을 조작한다.
* SQL을 통해서도 LOB 관리 가능(일부)
* COMMIT을 통해 변경사항 적용.

## 4. SQL 생성
~~~sql
CREATE TABLE CAR (
    id NUMBER(6) PRIMARY KEY NOT NULL,
    name VARCHAR2(20),
    price NUMBER(10),
    review CLOB
);
~~~

* 테이블 생성시 CLOB 타입 컬럼을 선언하고, 데이터 입력
* 따로 SIZE는 지정 하지 않는다.
* EMPTY_CLOB() 함수는 위치자(Locator)를 아무것도 없는 데이터로 초기화 시킨다.

## 5. 컴퓨터 개발 언어팁

### 5.1. Mybatis, Oracle CLOB 처리 ResultMap
CLOB 타입을 String 타입으로 지정하는 방법
~~~xml
<resultMap id="contents" type="hashmap">
    <result property="CONT" column="CONT" jdbcType="CLOB" javaType="java.lang.String">
</resultMap>
~~~

## 출처
1. http://stepping.tistory.com/30
1. http://www.gurubee.net/lecture/1870