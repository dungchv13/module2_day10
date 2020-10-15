public class MyListTest {
    public static void main(String[] args) {
        System.out.println("listTest: ");
        MyList<Integer> listTest = new MyList<Integer>();
        listTest.add(1);
        listTest.add(2);
        listTest.add(3);
        listTest.add(4);
        listTest.add(5);
        listTest.add(6);
        listTest.add(7);
        for (int i = 0; i < listTest.getSize(); i++) {
            System.out.println("element "+i+":"+listTest.get(i));
        }


//        System.out.println("element 0:"+listTest.get(0));
//        System.out.println("element 1:"+listTest.get(1));
//        System.out.println("element 2:"+listTest.get(2));
//        System.out.println("element 3:"+listTest.get(3));
//        System.out.println("element 4:"+listTest.get(4));
//        System.out.println("element 5:"+listTest.get(5));
//        System.out.println("element 6:"+listTest.get(6));
//        System.out.println(listTest.getSize());

//        System.out.println("Test 1:test .add1(3,45)");
//        listTest.add1(3,45);
//
//        System.out.println("element 0:"+listTest.get(0));
//        System.out.println("element 1:"+listTest.get(1));
//        System.out.println("element 2:"+listTest.get(2));
//        System.out.println("element 3:"+listTest.get(3));
//        System.out.println("element 4:"+listTest.get(4));
//        System.out.println("element 5:"+listTest.get(5));
//        System.out.println("element 6:"+listTest.get(6));
//        System.out.println("element 7:"+listTest.get(7));
//        System.out.println(listTest.getSize());
//
//        System.out.println("test 2:remove(3)");
//        listTest.remove(3);
//
//        System.out.println("element 0:"+listTest.get(0));
//        System.out.println("element 1:"+listTest.get(1));
//        System.out.println("element 2:"+listTest.get(2));
//        System.out.println("element 3:"+listTest.get(3));
//        System.out.println("element 4:"+listTest.get(4));
//        System.out.println("element 5:"+listTest.get(5));
//        System.out.println("element 6:"+listTest.get(6));
//        System.out.println(listTest.getSize());
//
//        System.out.println("test 3:.contains(5)/contains(15)");
//        System.out.println(listTest.contains(5));
//        System.out.println(listTest.contains(15));
//
//        System.out.println("test 4:.indexOf(5)/.indexOf(15)");
//        System.out.println(listTest.indexOf(5));
//        System.out.println(listTest.indexOf(15));
//
//        System.out.println("test 5:ensureCapacity(15)/ensureCapacity(5)");
//        listTest.ensureCapacity(15);
//        listTest.ensureCapacity(5);
//        System.out.println("element 0:"+listTest.get(0));
//        System.out.println("element 1:"+listTest.get(1));
//        System.out.println("element 2:"+listTest.get(2));
//        System.out.println("element 3:"+listTest.get(3));
//        System.out.println("element 4:"+listTest.get(4));
//        System.out.println("element 5:"+listTest.get(5));

//        System.out.println("test 6:clear()");
//        listTest.clear();
//        System.out.println("element 0:"+listTest.get(0));

//        System.out.println("test 7:clone()");i
//        MyList<Integer> newList = listTest.clone1(listTest);
//        System.out.println(newList.indexOf(5));
//        System.out.println("clone");
//        MyList<Integer> myList1 = listTest.clone1();
//        System.out.println(myList1.getSize());
//        System.out.println(myList1.get(4));
//        myList1.add(789);
//        System.out.println(myList1.get(7));
//        System.out.println(listTest.get(7));



    }
}
