package io.codeix9.chat.models;

import com.mongodb.lang.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.ZonedDateTime;

@Data
@Document
@AllArgsConstructor
public class User {
    @Id
    private String id;
    private String name;
    @Indexed(unique = true)
    private String email;
    private String password;
    private String token;
    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;
    @Nullable
    private ZonedDateTime deletedAt;


}
