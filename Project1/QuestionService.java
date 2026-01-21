package Project1;

public class QuestionService {
    Question [] questions = new Question[5];
 
    public QuestionService(){
        questions[0] = new Question(1,"what was the language discovered 1994","java","cpp","python","csharp","java"); 
        questions[1] = new Question(2,"size of double","2","6","4","8","java"); 
        questions[2] = new Question(3,"size of int","2","6","4","8","java"); 
        questions[3] = new Question(4,"size of char","2","6","4","8","java"); 
        questions[4] = new Question(5,"size of boolean","2","1","4","8","java"); 
    }
    public void displayQuestions(){
        for( Question q : questions)
       System.out.println(q);
    }
}
