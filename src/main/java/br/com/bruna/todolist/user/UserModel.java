package br.com.bruna.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_users")
public class UserModel {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(unique = true)
    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;

}

/*
 * getters: quando queremos saber a informação do que tem dentro do atributo
 * usamos o método get apondando para o atributo, recuperando a informação
 * 
 * setters: quando queremos atualizar, definir, inserir um valor ao atributo
 * privado de uma Class usamos o método set;
 * 
 * Como funciona?
 * Getter (Acessador): usado para obter o valor de um atributo (campo) privado
 * de uma classe; retorna o valor do atributo; eles são públicos para que outras
 * partes do código possam acessar os valores dos atributos, mas os atributos em
 * si são frequentemente declarados como privados.
 * 
 * Setter (Modificador): usado para definir (alterar) o valor de um atributo
 * privado de uma classe; recebe um parâmetro que representa o novo valor a ser
 * atribuído ao atributo; eles são públicos para que outras partes do código
 * possam definir (modificar) os valores dos atributos de forma controlada.
 * 
 */
