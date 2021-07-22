public class person {
    
    //ประกาศ Attribute
    public String firstname, lastname;


    //ส่งค่าเป็น Paramiter มา
    public void setfname(String firstname){
        this.firstname = firstname;
        //พอมี this จะรู้ว่าตัวไหน เวลาตั้งซ้ำกัน
    }

    public String getfname(){
        return firstname;
    }

    public void setlname(String lastname){
        this.lastname = lastname;
        //พอมี this จะรู้ว่าตัวไหน เวลาตั้งซ้ำกัน
    }

    public String getlname(){
        return lastname;
    }

    //Override

    public String getPerson(){
        return "Student : "+firstname+" "+lastname+"\n";
    }
}
