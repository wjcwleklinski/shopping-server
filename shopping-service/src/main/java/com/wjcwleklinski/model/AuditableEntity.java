package com.wjcwleklinski.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class AuditableEntity {

    private LocalDateTime creationDate;

    private Long creatorId;

    private LocalDateTime editionDate;

    private Long editorId;

    private LocalDateTime removalDate;

    private Long removerId;
}
