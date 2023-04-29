public class Blob {
    // NIMA SAEIDI / SANA GHORBANI / SANA GHOLINAVAZ / BITA RAZPOOR
    private double sunY=0;
     private  double sumX=0;
     int mass=0;





        public Blob(){
        }
        public void add(int x, int y){

            sumX+=x;
            sunY+=y;
            mass++;
            //sumX=(Math.round(sumX*10000))/10000;
            //sunY=(Math.round(sunY*10000))/10000;

        }

        public int mass(){

        return mass;
        }

        public double distinceTo(Blob blob){
         double x= blob.sumX/ blob.mass;
         double y= blob.sunY/ blob.mass;
         double cx=sumX/mass;
         double cy=sunY/mass;
         double ans=Math.sqrt(Math.pow(x-cx,2)+Math.pow(y-cy,2));
         return ans;
    }

    public String ToString(){
        return String.format("%d ( %.4f , %.4f )",mass,sumX/mass,sunY/mass );
    }
   // mass+"("+sumX/mass+","+sunY/mass+")";
    public static void main(String[] args){





    }


}
