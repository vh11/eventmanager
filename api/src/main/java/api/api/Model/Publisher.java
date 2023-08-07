package api.api.Model;

import javax.persistence.*;

@Entity
@Table(name = "publishers")
public class Publisher {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                ", publisher_description='" + publisher_description + '\'' +
                ", publisher_icon='" + publisher_icon + '\'' +
                ", user=" + user +
                '}';
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "publisher_description", nullable = false)
    private String publisher_description;

    @Column(name = "publisher_icon")
    private String publisher_icon;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
