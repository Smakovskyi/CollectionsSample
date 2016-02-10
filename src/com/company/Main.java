package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Human> list = new LinkedList<Human>(Arrays.asList(
                new Human("John" , "555" , 55),
                new Human("Jack" , "444" , 44) )  );
        list.add( new Human("Bill" , "777" , 33) );
        list.add(new Human("Henry policeman" , "777" , 33){
            String post = "leutenant";

            @Override
            public String toString() {
                return super.toString() +
                        "{ post='" + post + '\'' +
                        '}';
            }
        });
        //list.add("werwerw");
        System.out.println(list);
        System.out.println("=========================");
        Iterator<Human> it = list.iterator();
        while ( it.hasNext()){
            Human h = it.next();
            System.out.println(h);
        }
        System.out.println("======================");
        for( Human h : list){
            System.out.println(h);
        }
        System.out.println("====raw======");
        //raw collection
        ArrayList raw = new ArrayList( list );
        System.out.println(raw);
 //       raw.add( "Fred");
      //  raw.add( -100500 );
      //  raw.add(new Object());
        for(Object i: raw ){
            Human h = (Human) i;
            System.out.println( h.getName() );
        }


        ArrayList<?> rawConst = new ArrayList(list);
        ///rawConst.add("");
        System.out.println("======sorted============");
        Collections.sort(list);
        System.out.println(list);
        Collections.sort( list ,  new Comparator<Human>(){
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(list);
        list.sort( (o1,o2)-> o1.getPhone().compareTo(o2.getPhone()));
        list.sort( (o1,o2)->{
            return o1.getPhone().compareTo(o2.getPhone());}
        );
        System.out.println(list);
        Set<Human> set = new TreeSet<>(list);
        System.out.println(set);
       // Comparator<Human> comp = Comparator<Human>.comparingInt(o -> ((Human) o).getAge())
        //        .thenComparing(Comparator.comparing( o -> ((Human) o).getName())) ;


                set = new TreeSet<>((o1, o2) -> o1.getAge() - o2.getAge());
        set.addAll(list);
        System.out.println(set);

    }
}
