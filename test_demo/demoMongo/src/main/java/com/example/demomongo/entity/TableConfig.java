package com.example.demomongo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document("tableConfig")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TableConfig {
    @Id
    private String id;
    @Field
    private String tableId;

    @Field
    private List configJson;

    @Override
    public String toString() {
        return "TableConfig{" +
                "id='" + id + '\'' +
                ", tableId='" + tableId + '\'' +
                ", configJson=" + configJson +
                '}';
    }
}
