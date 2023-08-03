package api.api.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "publishers")
public class Publisher {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublisher_name() {
        return publisher_name;
    }

    public void setPublisher_name(String publisher_name) {
        this.publisher_name = publisher_name;
    }

    public String getPublisher_email() {
        return publisher_email;
    }

    public void setPublisher_email(String publisher_email) {
        this.publisher_email = publisher_email;
    }

    public String getPublisher_description() {
        return publisher_description;
    }

    public void setPublisher_description(String publisher_description) {
        this.publisher_description = publisher_description;
    }

    public String getPublisher_icon() {
        return publisher_icon;
    }

    public void setPublisher_icon(String publisher_icon) {
        this.publisher_icon = publisher_icon;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", publisher_name='" + publisher_name + '\'' +
                ", publisher_email='" + publisher_email + '\'' +
                ", publisher_description='" + publisher_description + '\'' +
                ", publisher_icon='" + publisher_icon + '\'' +
                '}';
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "publisher_name")
    private String publisher_name;

    @Column(name = "publisher_email")
    private String publisher_email;

    @Column(name = "publisher_description",  columnDefinition="TEXT")
    private String publisher_description;

    @Column(name = "publisher_icon",  columnDefinition="TEXT")
    private String publisher_icon;
}
