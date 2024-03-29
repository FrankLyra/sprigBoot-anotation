package br.com.projeto.exemplo03.model;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="alunos")
@Getter
@Setter
public class Aluno {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String nome;
    @ManyToAny
    @JoinTable(
        name = "alunos_cursos",
        joinColumns = {@JoinColumn(name="codigo_aluno", referencedColumnName = "codigo")},
        inverseJoinColumns = {@JoinColumn(name="codigo_curso", referencedColumnName = "codigo")}
    )
    private List<Curso> cursos;
}
