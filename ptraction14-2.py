#파이썬은 분석 및 예측 등의 계산을 위한 언어
# 본 예제가 중요!!!

# csv 파일을 읽어오려면 import 해야한다
import csv
with open('cctv','csv','r') as csvFile:
    # csv 모듈안에 reader 메서드를 이용하여 읽어오겠다
    buffer = csv.reader(csvFile,delimiter=',',quotechar='"')
    totalcctv = 0
    #buffer 안에있는 목록들에 대하여 인덱스와 값을 가져온다
    for i, line in enumerate(buffer):
        if i != 0:
            totalcctv = totalcctv + line[4]

    print('서울특별시 마포구에 설치된 cctv는 총 {}대입니다.'.format(totalcctv))