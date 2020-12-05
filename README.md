# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## Step3 - 자동차 경주
### 구현할 기능 목록
+ 자동차 수와 시도할 회수를 입력받는다
+ 0~9까지 Random 값을 생성한다
+ 전진이 가능한지 체크한다
    + random 값이 4이상이면 전진
    + random 값이 4미만이면 정지
+ 자동차의 상태를 출력한다

### 구현한 클래스 설명
+ Car : 자동차 클래스 
    + 이동한다
    + 운전한 거리를 가지고 있다
+ Driver : 각자 자동차 하나씩 가지고 있는 운전자 
    + 자동차를 운전한다
    + 자동차의 운전한 거리를 볼 수 있다
+ RandomGenerator : 0~9까지 Random 숫자를 뽑아준다
+ Checkor : 전진할지 스탑할지 체크해준다
+ ViewManager : 뷰 메시지 입력/출력 담당자
    + 자동차의 대수를 물어본다
    + 시도할 회수를 물어본다
    + 자동차의 움직임을 보여준다
+ View : 실행되는 뷰

## Step4 - 자동차 경주(우승자)
### 구현할 기능 목록
+ 각 자동차에 이름을 부여한다 
    + 단, 자동차 이름은 5자를 초과할 수 없다
    + 자동차 이름은 쉼표(,)를 기준으로 구분한다
+ 0~9까지 Random 값을 생성한다
+ 전진이 가능한지 체크한다
    + random 값이 4이상이면 전진
    + random 값이 4미만이면 정지
+ 자동차의 상태를 출력한다
    + 자동차 이름도 함께 출력한다
+ 게임을 완료한 후 누가 우승했는지 알려준다 
    + 우승자는 1명 이상일 수 있다

### 구현한 클래스 설명
+ Checkor (Interface) : 확장이 가능한 클래스로 Interface로 정의
    + AdvanceCheckor : 전진가능여부를 체크
    + ScoreCheckor : 우승자 점수를 체크
+ Car : 자동차 클래스
    + 이동한다
    + 운전한 거리를 가진다
    + 이름을 가진다
+ Driver : 자동차를 가진 운전자
    + 자동차를 운전한다
    + 자동차의 운전한 거리를 볼 수 있다
    + 자동차의 이름을 알 수 있다
+ RandomGenerator : 0~9까지 Random 숫자를 뽑아준다
+ ViewManager : 뷰 메시지 입력/출력 담당자
    + 자동차의 이름을 물어본다
    + 시도할 회수를 물어본다
    + 자동차의 움직임을 보여준다
    + 최종 우승자를 말해준다
+ View : 실행되는 뷰 

## Step5 - 자동차 경주(리팩토링)
### 리팩토링 요구사항
+ 패키지 분리
    + domain : 핵심 비지니스 로직을 가지는 객체
    + view : UI 관련한 객체 
+ MVC 패턴 기반으로 리팩토링 
    + view 패키지의 객체는 domain 패키지 객체에 의존할 수 있다
    + 반대로 domain 패키지의 객체는 view 패키지 객체에 의존하지 않는다
+ domain Unit Test 작성
+ 테스트 가능한 부분과 테스트하기 힘든 부분을 분리해 테스트 가능한 부분에 대해서만 단위 테스트를 진행한다
    + ex) Random 값 생성 처리 
   
## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)
