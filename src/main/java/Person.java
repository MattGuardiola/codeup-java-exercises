public class Person {
    private String Name;

    public Person(){
        this("");
    }

    public Person(String Name){
        this.Name = Name;
    }

    public String getName(){
        return Name;
    }

    public void setName(String Name){
        this.Name = Name;
    }


    public void sayHello(){
        System.out.println("Hello from " + this.Name + "!");
    }






    public static void main(String[] args) {
        Person Matt = new Person();
        Matt.setName("Matt");
        Matt.sayHello();




    }
}
