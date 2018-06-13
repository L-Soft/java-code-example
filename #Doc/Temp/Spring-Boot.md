### multipart
* 파일 업로드 목적의 HTTP 요청시 헤더의 Content-Type은 `multipart/form-data` 되어있어야함.
* Spring Boot에서 Multipart 요청을 처리하려면 `multipartConfigElement, multipartResolver` 이름 케이션 컨텍스트에 존재 해야 한다. 애플리케이션 시작시 MultipartAutoConfiguration 이름의 빈이 애플리케이션 컨텍스트에 존재해야 한다. 애플리케이션 시작시 클래스가 이 작업을 자동으로 수행한다.
* `multipart.maxFileSize`는 업로드 가능한 최대 파일 크기, `multipart.maxRequestSize`는 업로그 가능한 총 요청 크기이다. 이 조건을 초과한 요청이 들어오면 `MultipartException`을 발생시킨다.


### Spring Boot 1.3.x and earlier
/src/main/resources/application.properties 에서 아래와 같이
* multipart.maxFileSize
* multipart.maxRequestSize

### Spring Boot 1.4.x and 1.5.x
/src/main/resources/application.properties 에서 아래와 같이
* spring.http.multipart.maxFileSize
* spring.http.multipart.maxRequestSize

### Spring Boot 2.x
/src/main/resources/application.properties 에서 아래와 같이
* spring.servlet.multipart.maxFileSize
* spring.servlet.multipart.maxRequestSize

/src/main/resources/application.yml 에서 아래와 같이
~~~yml
spring:
  servlet:
    multipart:
      max-file-size: 10MB
      max-request-size: 10MB
~~~

### 출처
1. https://stackoverflow.com/questions/28572700/i-am-trying-to-set-maxfilesize-but-it-is-not-honored