## SQL Developer 메모리 수정

1. 아래 경로에있는 `ide.conf` 파일을 에디터로 열기합니다.
~~~bash
sqldeveloper\ide\bin\ide.conf
~~~

2. 아래 값을 변경합니다.
~~~bash
AddVMOption  -Xms128M
AddVMOption  -Xmx800M
~~~

## SQL Developer 테이블 생성 및 내용 추출하기
1. 추출이 필요한 테이블을 선택하고, 오른쪽 마우스를 누르면, 팝업창에서 "익스포트"를 선택합니다.

2. `익스포트 마법사` 팝업창에서 `스키마 표시(S)`, `저장 영역(G)`를 선택하고 `다음` 버튼을 선택합니다.

## SQL문를 정리하는 단축키
~~~bash
Ctrl + F7
~~~

## SQL 들여쓰기 수정 (기본값: 2)
~~~bash
도구 > 환경 설정 > 데이터 베이스 > SQL 포멧터 > Oracle 형식 지정 > 편집 > 들여쓰기로 들어가서 변경
~~~

## SQL 날짜 형식 `시/분/초` 까지 나오도록 변경
~~~bash
도구 > 환경 설정 > 데이터 베이스 > NLS > 날짜 형식
~~~

## SQL Oralce Developer 한글 깨짐 현상
한글 주석이 깨짐는 문제때문에 찾아보니, 역시나 UTF-8 문제때문에 발생한 문제라서 해결책을 기록한다. UTF-8로 변경하면 한글깨짐을 안 볼 수 있다. 아래의 그림처럼 변경하면 된다.

~~~bash
도구 > 환경 설정 > 환경 > 인코딩:UTF-8로 변경 
~~~

![개발자 도구 오라클](https://raw.githubusercontent.com/L-Soft/java-code-example/master/%23Doc/Image/img_20180703_221532_01.png)

출처: http://yangyag.tistory.com/151?category=793732