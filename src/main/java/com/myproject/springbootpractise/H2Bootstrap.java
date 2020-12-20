package com.myproject.springbootpractise;
import com.myproject.springbootpractise.entity.RoomEntity;
import com.myproject.springbootpractise.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class H2Bootstrap implements CommandLineRunner {
    @Autowired
    RoomRepository roomRepository;
    @Override
    public void run(String... args)  {
        System.out.println("Bootstrapping data: ");
        roomRepository.save(new RoomEntity(401,"200"));
        roomRepository.save(new RoomEntity(402,"300"));
        roomRepository.save(new RoomEntity(403,"400"));
        Iterable<RoomEntity>  itr = roomRepository.findAll();
        for (RoomEntity room: itr){
            System.out.println(room.getRoomNumber());
        }

    }
}
