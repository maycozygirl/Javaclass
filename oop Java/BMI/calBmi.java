package BMI;

public class calBmi {
    private static float weight,height,bmi;

    public float SetBMI(Float w,Float h){
        weight = w;
        height= h/100f;
        bmi = weight/(height*height);
        return bmi;
    }
    

    public static void GetBMI(){
        if (bmi<18.50){
            System.out.println("ผล BMI ของคุณ อยู่ที่ : "+bmi);
            System.out.println("คุณอยู่ในเกณฑ์ : น้ำหนักน้อย / ผอม");
            System.out.println("ภาวะเสี่ยงต่อโรค : มากกว่าคนปกติ");
        }else if (bmi>18.50 && bmi<22.90){
            System.out.println("ผล BMI ของคุณ อยู่ที่ : "+bmi);
            System.out.println("คุณอยู่ในเกณฑ์ : ปกติสุขภาพดี");
            System.out.println("ภาวะเสี่ยงต่อโรค : เท่าคนปกติ");
        }else if (bmi>23 && bmi<24.90){
            System.out.println("ผล BMI ของคุณ อยู่ที่ : "+bmi);
            System.out.println("คุณอยู่ในเกณฑ์ : ท้วม / โรคอ้วนระดับ 1");
            System.out.println("ภาวะเสี่ยงต่อโรค : อันตรายระดับ 1");
        }else if (bmi>25 && bmi<29.90){
            System.out.println("ผล BMI ของคุณ อยู่ที่ : "+bmi);
            System.out.println("คุณอยู่ในเกณฑ์ : อ้วน / โรคอ้วนระดับ 2");
            System.out.println("ภาวะเสี่ยงต่อโรค : อันตรายระดับ 2");
        }else if (bmi>30){
            System.out.println("ผล BMI ของคุณ อยู่ที่ : "+bmi);
            System.out.println("คุณอยู่ในเกณฑ์ : อ้วนมาก / โรคอ้วนระดับ 3");
            System.out.println("ภาวะเสี่ยงต่อโรค : อันตรายระดับ 3");
        }
    }

}


