package ru.malets.spring.store.models;

public class Client {
    private int id;
    private int wallet;
    private int telephone;
    private String eMail;
    private String name;
    private String surname;
    private String url = "https://cdn-icons-png.flaticon.com/512/6387/6387915.png";
    private String login;
    private String password;

    public Client() {
    }

    public Client(int id, int wallet, String name, String surname, String login, String password) {

        this.id = id;
        this.wallet = wallet;
        this.name = name;
        this.surname = surname;
        this.url = url;
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
