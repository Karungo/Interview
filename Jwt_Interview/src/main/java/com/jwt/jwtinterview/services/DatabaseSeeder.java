package com.jwt.jwtinterview.services;

import com.jwt.jwtinterview.models.Entities.Book;
import com.jwt.jwtinterview.models.Entities.User;
import com.jwt.jwtinterview.models.Entities.Video;
import com.jwt.jwtinterview.repositories.BookRepository;
import com.jwt.jwtinterview.repositories.UserRepository;
import com.jwt.jwtinterview.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DatabaseSeeder {
    @Autowired
    private UserRepository repository;
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private VideoRepository videoRepository;
    @Autowired
    private PasswordEncoder bcryptEncoder;

    public void SeedData(){
        if(repository.count() == 0) {
            List<User> users = Stream.of(
                    new User("abno", bcryptEncoder.encode("jwt_abno"), "abno@jwt.com"),
                    new User("people", bcryptEncoder.encode("jwt_people_awesome"), "people@jwt.com"),
                    new User("john", bcryptEncoder.encode("john@2021"), "john@jwt.com"),
                    new User("jane", bcryptEncoder.encode("jane@2021"), "jane@jwt.com"),
                    new User("judy", bcryptEncoder.encode("judy@2021"), "judy@jwt.com"),
                    new User("alice", bcryptEncoder.encode("alice@2021"), "alice@jwt.com"),
                    new User("tony", bcryptEncoder.encode("tony@2021"), "tony@jwt.com"),
                    new User("james", bcryptEncoder.encode("james@2021"), "james@jwt.com"),
                    new User("nancy", bcryptEncoder.encode("nancy@2021"), "nancy@jwt.com"),
                    new User("lucy", bcryptEncoder.encode("lucy@2021"), "lucy@jwt.com"),
                    new User("maggy", bcryptEncoder.encode("maggy@2021"), "maggy@jwt.com"),
                    new User("dan", bcryptEncoder.encode("dan@2021"), "dan@jwt.com"),
                    new User("david", bcryptEncoder.encode("david@2021"), "david@jwt.com"),
                    new User("lorna", bcryptEncoder.encode("lorna@2021"), "lorna@jwt.com")
            ).collect(Collectors.toList());
            repository.saveAll(users);
        }
        if(bookRepository.count() == 0) {
            List<Book> books = Stream.of(
                    new Book("The River Between", "Ngugi wa Thiongo", "978-3-16-148410-0", 1),
                    new Book("Kifo Kisimani", "Kithaka wa Mberia", "978-3-16-148410-1", 2),
                    new Book("Gifted Hands", "Ben Carson", "978-3-16-148410-2", 3),
                    new Book("White Mischief", "James Fox", "978-3-16-148410-3", 4),
                    new Book("Unbowed", "Wangari Maathai", "978-3-16-148410-4", 5),
                    new Book("Dust", "Yvonne Adhiambo", "978-3-16-148410-5", 6),
                    new Book("The White Masai", "Corinne Hofmann", "978-3-16-148410-6", 7),
                    new Book("Chozi la Heri", "Assumpta K. Matei", "978-3-16-148410-7", 8),
                    new Book("Kigogo", "Pauline Kea", "978-3-16-148410-8", 8),
                    new Book("Tumbo Lisiloshiba", "Dumu Kayanda", "978-3-16-148410-9", 9),
                    new Book("Siku Njema", "Ken Walibora", "978-3-16-148411-0", 10),
                    new Book("Kidagaa Kimemwozea", "Ken Walibora", "978-3-16-148411-1", 11),
                    new Book("Utengano", "Said Ahmed Mohammed", "978-3-16-148411-2", 12),
                    new Book("Out of Africa", "Karen Blixen", "978-3-16-148411-3", 13),
                    new Book("Facing Mount Kenya", "Jomo Kenyatta", "978-3-16-148411-4", 14),
                    new Book("Grain of Wheat", "Ngugi wa Thiongo", "978-3-16-148411-5", 15),
                    new Book("Kusadikika", "Shaaban Robert", "978-3-16-148411-6", 16),
                    new Book("Blossoms of the Savannah", "Henry ole Kulet", "978-3-16-148411-7", 17),
                    new Book("A dolls House", "Henrik Ibsen", "978-3-16-148411-8", 18),
                    new Book("The River and the Source", "Margaret Ogola", "978-3-16-148411-9", 19),
                    new Book("The Pearl", "John Steinbeck", "978-3-16-148412-0", 20)
            ).collect(Collectors.toList());
            bookRepository.saveAll(books);
        }
        if(videoRepository.count() == 0) {
            List<Video> videos = Stream.of(
                    new Video("Data Structures and Algorithms", "Topic on data structures", "https://www.youtube.com/watch?v=8hly31xKli0", "Good", 1),
                    new Video("Data Science", "Topic on data science", "https://www.youtube.com/watch?v=-ETQ97mXXF0", "", 2),
                    new Video("Artificial Intelligence", "Topic on AI", "https://www.youtube.com/watch?v=JMUxmLyrhSk", "", 3),
                    new Video("Computer Architecture", "Topic on Computer Architecture", "https://youtu.be/4TzMyXmzL8M", "", 4),
                    new Video("Machine Learning", "Topic on ML", "https://youtu.be/ukzFI9rgwfU", "", 5),
                    new Video("Software Engineering", "Topic on Software Engineering", "https://youtu.be/Z6f9ckEElsU", "", 6),
                    new Video("Computer Programming", "Topic on Computer Programming", "https://youtu.be/zOjov-2OZ0E", "", 7),
                    new Video("Analysis of Algorithms", "Topic on Analysis of Algorithms", "https://youtu.be/yOl-EpY39kM", "", 8),
                    new Video("Theory of Computing", "Topic on Theory of Computing", "https://youtu.be/SV57Yv8BXBc", "", 9),
                    new Video("Computer Networks", "Topic on Computer Networks", "https://youtu.be/mxK4cH6DJwo", "", 10),
                    new Video("Automata Theory", "Topic on Automata Theory", "https://youtu.be/EtYsnFGIUkA", "", 11),
                    new Video("Compiler Construction", "Topic on Compiler Construction", "https://youtu.be/Qkwj65l_96I", "", 12),
                    new Video("Distributed Systems", "Topic on Distributed Systems", "https://youtu.be/ajjOEltiZm4", "", 13),
                    new Video("System Analysis", "Topic on System Analysis", "https://youtu.be/s8Lq6Kj2OXs", "", 14),
                    new Video("Digital Electronics", "Topic on Digital Electronics", "https://youtu.be/vsoYlH1_hbc", "", 15),
                    new Video("Database Systems", "Topic on Database Systems", "https://youtu.be/4Z9KEBexzcM", "", 16),
                    new Video("Data Communication", "Topic on Data Communication", "https://youtu.be/OmYHJShD_QM", "", 17),
                    new Video("Assembly Language", "Topic on Assembly Language", "https://youtu.be/1FXhjErUz58", "", 18),
                    new Video("Web Programming", "Topic on Web Programming", "https://youtu.be/1rsuxwVD98I", "", 19),
                    new Video("Operating Systems", "Topic on OS", "https://youtu.be/RozoeWzT7IM", "", 20),
                    new Video("Human Computer Interactions", "Topic on HCI", "https://youtu.be/HSSFVBWFiLg", "", 21)


            ).collect(Collectors.toList());
            videoRepository.saveAll(videos);
        }

    }
}
