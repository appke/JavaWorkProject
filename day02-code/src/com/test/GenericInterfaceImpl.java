package com.test;

//public class GenericInterfaceImpl implements GenericInterface<String> {
//    @Override
//    public void method(String s) {
//
//    }
//}

// 使用二：实现类也使用泛型
public class GenericInterfaceImpl<I> implements GenericInterface<I>{

    @Override
    public void method(I i) {
        System.out.println(i);
    }
}