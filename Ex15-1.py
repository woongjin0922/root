#computer라는 이름의 클래스(설계도)를 생성
class Computer:
    def set_spec(self, cpu, ram, vga, ssd):
        #나의 변수    넘겨받은 값 (구별을 하기 위해 self 라는 들어간거다)
        self.cpu = cpu
        self.ram = ram
        self.vga = vga
        self.ssd = ssd

    # 출력담당 함수
    def hardware_info(self):
        print('cpu = {}'.format(self.cpu))
        print('ram = {}'.format(self.ram))
        print('vga = {}'.format(self.vga))
        print('ssd = {}'.format(self.ssd))

    desktop = Computer()
    desktop.set+spce('i7','16GB','GTX1060','512GB')
    desktop.hardware_info()