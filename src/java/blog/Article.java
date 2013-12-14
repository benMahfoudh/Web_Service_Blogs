/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blog;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mehdi
 */
@Entity
@XmlRootElement
public class Article implements Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Article other = (Article) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String title;
    private String keywords;
    private String published_on;
    private String content;
    private String photo;
    public void setTitle(String title) {
        this.title = title;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public void setPublished_on(String published_on) {
        this.published_on = published_on;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Article{" + "id=" + id + '}';
    }

    public void setPosition_longitude(Long position_longitude) {
        this.position_longitude = position_longitude;
    }

    public void setPosition_latitude(Long position_latitude) {
        this.position_latitude = position_latitude;
    }

    public void setPosition_name(String position_name) {
        this.position_name = position_name;
    }
    
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getTitle() {
        return title;
    }

    public String getKeywords() {
        return keywords;
    }

    public String getPublished_on() {
        return published_on;
    }

    public String getContent() {
        return content;
    }

    public String getPhoto() {
        return photo;
    }

    public Long getPosition_longitude() {
        return position_longitude;
    }

    public Long getPosition_latitude() {
        return position_latitude;
    }

    public String getPosition_name() {
        return position_name;
    }
    private Long position_longitude;
    private Long position_latitude;
    private String position_name;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}