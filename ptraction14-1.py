while True:
    filename = input('복사할 파일명을 입력하세요 >>> ')
    extname = filename[filename.rfind('.')+1:]
    if extname != 'txt':
        print('복사할 수 없는 파일입니다.')
    else: #확장자가 txt이면~~~~
        break
with open(filename,'rt') as source:
    #복사를 위해 복사파일의 물길을 또 만들어 줘야 한다
    with open('복사본-'+filename,'wt') as copy:
        while True:
            #원본에서 하나씩 읽어와서 buffer 객체에 넣는다
            buffer = source.read(1)
            if not buffer: #버퍼가 비어있다면.. 더이상 가져올 원본이 없다면..
                break
            copy.write(buffer)
print('복사본-'+filename+'파일이 생성되었습니다.')