import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import models.Comment;
import models.Post;

public class Main {
    public static void main(String[] args) throws Exception {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        Post post1 = new Post(
                LocalDateTime.parse("21/06/2018 13:05:44", fmt),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12);
        Post post2 = new Post(
                LocalDateTime.parse("28/07/2018 23:14:19", fmt),
                "Good night guys",
                "See you tomorrow",
                5);

        post1.addComment(new Comment("Have a nice trip"));
        post1.addComment(new Comment("Wow that's awesome!"));
        post2.addComment(new Comment("Good night"));
        post2.addComment(new Comment("May the Force be with you"));


        System.out.println(post1);        System.out.println(post2);
    }
}
