# json 파일 읽어오기
import json

#dictList.json 파일을 file 객체로 읽어오면서 close()는 생략하겠다
with open ('dictList.json','r') as file:

    #file 객체가 dictList.json 파일을 통쨰로 읽어와서 josn_reader 변수에 넣는다
    json_reader = file.read()

    #json 객체는 loads() 매서드를 이용하여 변수에 저장된 내용을 로딩해서 dict_list에 넣는다
    #메서드의 리턴타입은 대부분 리스트 형식
    dict_list = json.loads(json_reader)

for dic in dict_list:
    print('이름 : {}'.format(dic['name']))
    print('나이 : {}'.format(dic['age']))
    print('키 : {}'.format(dic['spec'][0]))
    print('몸무게 : {}'.format(dic['spec'][1]))
    print()