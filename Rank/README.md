# Rank

<접근>
------------------------------------------
학생의 정보를 받을 클래스를 생성하여 문제에 나와 있는 정렬 기준에 따라 정렬하여 출력하면 되는 간단한 문제라고 생각한다.
(단, Vector 를 사용)

<풀이>
------------------------------------------
먼저 Student 클래스를 정의한다

변수로 name과 socre(보고서 점수)를 선언하고 생성자로 초기화 함

그리고 Collections.sort()를 이용하여 score를 미리 오름차순으로 정렬함(2, 3번 조건을 위해 미리 정렬한다.)

![1](https://user-images.githubusercontent.com/40015001/199029055-38e6bca8-19fc-4866-8f63-6854ce29e92b.PNG)

정렬 로직

Collection.sort에서 compare()함수를 override하여 문제의 정렬 기준에 따라 로직을 만듬

![3](https://user-images.githubusercontent.com/40015001/199029063-967be84a-5947-484c-8d1e-1e067704ee66.PNG)

main함수

Init() 함수는 Input으로 학생들의 보고서 정보를 받아 Student객체들을 초기화 시켜주는 함수

print() 함수는 Student 객체들의 name을 출력해주는 함수

![5](https://user-images.githubusercontent.com/40015001/199029069-8c1c175a-edac-48e3-b901-142a24e49017.PNG)
