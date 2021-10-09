public class MediatorPatternDemo {

    public static void main(String[] args) {
        User jhon = new User("Jhon"); //using the constructor initializing User.java 
        User ben = new User("Ben");
        User bulzer = new User("Bulzer");
        jhon.sendMessage("Hi Ben!"); //pass this arguments to send message method
        ben.sendMessage("Hello Jhon!");
        bulzer.sendMessage("Hello All");
    }
}
