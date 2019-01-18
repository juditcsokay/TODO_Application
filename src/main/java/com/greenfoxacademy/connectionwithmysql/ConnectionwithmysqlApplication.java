package com.greenfoxacademy.connectionwithmysql;

import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionwithmysqlApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(ConnectionwithmysqlApplication.class, args);
  }


  @Autowired
  TodoRepository todoRepository;

  @Override
  public void run(String... args) throws Exception {
//    todoRepository.save(new Todo("daily task"));
//    todoRepository.save(new Todo("make the beds", true, true));
//    todoRepository.save(new Todo("do the washing up", true, false));
//    todoRepository.save(new Todo("clean the bathroom and the kitchen", true, true));
//    todoRepository.save(new Todo("wipe all the surfaces with cloth", true, false));
//    todoRepository.save(new Todo("remove the grease", true, true));
//    todoRepository.save(new Todo("tidy up"));
//    todoRepository.save(new Todo("throw away the rubbish", true, true));
//    todoRepository.save(new Todo("broom", true, false));
//    todoRepository.save(new Todo("sweep the floor", true, true));
  }
}
