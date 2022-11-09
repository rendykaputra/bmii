public class bmi {
    public static void main(String[] args) {
        int beratbadan = 60;
        float tinggibadan =1.68f;
        float bmi= (beratbadan/(tinggibadan*tinggibadan) );
        System.out.println("BMI anda adalah\t:"+bmi);

        if (bmi<18.5){
            System.out.println("BERAT BADAN ANDA KURANG");
        }
        else if (bmi<24.9){
            System.out.println("BERAT BADAN ANDA NORMAL/IDEAL");
        }
        else if (bmi<2.9){
            System.out.println("BERAT BADAN ANDA LEBIH");
        }
        else{
            System.out.println("OBESITAS");
        }
    }
}
