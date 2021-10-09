public class User {

    private String name; //user having a name

    public String getName() { //get name return string
        return name;
    }

    public void setName(String name) { //set name take one string as input arguments..which will be assign to name instance variable
        this.name = name;
    }

    public User(String name) { //that is our constructor ..put this value input argument name...to this particular .name
        this.name = name;
    }

    public void sendMessage(String message) { //this is one mehod in to the User Class..take a String message as a input arguments
        ChatRoom.showMessage(this, message); //it will easyly find a ChatRoom.java ...this, message pass to the  ChatRoom.showMessage
    }
}
