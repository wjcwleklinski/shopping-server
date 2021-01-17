package com.wjcwleklinski.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "AUDIT_INFO")
public class AuditInfo {

    @Id
    @Column(name = "ADT_ID")
    private Long id;

    @Column(name = "ADT_CREATION_DATE")
    private LocalDateTime creationDate;

    @Column(name = "ADT_CREATOR_ID")
    private Long creatorId;

    @Column(name = "ADT_EDITION_DATE")
    private LocalDateTime editionDate;

    @Column(name = "ADT_EDITOR_ID")
    private Long editorId;

    @Column(name = "ADT_REMOVAL_DATE")
    private LocalDateTime removalDate;

    @Column(name = "ADT_REMOVER_ID")
    private Long removerId;
}
