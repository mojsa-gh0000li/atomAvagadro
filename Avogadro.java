public class Avogadro {

// NIMA SAEIDI / SANA GHORBANI / SANA GHOLINAVAZ / BITA RAZPOOR

    public static void main (String[] args){




        double P=0.5e-6;
        double R=8.31457;
        double N=9.135e-4;

        double[] blob= StdIn.readAllDoubles();
        double sum=0;
        double D;
        double T=297;
        double count=0;
        for (int i = 0; i < blob.length; i++) {
            sum+=Math.pow(blob[i]*0.175e-6,2);
            count++;
        }
        D=sum/(2*count);
        double botzman=(6*3.1415*D*N*P)/T ;
        double avogadro=R/botzman;
        System.out.printf("botzman = %.4e\n",botzman);
        System.out.printf("avogadro = %.4e\n",avogadro);
    }
}
//"botzman = "+botzman
   //     "avogadro = "+avogadro