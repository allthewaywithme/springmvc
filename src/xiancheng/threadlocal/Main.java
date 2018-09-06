package xiancheng.threadlocal;

public class Main {

    private static ThreadLocal<Person> local=new ThreadLocal<>();

    public static void main(String[] args) {

        Person person=new Person();

        new Thread(){
            @Override
            public void run() {
                for (;;){
                    local.set(person);
                    Person person1 = local.get();
                    person1.setNum(22);
                    System.out.println(Thread.currentThread().getName()+"=="+local.get().getNum());
                    Thread.yield();
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (;;){
                    local.set(person);
                    Person person2 = local.get();
                    person2.setNum(33);
                    System.out.println(Thread.currentThread().getName()+"=="+local.get().getNum());

                }
            }
        }.start();


    }
}
