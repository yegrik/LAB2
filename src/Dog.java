public class Dog {
    private String nickname;
    private int age;

    public Dog(String nickname, int age){
        this.age = age;
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int transAge(){
        return getAge() * 7;
    }

    @Override
    public String toString(){
        return String.format("Age = %d\nName = %s\nHuman_Age = %d", getAge(), getNickname(), transAge());
    }
}
