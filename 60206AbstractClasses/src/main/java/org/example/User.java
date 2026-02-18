package org.example;

//sia klase nekursim objektu, nes tai abstract class, ja galima tik paveldeti
public abstract class User {
    private int id;
    protected String name; //protected - child klasei leidziama naudoti kaip savo property
    private String email;
    protected String role;

    //konstruktorius - tik tam kad galetu but paveldetas (leis paveldeti sita klase kitai klasei) (ir isplestas kitoj kl)
    public User(int id, String name, String email, String role){
        this.id=id;
        this.name=name;
        this.email=email;
        this.role=role;
    }
    //keli abstractus methods - metodai bus realizuoti kitose klasese
    public abstract void login(); //reiskia visi Users privalo tureti logina
    public abstract void logout();
    public abstract String showProfile();

}