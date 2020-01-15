# API-Util

## Vector

```java
Vector<Integer> v = new Vector<Integer>();
v.add(10);
System.out.println("Vector의 용량:"+v.capacity());
System.out.println("Vector에 저장된 요소의 갯수:"+v.size());
```

## ArrayList

```java
ArrayList<Integer> list = new ArrayList<Integer>();
list.add(10);
for(int i=1;i<=10;i++) {
    list.add(i);
}
for(int i=0;i<list.size();i++) {
    System.out.println(list.get(i));
}
```

## HashSet

- Set에 저장된 요소를 추출

  - HashSet데이터를 표준 인터페이스(모든 자료구조에 담긴 데이터를 변환해서 담을 수 있도록 제공되는 추출 전용 인터페이스) Iterator로 변환

    ```java
    HashSet<String> set = new HashSet<String>();
    set.add("java");
    set.add("jdbc");
    set.add("oracle");
    Iterator<String> it = set.iterator();
    while(it.hasNext()) {
        String data = it.next();
        System.out.println("꺼낸 요소:"+data);
    }
    
    for (String data : set) {
        System.out.println("set에 저장된 요소:"+data);
    }
    ```

- 합집합 : Set객체를 생성할 때 합집합으로 표현할 Set을 생성자의 매개변수로 전달

  ```java	
  HashSet<String> set2 = new HashSet<String>(set);
  ```

- 교집합 : set과 set3의 저장된 요소 중 중복되는 요소만 가지고 새로운 set구조가 만들어진다.

  ```java
  set.retainAll(set3);
  ```

  

## HashMap

