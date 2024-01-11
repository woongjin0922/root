"""




from datetime import*
start = datetime.now()
total = 0
for num in range(1,10000001):
    total += num
end = datetime.now()

elapse = end - start
elapse = elapse.total_seconds()

print('총 합은 {} 입니다.'.format(total))
print('총 {}초가 소요되었습니다.'.format(elapse))

응용예제

import random
import time

pot = [n for n in range(1,46)] # 1~45 숫자를 숮차적으로 뽑아서 pot 리스트에 추가
jackpot = []

for n in range (1,7): #6번 반복 작업
    # 6개의 숫자를 추출하기 전에 미리 선행해야 할 직업 => 숫자 섞기(chuffle())
    random.shuffle(pot) #pot 리스트의 내용을 섞는다
    # 추출 : pop() -> 기본적으로 맨 마지막 값을 꺼내오고 그 값은 추후 사라진다
    pick = pot.pop()
    print(f'{n}번쨰 당첨번호는 {pick}입니다.')
    jackpot.append(pick)
    time.sleep(2)

#당첨번호를 정렬하여 리스트 출력
jackpot.sort()
print(f'이번 당첨번호는 {jackpot}입니다.')
"""
import math
# random.randint(시작값, 종료값)
import random
import time

a=random.randint(1,100)
n = int(input('어떤 값일까요?>>>'))
if n < a:
    print('up')
elif a == n:
    print('총 {}초가 소요되었습니다.'.format())
else:
    print('down')

#컴퓨터의 생각(random)과 나의 생각(input())이 같은지 유무 판별 관건

answer = random.randint(1,100)

print('updown 게임을 시작합니다.')
start = time.time()
print(start)
while True: #반복횟수를 가늠할수 없는 경우에 while 쓴다
    n = int(input('어떤 값일까요?>>>'))

    if answer == n:
        print('정답입니다')
        break
    elif answer < n:
        print('down')
    else : # answer > n 생략
        print('up')

end = time.time()

elapse = end - start

print(f'{math.floor(elapse)}초 만에 성공했습니다.')


