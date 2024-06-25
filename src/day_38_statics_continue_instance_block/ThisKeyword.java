package day_38_statics_continue_instance_block;

public class ThisKeyword {

    String name;
    int id;
    String name2;


    public void setInfo(String name, int id){

        //this.name = name;
       // this.id = id;

        if (this.name == null){
            this.name = name;
        }
        if (this.id ==0){
            this.id = id;
        }

    }

}
