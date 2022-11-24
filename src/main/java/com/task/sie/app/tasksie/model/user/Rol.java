package com.task.sie.app.tasksie.model.user;

import com.task.sie.app.tasksie.enums.EnumRol;
import com.task.sie.app.tasksie.model.BaseModel;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Table(name = "sec_roles")
@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Rol extends BaseModel {

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EnumRol name;

    @ManyToMany
    @JoinTable(
            name = "sec_rol_permissions",
            joinColumns = @JoinColumn(
                    name = "rol_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "permission_id", referencedColumnName = "id"))
    private Set<Permission> permissions;
}
