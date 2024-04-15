package 복습;

public class Who {
    public String name;
    public int age;


    public Who(String name, int age) {
        this.name = name; // name은 매개변수에 있는 name
        this.age = age; //this.age 는 위에 클래스의 name
    }


    public void whoareu() {
        System.out.println("제 이름은" + name+ "나이는+" +age);

    }

}


   /* 클래스를 생성하고, 이름(name)과 나이(age)를 필드로 가지게 하세요.
    해당 클래스에는 이름과 나이를 설정할 수 있는 생성자와, 이를 출력할 수 있는 메서드를 포함하세요.
*/



