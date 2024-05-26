import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class App {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow Thats Awesome!!");
        Post p1 = new Post(sdf.parse("21/06/2023 13:05:44"), "Viagem Gramado", "Estou para gramado cambada", 12);
        p1.addComment(c2);
        p1.addComment(c1);
        System.out.println(p1);

    }
}
