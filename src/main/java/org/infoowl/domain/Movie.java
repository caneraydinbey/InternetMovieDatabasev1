package org.infoowl.domain;

/**
 * Created by caneraydin on 25.03.2016.
 */


import javax.persistence.*;

/**
 * Created by caneraydin on 15.03.2016.
 */
@Entity
@Table(name = "movie")
public class Movie {

    @Column (name="actor",nullable = false)
    private String actor;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (name="title",nullable = false, unique = true)
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public Movie(){}

    public Movie(Long id){
        this.id = id;
    }

    public Movie(String title, String actor){
        this.title = title;
        this.actor = actor;
    }

    public String toString(){
        return ("Movie \n id="+id+"\ntitle: "+title+"\nactor= "+actor);
    }

}