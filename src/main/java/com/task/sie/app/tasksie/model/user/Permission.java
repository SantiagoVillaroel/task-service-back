package com.task.sie.app.tasksie.model.user;

import com.task.sie.app.tasksie.enums.EnumStatus;
import com.task.sie.app.tasksie.model.BaseModel;
import lombok.*;

import javax.persistence.*;

@Table(name = "sec_permissions")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Permission extends BaseModel {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EnumStatus status;
}