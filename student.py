#클래스는 설계도 역할이다
#객체란 : 현실세계에 있는 모든 것을 프로그래밍화 시킨 것
#클래스(설계도)가 있어야 객체를 만들수 있다
def student_info(name, departmant, profrssor, phone, address, grade):
    print(name)
    print(departmant)
    print(profrssor)
    print(phone)
    print(address)
    print(grade)

name1 = 'emily'
department1 = 'computer engineering'
professor1 = 'james'
phone1 = '010-1234-5678'
address1 = 'seoul'
grade1 = 'A'

name2 = 'jhon'
department2 = 'computer engineering'
professor2 = 'james'
phone2 = '010-1234-5678'
address2 = 'seoul'
grade2 = 'A'

student1 = student('emily', 'computer', 'james', '010-1234-5678', 'seoul', 'A')
