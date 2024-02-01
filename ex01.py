import requests

url = 'https://search.naver.com/search.naver'
param = {'query' : '파이썬'}
response = requests.get(url, params = param) #네이버에서 파이썬을 검색한 결과의 소스를 모두 가져와라
print(response.text)
