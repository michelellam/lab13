import java.util.*;
import java.io.*;

class lab13{
    private ArrayList<Integer> data = new ArrayList<>();

    public void readData(String filename){
        try{
            BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));

            String inn;

            while((inn = input.readLine()) != null){
                data.add(Integer.valueOf(inn));
            }

        }catch(Exception e){}
            
        }
        public long getTotalCount(){
            return data.stream().count();
        }

        public long getOddCount(){
            return data.stream().filter(i -> i % 2 == 1).count();
        }
        public long getEvenCount(){
            return data.stream().filter(i -> i % 2 == 0).count();
        }
        public long getDistinctGreaterThanFiveCount(){
            return data.stream().filter(i -> i > 5).distinct().count();
        }
        public Integer[] getResult1(){
            return data.stream().filter(i -> i > 5 && i < 50 && i % 2 == 0).sorted().toArray(Integer []:: new);
        }
        public Integer[] getResult2() {
            return data.stream().map(i -> (i * i) * 3).limit(50).toArray(Integer[]::new);
        }
        
        public Integer[] getResult3() {
        return data.stream().filter(i -> i % 2 == 1).map(i -> i * 2).sorted().skip(20).distinct().toArray(Integer[]::new); 
        }
}