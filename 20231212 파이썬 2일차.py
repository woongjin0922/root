Python 3.12.0 (tags/v3.12.0:0fb18b0, Oct  2 2023, 13:03:39) [MSC v.1935 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
a= [1,2,3,4,5]
a
[1, 2, 3, 4, 5]
c = a[2:]
c
[3, 4, 5]
a[:2]
[1, 2]
KeyboardInterrupt
a = [1,2,3,['a','b','c'],4,5]
a
[1, 2, 3, ['a', 'b', 'c'], 4, 5]
a[2:5]
[3, ['a', 'b', 'c'], 4]
a = [1,2,3,['a','b','c'],4,5]
a
[1, 2, 3, ['a', 'b', 'c'], 4, 5]
a[3][0]
'a'
a[3][3]
Traceback (most recent call last):
  File "<pyshell#11>", line 1, in <module>
    a[3][3]
IndexError: list index out of range
a[3][2]
'c'
a[3][:]
['a', 'b', 'c']
a[3][:2]
['a', 'b']
KeyboardInterrupt

a = [1,2,3]
a
[1, 2, 3]
b = [4,5,6]
b
[4, 5, 6]
a+b
[1, 2, 3, 4, 5, 6]
c=a+b
c
[1, 2, 3, 4, 5, 6]
a = [1,2,3]
a
[1, 2, 3]
KeyboardInterrupt

a*3
[1, 2, 3, 1, 2, 3, 1, 2, 3]
a*10
[1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3]
a = [승원]
Traceback (most recent call last):
  File "<pyshell#28>", line 1, in <module>
    a = [승원]
NameError: name '승원' is not defined
a = [1,2,3]
KeyboardInterrupt
a
[1, 2, 3]
a*100
[1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3]
a = [1,2,3]
a
[1, 2, 3]
a[2]
3
a[2]=4
a
[1, 2, 4]
a = [1,2,3]
a
[1, 2, 3]
dela[1]
Traceback (most recent call last):
  File "<pyshell#38>", line 1, in <module>
    dela[1]
NameError: name 'dela' is not defined
del a[1]
a
[1, 3]
del a[3]
Traceback (most recent call last):
  File "<pyshell#41>", line 1, in <module>
    del a[3]
IndexError: list assignment index out of range
del a[2]
Traceback (most recent call last):
  File "<pyshell#42>", line 1, in <module>
    del a[2]
IndexError: list assignment index out of range
a = [1,2,3]
a
[1, 2, 3]
del a[2]
a
[1, 2]
a = [1,2,3]
a
[1, 2, 3]
a = [1,2,3]
a
[1, 2, 3]
a.append(4)
a
[1, 2, 3, 4]
a = [1,4,3,2,10,8,9,7,5]

a
[1, 4, 3, 2, 10, 8, 9, 7, 5]
a.sort()
a
[1, 2, 3, 4, 5, 7, 8, 9, 10]
a = [1,4,3,2,10,8,9,7,5]
a
[1, 4, 3, 2, 10, 8, 9, 7, 5]
a.reverse
<built-in method reverse of list object at 0x000001CE0D390580>
a
[1, 4, 3, 2, 10, 8, 9, 7, 5]
a.reverse()
a
[5, 7, 9, 8, 10, 2, 3, 4, 1]
a = [1,4,3,2,10,8,9,7,5]
a
[1, 4, 3, 2, 10, 8, 9, 7, 5]
a.reverse()
a
[5, 7, 9, 8, 10, 2, 3, 4, 1]
a.reverse
<built-in method reverse of list object at 0x000001CE0D590680>
a.reverse()
a
[1, 4, 3, 2, 10, 8, 9, 7, 5]
a.reverse()
a
[5, 7, 9, 8, 10, 2, 3, 4, 1]
KeyboardInterrupt
a= [1,2,3]
a
[1, 2, 3]
a.index(3)
2
a=[5,1,2,7,6,4,8,10,9]
a.sort()
a
[1, 2, 4, 5, 6, 7, 8, 9, 10]
a.reverse()
a
[10, 9, 8, 7, 6, 5, 4, 2, 1]
a.index(7)
3
a = [1,2,3]
a
[1, 2, 3]
a.insert(0,4\)
         
SyntaxError: unexpected character after line continuation character
a.insert(0.4)
         
Traceback (most recent call last):
  File "<pyshell#84>", line 1, in <module>
    a.insert(0.4)
TypeError: insert expected 2 arguments, got 1
a.insert(0,4)
         
a
         
[4, 1, 2, 3]
a=[4,1,5,2,3]
         
a
         
[4, 1, 5, 2, 3]
a.sort
         
<built-in method sort of list object at 0x000001CE0D590680>
a.sort()
         
a
         
[1, 2, 3, 4, 5]
a=[4,1,2,3]
         
a.insert(2,5)
         
a
         
[4, 1, 5, 2, 3]
a.sort()
         
a
         
[1, 2, 3, 4, 5]
a =[1, 2, 3, 4, 5]
         
a
         
[1, 2, 3, 4, 5]
del a[3,5]
         
Traceback (most recent call last):
  File "<pyshell#99>", line 1, in <module>
    del a[3,5]
TypeError: list indices must be integers or slices, not tuple
del a[2,4]
         
Traceback (most recent call last):
  File "<pyshell#100>", line 1, in <module>
    del a[2,4]
TypeError: list indices must be integers or slices, not tuple
a =[1, 2, 3, 4, 5]
         
a
         
[1, 2, 3, 4, 5]
del a[2]
         
a
         
[1, 2, 4, 5]
del a[3]
         
a
         
[1, 2, 4]
a=[1,2,3,1,2,3]
         
a
         
[1, 2, 3, 1, 2, 3]
a.remove(3)
         
a
         
[1, 2, 1, 2, 3]
a= [1,2,3,1]
         
a
         
[1, 2, 3, 1]
a.count(1)
         
2
a = [1,2,3]
         
a

a
         
[1, 2, 3]
a.extends(4,5)
         
Traceback (most recent call last):
  File "<pyshell#117>", line 1, in <module>
    a.extends(4,5)
AttributeError: 'list' object has no attribute 'extends'. Did you mean: 'extend'?
a.extends([4,5])
         
Traceback (most recent call last):
  File "<pyshell#118>", line 1, in <module>
    a.extends([4,5])
AttributeError: 'list' object has no attribute 'extends'. Did you mean: 'extend'?
a.extends([4,5])
         
Traceback (most recent call last):
  File "<pyshell#119>", line 1, in <module>
    a.extends([4,5])
AttributeError: 'list' object has no attribute 'extends'. Did you mean: 'extend'?
a.extend([4,5])
         
a
         
[1, 2, 3, 4, 5]
a.extend([6,7,8,9,10])
         
a
         
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
t1 =(1,2,'a','b')
         
t1
         
(1, 2, 'a', 'b')
del t1[0]
         
Traceback (most recent call last):
  File "<pyshell#126>", line 1, in <module>
    del t1[0]
TypeError: 'tuple' object doesn't support item deletion
t1[0]='c'
         
Traceback (most recent call last):
  File "<pyshell#127>", line 1, in <module>
    t1[0]='c'
TypeError: 'tuple' object does not support item assignment
t1 = (1,2,'a','b')
         
t1
         
(1, 2, 'a', 'b')
t2 = (3,4)
         
t2
         
(3, 4)
t1+t2
         
(1, 2, 'a', 'b', 3, 4)
t2 = (3,4)
         
a=(1,2,3)
         
a
         
(1, 2, 3)
a+(4,)
         
(1, 2, 3, 4)
person ={'name':'pey',}
         
person['name']
         
'pey'
person = {'name':'pey'.'phone':'010-9999-1234','birth':'900110'}
         
SyntaxError: invalid syntax
person = {'name':'pey','phone':'010-9999-1234','birth':'900110'}
         
person[phone]
         
Traceback (most recent call last):
  File "<pyshell#141>", line 1, in <module>
    person[phone]
NameError: name 'phone' is not defined. Did you mean: 'None'?
person['phone']
         
'010-9999-1234'
person['birth']
         
'900110'
a= a = {1:'a',1:'b'}
         
a
         
{1: 'b'}
a ={[1,2]:'hi'}
         
Traceback (most recent call last):
  File "<pyshell#146>", line 1, in <module>
    a ={[1,2]:'hi'}
TypeError: unhashable type: 'list'
person
         
{'name': 'pey', 'phone': '010-9999-1234', 'birth': '900110'}
a.keys()
         
dict_keys([1])
dict_keys([1])
         
Traceback (most recent call last):
  File "<pyshell#149>", line 1, in <module>
    dict_keys([1])
NameError: name 'dict_keys' is not defined

a.values()
         
dict_values(['b'])
a.items
         
<built-in method items of dict object at 0x000001CE0DB14C80>
a.items()
         
dict_items([(1, 'b')])
a =  {'A':90,'B':80,'C':70}
         
a
         
{'A': 90, 'B': 80, 'C': 70}
a =  {'A':90,'B':80,'C':70}
         
print a
         
SyntaxError: incomplete input
print(a)
         
{'A': 90, 'B': 80, 'C': 70}
a['B']
         
80
A['C']
         
Traceback (most recent call last):
  File "<pyshell#160>", line 1, in <module>
    A['C']
NameError: name 'A' is not defined. Did you mean: 'a'?
a['C']
         
70
b = a.pop('B')
         
b
         
80
A
         
Traceback (most recent call last):
  File "<pyshell#164>", line 1, in <module>
    A
NameError: name 'A' is not defined. Did you mean: 'a'?

a
         
{'A': 90, 'C': 70}
s1 = set([1,2,3,4,5,6])
         
s2 = set([4,5,6,7,8,9])
         
s1
         
{1, 2, 3, 4, 5, 6}
s2
         
{4, 5, 6, 7, 8, 9}
KeyboardInterrupt
s1 & s2
         
{4, 5, 6}
(s1|s2)
         
{1, 2, 3, 4, 5, 6, 7, 8, 9}
s1.union(s2)
         
{1, 2, 3, 4, 5, 6, 7, 8, 9}
(s2 - s1)
         
{8, 9, 7}
(s1 - s2)
         
{1, 2, 3}
s1=set([1,2,3])
         
s1
         
{1, 2, 3}
s11.add(4)
         
Traceback (most recent call last):
  File "<pyshell#177>", line 1, in <module>
    s11.add(4)
NameError: name 's11' is not defined. Did you mean: 's1'?
s1=set([1,2,3])
         
s1.add(4)
         
s1
         
{1, 2, 3, 4}
a =[1,2,3]
         
a
         
[1, 2, 3]
id(a)
         
1984498831808
a
         
[1, 2, 3]
b=a
         
a
         
[1, 2, 3]
b
         
[1, 2, 3]
id9b)
SyntaxError: unmatched ')'
id(b)
1984498831808
c=[4,5,6]
c
[4, 5, 6]
id(c)
1984504430144
a
[1, 2, 3]
b


b
[1, 2, 3]
a
[1, 2, 3]
b
[1, 2, 3]
c
[4, 5, 6]
id(a)
1984498831808
id(b)
1984498831808
a is b
True
from copy import copy
a
[1, 2, 3]
>>> b = copy(a)
>>> id(a)
1984498831808
>>> id(b)
1984504619072
>>> a = 'python'
>>> a
'python'
>>> b= 'life'
>>> b
'life'
>>> a= b = 'python'
>>> a
'python'
>>> b
'python'
>>> a = [1,2,3]
>>> a
[1, 2, 3]
>>> 
>>> b = [1,2,3]
>>> b
[1, 2, 3]
>>> a is b
False
>>> a = [1,1,1,2,2,3,3,3,4,4,5]
>>> a
[1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5]
>>> aSet = set(a)
>>> aSet
{1, 2, 3, 4, 5}
>>> b = list(aSet)
>>> b
[1, 2, 3, 4, 5]
>>> print(b)]
SyntaxError: unmatched ']'
>>> print(b)
[1, 2, 3, 4, 5]
