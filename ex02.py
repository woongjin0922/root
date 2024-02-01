#차트를 만들기 위해 matplotlib 라이브러리에 pyplot 모듈을 가져온다
# pyplot을 plt라고 별칭을 붙이겠다
import matplotlib.pyplot as plt

# figure 객체를 생성
figure = plt.figure()

axes = figure.add_subplot(1,1,1)
x1 = [0,1,2,3,4]
y1 = [4,1,3,5,2]
x2 = [0,1,2,3,4]
y2 = [0,8,5,3,1]

axes.plot(x1,y1)
axes.plot(x2,y2)

plt.show()