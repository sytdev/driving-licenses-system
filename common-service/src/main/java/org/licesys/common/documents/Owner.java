package org.licesys.common.documents;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Document(collection = "owners")
public class Owner {

    @EqualsAndHashCode.Include
    @Getter
    @Id
    private String id;

    @Getter @Setter
    @Field
    private String idCard;

    @Getter @Setter
    @Field
    private String firstName;

    @Getter @Setter
    @Field
    private String lastName;

    @Getter @Setter
    @Field(write = Field.Write.ALWAYS)
    private Integer age;

    @Getter @Setter
    @Field
    private String createdBy;

    @Getter @Setter
    @Field
    private LocalDateTime createdAt;

    @Getter @Setter
    @Field(write = Field.Write.ALWAYS)
    private String modifiedBy;

    @Getter @Setter
    @Field(write = Field.Write.ALWAYS)
    private LocalDateTime modifiedAt;
}
