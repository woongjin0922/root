#person 이라는 클래스르 만든다
# 이유는 주소록에 넣은 데이터의 기준이 사람이 이기 때문에
#한사람 한사람을 객체를 만들기 위해 person이라는 클래스를 만든것이다
class person
    #person 객체는 이름 ,연락처,주소를 가지고 생성되게 하기 위하여 생성자 메소드를 미용하였다
    def__init__(self, name, phone, addr)
    self.name = name
    self.phone = phone
    self.addr = addr

    #person 객체가 태어나서 해당 정보를 확인하기 위해 정의
    def info(self):
        print(f'{self.name},{self.phonr},{self.addr}')

class AddressBook:
    def__init__(self):
    self.address_list = []
    self.file_reader()

    #csv 파일을 읽어오라고 호출을 하면 실제로 읽어올수 있도록 코드 작성
    def file+reader(self):
    #수업중 배운 csv파일 읽어오기 복붙
    #다만,csv 파일이 존재하지 않을수도 있다
    #존재하지 않으면 예외가 발생하므로 미리 대비해 놓기 위해 try ~except를 사용하자
    try:
        #AddressBook.csv를 읽어오기를 담당하는 전문 객체 => file
        DILE = OPEN('addressbook.csv','rt')
    except: #예외처리
        print('addressbook.csv 파일이 없습니다')
    else : #addressbook.csv 파일이 있다면
        while true: #다 읽어들일떄까지 무한반복
        #csv파일을 한줄씩 읽어들요 buffer안에 넣는다
    buffer = dile.readline()

    if not buffer: # buffer 변수에 아무값도 없다면 ~(다 읽어왔다는 뜻)
        break

# AddressBook() 이라는 클래스를 통해 my_app라는 객체를 만들겠다
#my_app : 주소록 이라는 객체
# AddressBook() : 클래스 (설계도)
my_app = AddressBook()