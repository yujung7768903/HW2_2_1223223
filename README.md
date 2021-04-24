# HW2_2_1223223
> 안드로이드 스튜디오(자바 활용) 공부 - 스마트 모바일 프로그래밍 과제 2            
> 참고 : https://copycoding.tistory.com/114 (RotateAnimation 부분)
### 앱 실행화면
<img width="300" alt="스크린샷 2021-04-18 오전 12 26 03" src="https://user-images.githubusercontent.com/68562176/115118103-aa142300-9fdc-11eb-859f-8cc7b1d5a06a.png">       <img width="300" alt="스크린샷 2021-04-18 오전 12 33 15" src="https://user-images.githubusercontent.com/68562176/115118338-ab921b00-9fdd-11eb-970b-732b5e2bd799.png">
### 과제 내용
1. 버튼 안에 이미지 넣기
2. "회전하기"버튼 클릭시 오른쪽으로 10도 회전
### 추가한 기능
1. "초기화"버튼 클릭시 복귀
### 새롭게 알게 된 내용
1. 버튼 안에 이미지 넣기(drawableLeft, drawableRight)
2. RotateAnimation 클래스 이용 방법
3. Animation 클래스의 메소드(SetDuration, setFillAfter)

----------
#### RotateAnimation 함수 사용
1. 객체 생성
RotateAnimation 함수는 아래와 같이 정의되어 있다.
```
public RotateAnimation(float fromDegrees, float toDegrees, int pivotXType, float pivotXValue, int pivotYType, float pivotYValue)
```
|인자|설명|속성값|
|------|---|---|
|fromDegrees|시작하는 각도|각도(단위 뺌,90°-> 90)|
|toDegrees|회전 후 각도|각도(단위 뺌,90°-> 90)|
|pivotXType|x축 설정|Animation.ABSOLUTE / Animation.RELATIVE_TO_SELF / Animation.RELATIVE_TO_PARENT(중 1개 선택)
|pivotXValue|x축 위치|가장 왼쪽이 0, 가장 오른쪽이 1, 가운데가 0.5
|pibotYType|y축 설정|Animation.ABSOLUTE / Animation.RELATIVE_TO_SELF / Animation.RELATIVE_TO_PARENT(중 1개 선택)
|pivotYValue|y축 위치|가장 위쪽이 0, 가장 아래쪽이 1, 가운데가 0.5
2. 지속시간 설정
애니메이션을 얼마나 지속시킬지 결정할 수 있다.      
속성값 : 단위 빼고 정수값. ms가 단위이기 때문에 1초에 걸쳐 애니메이션이 일어나게 하고 싶으면 1000이라고 써야한다.     
해당 예제에서는 회전 애니메이션 객체를 생성하였고, 속성값으로 200을 주었기 때문에 회전이 0.2초 동안 일어난다.
```
ra.setDuration();
```
3. 애니메이션 후
setFillAfter은 기본적으로 false로 설정이 되어 있어서, true로 바꿔주어야 원래 상태로 돌아가지 않는다.         
만약 false로 그대로 둔다면 오른쪽으로 10도 회전하고 그대로 멈추는 것이 아니라 원래 상태(회전하기 전 상태)로 돌아간다.
```
ra.setFillAfter(true);
```
