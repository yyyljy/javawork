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

