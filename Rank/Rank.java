import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N; 
    static Vector<Student> students; 
	public static void main (String[] args) throws java.lang.Exception {
	    Init();
        sort();
        print();
	}
	
	public static void Init() throws java.lang.Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        N = Integer.parseInt(br.readLine()); 
        students = new Vector<Student>(); 
   
        for(int i = 0; i < N; i++){ 
            students.add(new Student(br.readLine())); 
        }
	}
	
    // 정렬 로직
	public static void sort(){
	    Collections.sort( students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if(s1.score.size() != s2.score.size()){
                    return s2.score.size() - s1.score.size();
                }
                else{
                    for(int i = 0; i < s1.score.size(); i++){
                        if(s1.score.get(i) != s2.score.get(i)){
                            return s2.score.get(i) - s1.score.get(i);
                        }
                    }
                }
                return s2.name.compareTo(s1.name);
            }
        });
	}
	
    // 순차적 출력 출력
	public static void print(){
	    for(int i = 0; i < N; i++){ 
            System.out.println(students.get(i).name);
        }
	}
	
}

class Student{
    String name; 
    Vector<Integer> score; 
    
    public Student(String data){  
        StringTokenizer st = new StringTokenizer(data); 
        name = st.nextToken(); 
         
        score = new Vector<Integer>(); 
        int temp = 0; 
         
        while(true){ 
            temp = Integer.parseInt(st.nextToken()); 
            if(temp == 0) 
                break; 
            
            score.add(temp); 
        }
        
        Collections.sort(score);
    }
}