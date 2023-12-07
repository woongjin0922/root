Python 3.12.0 (tags/v3.12.0:0fb18b0, Oct  2 2023, 13:03:39) [MSC v.1935 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
3+5
8
2589+8956
11545

==== RESTART: C:/Users/User/AppData/Local/Programs/Python/Python312/day01.py ===

==== RESTART: C:/Users/User/AppData/Local/Programs/Python/Python312/day01.py ===
a=123
a=-178
a=1.2
1=-3.12
SyntaxError: cannot assign to literal here. Maybe you meant '==' instead of '='?
b=-3.45
b
-3.45
a
1.2
a
1.2
b
-3.45
a=4.24E10
A
Traceback (most recent call last):
  File "<pyshell#12>", line 1, in <module>
    A
NameError: name 'A' is not defined. Did you mean: 'a'?

a
42400000000.0
42400000000.0
42400000000.0
a=0o177
a
127
127
127

a=0x8ff
a
2303
b=0xABC
b
2748
a=3
b=4
a+4
7
7%3
1
7/4
1.75
3+123
126
"""안녕하세요 """
'안녕하세요 '
'안녕하세요'
'안녕하세요'
"""
안녕하세요
SBS
입니다
"""
'\n안녕하세요\nSBS\n입니다\n'
food = "python favirite food is perl"
food
'python favirite food is perl'
food
'python favirite food is perl'
'python favirite food is perl'
'python favirite food is perl'
say = '"phthon is very easy."he says'
say = "\"Python is very easy."\"he says"
SyntaxError: unexpected character after line continuation character
"""
가나다
ABC
"""
'\n가나다\nABC\n'
multiline = "Life is too short\n You need python"
multiline
'Life is too short\n You need python'
'Life is too short\n You need python'
'Life is too short\n You need python'
head = "python"
tail = "is fun"
head + tail
'pythonis fun'
a="python"
a*2
'pythonpython'
a*4
'pythonpythonpythonpython'
a*10
'pythonpythonpythonpythonpythonpythonpythonpythonpythonpython'
a="승원 시발"
ㅁ
Traceback (most recent call last):
  File "<pyshell#60>", line 1, in <module>
    ㅁ
NameError: name 'ᄆ' is not defined
a
'승원 시발'
a*10]
SyntaxError: unmatched ']'
a*10
'승원 시발승원 시발승원 시발승원 시발승원 시발승원 시발승원 시발승원 시발승원 시발승원 시발'
a
'승원 시발'
a="python"

a
'python'
a*8
'pythonpythonpythonpythonpythonpythonpythonpython'
a&90
Traceback (most recent call last):
  File "<pyshell#68>", line 1, in <module>
    a&90
TypeError: unsupported operand type(s) for &: 'str' and 'int'
a*20
'pythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpython'
a*90
'pythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpythonpython'
a=a = "Life is too short, You need Python"
a+=a = "Life is too short, You need Python"
SyntaxError: invalid syntax
a=Life is too short, You need Python"SyntaxError: invalid syntax
SyntaxError: unterminated string literal (detected at line 1)
a="Life is too short, You need Python"
a
'Life is too short, You need Python'
a[3]
'e'
a[1
  d
  
SyntaxError: incomplete input
a[1]
  
'i'
a[-1]
  
'n'
a[-6]
  
'P'
a[9]
  
'o'
a[0]+a[1]+a[2]+a[3]
  
'Life'
a[0:4]
  
'Life'
a[0:3]
  
'Lif'
a:
  
SyntaxError: incomplete input
a[:]
  
'Life is too short, You need Python'
a[19]
  
'Y'
a[19:]
  
'You need Python'
a= "202312071Rany"
  
a
  
'202312071Rany'
date = a[0:7]
  

date
  
'2023120'
date[0:8]
  
'2023120'
date = [:8]
  
SyntaxError: invalid syntax
date = a[:8]
  

date
  
'20231207'
wweather = a[8:]
  
weather
  
Traceback (most recent call last):
  File "<pyshell#103>", line 1, in <module>
    weather
NameError: name 'weather' is not defined. Did you mean: 'wweather'?
weather = a[8:]
  
eather
  
Traceback (most recent call last):
  File "<pyshell#105>", line 1, in <module>
    eather
NameError: name 'eather' is not defined. Did you mean: 'weather'?
weather
  
'1Rany'
date
  
'20231207'
weather
  
'1Rany'


date
  
'20231207'
year
  
Traceback (most recent call last):
  File "<pyshell#112>", line 1, in <module>
    year
NameError: name 'year' is not defined
weather = 20
weather
20
"현재 온도는 %s 도 입니다."%weather
'현재 온도는 20 도 입니다.'
weather = -5
  
SyntaxError: multiple statements found while compiling a single statement
weather = 20
weather
20
"현재 온도는 %s 도 입니다."%weather
'현재 온도는 20 도 입니다.'
weather = -5
  
SyntaxError: multiple statements found while compiling a single statement
year = date[:3]
year
'202'
year = date[:4]
yaer
Traceback (most recent call last):
  File "<pyshell#89>", line 1, in <module>
    yaer
NameError: name 'yaer' is not defined
year = date[:4]
year
'2023'
pin = "881120 - 1068234"
pin
'881120 - 1068234'
yyyymmdd = pin[7:]
yyyymmdd
'- 1068234'
yyyymmdd = pin[8:]
yyyymmdd
' 1068234'
num = "yyyymmdd"
num
'yyyymmdd'
yyyymmdd = pin[:5]
yyyymmdd
'88112'
yyyymmdd = pin[:6]
yyyymmdd
'881120'
num = [8:]
SyntaxError: invalid syntax
num = pin[8:]
num
' 1068234'
weather = 20
weather
20
"현재 온도는 %s 도 입니다."%weather
'현재 온도는 20 도 입니다.'
weather = -5
"현재 온도는 %s 도 입니다."%weather
'현재 온도는 -5 도 입니다.'
  
SyntaxError: multiple statements found while compiling a single statement
"i eat %d apples"%3
  
'i eat 3 apples'
"l eat %d apples"%5
  
'l eat 5 apples'
" i eat %d apples" %10
  
' i eat 10 apples'
"i eat %d apples" %five
  
Traceback (most recent call last):
  File "<pyshell#119>", line 1, in <module>
    "i eat %d apples" %five
NameError: name 'five' is not defined
"i eat %d apples"&"five"
  
Traceback (most recent call last):
  File "<pyshell#120>", line 1, in <module>
    "i eat %d apples"&"five"
TypeError: unsupported operand type(s) for &: 'str' and 'str'
"i eat %d apples"%num
  
Traceback (most recent call last):
  File "<pyshell#121>", line 1, in <module>
    "i eat %d apples"%num
NameError: name 'num' is not defined. Did you mean: 'sum'?
"i eat %s apples"&"five"
  
Traceback (most recent call last):
  File "<pyshell#122>", line 1, in <module>
    "i eat %s apples"&"five"
TypeError: unsupported operand type(s) for &: 'str' and 'str'
"i eat %s apples"%"five"
  
'i eat five apples'
"i eat %d apples"%num
  
Traceback (most recent call last):
  File "<pyshell#124>", line 1, in <module>
    "i eat %d apples"%num
NameError: name 'num' is not defined. Did you mean: 'sum'?
" i eat%d apples. so i was sick %s days."%(number,day)
  
Traceback (most recent call last):
  File "<pyshell#125>", line 1, in <module>
    " i eat%d apples. so i was sick %s days."%(number,day)
NameError: name 'number' is not defined
KeyboardInterrupt
" i eat%d apples. so i was sick %s days."%(number.day)
  
Traceback (most recent call last):
  File "<pyshell#126>", line 1, in <module>
    " i eat%d apples. so i was sick %s days."%(number.day)
NameError: name 'number' is not defined
" i eat%d apples. so i was sick %s days."%(number,day)" i eat%d apples. so i was sick %s days."%(number.day)"I eat %d apples. so I was sick for %s days."%(number,day)
  
SyntaxError: invalid syntax

"I eat %d apples. so I was sick for %s days."%(number,day)
  
Traceback (most recent call last):
  File "<pyshell#129>", line 1, in <module>
    "I eat %d apples. so I was sick for %s days."%(number,day)
NameError: name 'number' is not defined
"i eat %d apples" %5
  
'i eat 5 apples'
"i eat{0} apples" .format(3)
  
'i eat3 apples'
number = 3
  
"
  
SyntaxError: incomplete input
number = 3
  
"i eat {0} apples".format(number)
  
'i eat 3 apples'
number
  
3
day = :three"
  
SyntaxError: unterminated string literal (detected at line 1)
day = "three"
  
"I eat{0} apples.so I was sick for{1} days.".format(number,day)
  
'I eat3 apples.so I was sick forthree days.'
'I eat3 apples.so I was sick forthree days.'
  
'I eat3 apples.so I was sick forthree days.'
"i eaty {0} apples. so i was sick for {1} days."
  
'i eaty {0} apples. so i was sick for {1} days.'
"i eaty {0} apples. so i was sick for {1} days."format(number=10.day=
                                                       
SyntaxError: invalid decimal literal
"i eaty {0} apples. so i was sick for {1} days."format(number=10,day=
                                                       
SyntaxError: '(' was never closed
"I ate {number} apples. so I was sick for {day} days.".format(number=10,day=3)
                                                       
'I ate 10 apples. so I was sick for 3 days.'

"i ate {0} apples. so i was sick for {day} days.".farmat(10,day=20)
                                                       
Traceback (most recent call last):
  File "<pyshell#147>", line 1, in <module>
    "i ate {0} apples. so i was sick for {day} days.".farmat(10,day=20)
AttributeError: 'str' object has no attribute 'farmat'. Did you mean: 'format'?
"I ate {0} apples. so I was sick for {day} days.".format(10,day=20)
                                                       
'I ate 10 apples. so I was sick for 20 days.'
name="홍길동"
                                                       
age= 30
                                                       
f'나의 이름은 {name}입니다 나이는 {age}입니다
                                                       
SyntaxError: unterminated f-string literal (detected at line 1)
f'나의 이름은 {name}입니다 나이는 {age}입니다'
                                                       
'나의 이름은 홍길동입니다 나이는 30입니다'
d={'name' : '홍길동','age':30}
                                                       
d={'name' : '홍길동','age':30}
                                                       
f'나의 이름은{d["name"]}입니다.나이는{d}'
                                                       
"나의 이름은홍길동입니다.나이는{'name': '홍길동', 'age': 30}"
"나의 이름은홍길동입니다.나이는{'name': '홍길동', 'age': 30}"
                                                       
"나의 이름은홍길동입니다.나이는{'name': '홍길동', 'age': 30}"
a="hobby"
                                                       
a
                                                       
'hobby'
a.count('b')
                                                       
2
len(a)
                                                       
5
a="Python is the best choice"
                                                       
a
                                                       
'Python is the best choice'
a.find ('b')
                                                       
14
a[14]
                                                       
'b'

"."join('abcd')
                                                       
SyntaxError: invalid syntax
".".join('abcd')
                                                       
'a.b.c.d'
a="hi"
                                                       
a
                                                       
'hi'
a.upper()
                                                       
'HI'
b="hi"
                                                       
b.lower()
                                                       
'hi'
a="Life is too short"
                                                       
a
                                                       
'Life is too short'
a.replace( "Life."Your leg")
           
SyntaxError: unterminated string literal (detected at line 1)
a.replace( "Life","Your leg")
           
'Your leg is too short'
a.split()
           
['Life', 'is', 'too', 'short']
a[0]
           
'L'
b = "a:b:c:d"
           
b
           
'a:b:c:d'
b.split(':')
           
['a', 'b', 'c', 'd']
a=[1,2,3]
           
a
           
[1, 2, 3]
a[0]
           
1
a[1]
           
2
a[2]
           
3
a[3]
...            
Traceback (most recent call last):
  File "<pyshell#187>", line 1, in <module>
    a[3]
IndexError: list index out of range
>>> a[0]+a[2]
...            
4
>>> a[-1]
...            
3
>>> a= [1,2,3,['a',']
...            
SyntaxError: incomplete input
>>> 
>>> a = [1,2,3,['a','b','c']]
...            
>>> 
>>> a
...            
[1, 2, 3, ['a', 'b', 'c']]
>>> a[3]
...            
['a', 'b', 'c']
>>> a[2]
...            
3
>>> a[-1]
...            
['a', 'b', 'c']
>>> a[-1][0]
...            
'a'
>>> a[3][1]
...            
'b'
>>> a[3][2]
...            
'c'
