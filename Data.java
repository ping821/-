import java.util.Scanner;

public class Data {
    int year;
    int month;
    int day;
    public  int sy;
    public  int dayy;
    public void data(){
        System.out.println("���������ڣ���ʽΪ��/��/�գ���");
        Scanner d = new Scanner(System.in);
        String s = d.next();
        System.out.print(s);
        try {
            sy = Integer.parseInt(s.substring(0, 4));
            int sm = Integer.parseInt(s.substring(5, 7));
            int sd = Integer.parseInt(s.substring(8, 10));
            if (sy % 400 == 0 || sy % 4 == 0 && sy % 100 != 0) {
                int[] datas = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                if(sm>12){
                    System.out.println("�Ǵ�������룻�·�ӦΪ01--12");
                    //continue;
                }
                if(sd>datas[sm]){
                    System.out.println("�Ǵ�������룺"+sm+"�²�����"+sd+"��");
                    //continue;
                }
                int sum = 0;
                for (int l = 0; l < sm; l++) {

                    int k = datas[l];
                    sum += k;
                }
                dayy = sum + sd;
                System.out.println("��" + sy + "��ĵ�" + dayy + "��");
            } else {
                int[] datass = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                if(sm>12){
                    System.out.println("�Ǵ�������룻�·�ӦΪ01--12");
                    //continue;
                }
                if(sd>datass[sm]){
                    System.out.println("�Ǵ�������룺"+sm+"�²�����"+sd+"��");
                    //continue;
                }
                int sum1 = 0;
                for (int p = 0; p < sm; p++) {
                    int u = datass[p];
                    sum1 += u;
                }
                dayy = sum1 + sd;
                System.out.println("��" + sy + "��ĵ�" + dayy + "��");
            }
        } catch (Exception e) {
            System.out.println("��ʽ���󣺸�ʽΪ��/��/��");
        }

        //Data a = new Data(2018, 11, 24);
        //System.out.println(a);
    }




    public String toString() {
        return this.year + "��" + this.month + "��" + this.day + "��";
    }

    public static void main(String[] args) {
        while (true) {
            new Data().data();
        }
    }
}
