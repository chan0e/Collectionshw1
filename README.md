## HashMap

Map 인터페이스를 구현한 대표적인 Map Collection. (key, value)로 구성된 Entry객체를 저장하는 자료구조
키와 값은 모두 객체고 값은 중복가능하지만 키는 중복 저장안됨

기본 사용법으로는 HashMap<T,T> map = new HashMap<>();

map.put(key,value);

map.get(key); -> value print

map.remove(key); -> key값 제거

map.clear(); -> 모든 값 제거




### 소스코드

```java
               while ((line = reader.readLine()) != null) {
                 
                    String[] words = line.split("\t");
                    String[] words2 = words[0].split(" ");
                    map.put(words2[1].trim(), words[1]);

                }      
```
파일에 있는 단어를 한줄씩읽어 map Collection에 넣어줬는데 문제는 파일에 있는단어가
"1. culture    문화"    이런식으로 되어있어 split("\t")으로 한번 쪼개 준후
다시 한번 쪼개주어 culture와 문화를 map에 넣어줬다.




```java
                for (String key : map.keySet()) {
                    if (serach.equals(key)) {
                        System.out.println(map.get(serach));
                        break;
                    }
                }                

```

따라서 찾을려는 단어를 사용자에게 입력받아 map에 있는 key와 같으면 그 key값에 해당하는
value값을 출력하게 해주는 간단한 프로그램이였다.
