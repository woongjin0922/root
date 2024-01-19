#클래스 선언
class Person:
    #클래스는 값과 속성으로 이루어진다.
    #값은 변수이고, 속성은 함수이다.
    #변수와 함수를 이용해 설계도를 만든거 => 클래스

    #self : 나 자신이라는 뜼으로 클래스에서는 의무적으로 써서 다른 값과 구별을 하는 목적
    def who_am_i(self,name,age,tel,address):
        self.name = name
        self.age = age
        self.tel = tel
        self.address = address


#boy 라는 객체를 생성 => boy라는 객체를 만들기 위해 틀만 만들어 놓은 거다.
#객체 = 클래스()
#boy라는 객체를 만들기위해 Person()이라는 틀을 이용한다.
boy = Person()
boy.who_am_i('john',15,'123-1234','toronto')
print(boy.name)
print(boy.age)