import javax.swing.*;



public class Race {
    final int l = 100;
    static int position1=10;
    static int position2=10;

    class show extends JFrame{
        JButton t1,t2,l1;

        JPanel l;
        public show(){
            t1=new JButton("tortoise");
            t2=new JButton("rabbit");
            l1=new JButton("жу╣Ц");
            l=new JPanel();
            l.setLayout(null);
            add(l);
            l.add(l1);
            l.add(t1);
            l.add(t2);
            l1.setBounds(980,30,80,200);
            t1.setBounds(position1,50,80,80);
            t2.setBounds(position2,160,80,80);
            setSize(1200,300);
            setVisible(true);
            this.setLayout(null);
        }

    }

    class tortoise implements Runnable {
        int v1 = 2;

        @Override
        public void run() {
            for (int i = 1; i <= l / v1; i++) {
                System.out.println("tortoise climb " + v1 * i+"m");
                //show c=new Race().new show();
                position1=position1+20;

                if(v1*i==100){
                    System.out.println("tortoise reach destination");
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    class rabbit implements Runnable {
        int v2 = 5;

        @Override
        public void run() {
            for (int i = 1; i <= l / v2; i++) {
                System.out.println("rabbit jump " + v2 * i+"m");
                position2=position2+50;

                if(v2*i==100){
                    System.out.println("rabbit  reach destination");
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (v2 * i == 75) {
                    try {
                        System.out.println("rabbit is sleepping");
                        Thread.sleep(32000);
                        System.out.println("rabbit is wake up");
                    } catch (Exception e) {

                    }
                }

            }
        }
        }

        public static void main(String[] args) {
            Race s = new Race();
            show c=s.new show();
            new Thread(){
                public void run(){
                    for(int i=0;i<52;i++){
                        //c.l.removeAll();
                        JButton u =new JButton("жу╣Ц");
                        JButton p=new JButton("tortoise");
                        JButton v=new JButton("rabbit");
                        c.l.add(v);
                        c.l.add(p);
                        c.l.add(u);
                        u.setBounds(980,30,80,200);
                        p.setBounds(position1,50,80,80);
                        v.setBounds(position2,160,80,80);

                        try{
                            Thread.sleep(1000);
                        }
                        catch(Exception e){

                        }
                    }

            }
            }.start();
            rabbit r = s.new rabbit();
            tortoise t = s.new tortoise();
            Thread y = new Thread(r, "rabbit");
            Thread d = new Thread(t, "tortoise");
            y.start();
            d.start();
        }
    }

