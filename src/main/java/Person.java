public class Person {
    private String name;

    public Person(){
        this("");
    }

    public Person(String Name){
        this.name = Name;
    }

    public String getName(){
        return name;
    }

    public void setName(String Name){
        this.name = Name;
    }


    public void sayHello(){
        System.out.println("Hello from " + this.name + "!");
    }






    public static void main(String[] args) {
        Person Matt = new Person();
        Matt.setName("Matt");
        Matt.sayHello();



    }
}
