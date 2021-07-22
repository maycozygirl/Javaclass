
public class main {
    public static void main(String[] args) {
        //student Stu = new student();
        register reg = new register();
        override Ov =new override();

        reg.setfname("MAY");
        reg.setlname("Rodhuab");
        reg.setmaJor("Com");
        System.out.println(reg.getmaJor());

        reg.SetId("tt2323");
        reg.SetSubject("Java");

        System.out.println(reg.getId());
        System.out.println(reg.getSub());
        
        System.out.println(reg.getPerson());

        Ov.setfname("dd");
        Ov.setlname("dss");
        System.out.println(Ov.getPerson());
    }
}