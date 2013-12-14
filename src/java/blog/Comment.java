/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blog;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mehdi
 */
@Entity
@XmlRootElement
public class Comment implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String comment;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date commented_date;

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Comment other = (Comment) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Comment{" + "id=" + id + '}';
       
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setCommented_date(Date commented_date) {
        this.commented_date = commented_date;
    }
     

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public String getComment() {
        return comment;
    }

    public Date getCommented_date() {
        return commented_date;
    }
    
}
