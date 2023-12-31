package com.mycompany.myapp.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mycompany.myapp.domain.enumeration.Status;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Artist.
 */
@Entity
@Table(name = "artist")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Artist implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "real_name")
    private String realName;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "phone")
    private String phone;

    @Column(name = "career")
    private String career;

    @Column(name = "vo_artwork")
    private String voArtwork;

    @Column(name = "vo_member")
    private String voMember;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

    @OneToMany(mappedBy = "artist")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    @JsonIgnoreProperties(value = { "artist" }, allowSetters = true)
    private Set<ArtistComment> artistcomments = new HashSet<>();

    @OneToMany(mappedBy = "artist")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    @JsonIgnoreProperties(value = { "artist" }, allowSetters = true)
    private Set<ArtistView> artistviews = new HashSet<>();

    @OneToMany(mappedBy = "artist")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    @JsonIgnoreProperties(value = { "artist" }, allowSetters = true)
    private Set<ArtistLike> artistlikes = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Artist id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public Artist name(String name) {
        this.setName(name);
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealName() {
        return this.realName;
    }

    public Artist realName(String realName) {
        this.setRealName(realName);
        return this;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public Artist imgUrl(String imgUrl) {
        this.setImgUrl(imgUrl);
        return this;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getPhone() {
        return this.phone;
    }

    public Artist phone(String phone) {
        this.setPhone(phone);
        return this;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCareer() {
        return this.career;
    }

    public Artist career(String career) {
        this.setCareer(career);
        return this;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getVoArtwork() {
        return this.voArtwork;
    }

    public Artist voArtwork(String voArtwork) {
        this.setVoArtwork(voArtwork);
        return this;
    }

    public void setVoArtwork(String voArtwork) {
        this.voArtwork = voArtwork;
    }

    public String getVoMember() {
        return this.voMember;
    }

    public Artist voMember(String voMember) {
        this.setVoMember(voMember);
        return this;
    }

    public void setVoMember(String voMember) {
        this.voMember = voMember;
    }

    public Status getStatus() {
        return this.status;
    }

    public Artist status(Status status) {
        this.setStatus(status);
        return this;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Set<ArtistComment> getArtistcomments() {
        return this.artistcomments;
    }

    public void setArtistcomments(Set<ArtistComment> artistComments) {
        if (this.artistcomments != null) {
            this.artistcomments.forEach(i -> i.setArtist(null));
        }
        if (artistComments != null) {
            artistComments.forEach(i -> i.setArtist(this));
        }
        this.artistcomments = artistComments;
    }

    public Artist artistcomments(Set<ArtistComment> artistComments) {
        this.setArtistcomments(artistComments);
        return this;
    }

    public Artist addArtistcomments(ArtistComment artistComment) {
        this.artistcomments.add(artistComment);
        artistComment.setArtist(this);
        return this;
    }

    public Artist removeArtistcomments(ArtistComment artistComment) {
        this.artistcomments.remove(artistComment);
        artistComment.setArtist(null);
        return this;
    }

    public Set<ArtistView> getArtistviews() {
        return this.artistviews;
    }

    public void setArtistviews(Set<ArtistView> artistViews) {
        if (this.artistviews != null) {
            this.artistviews.forEach(i -> i.setArtist(null));
        }
        if (artistViews != null) {
            artistViews.forEach(i -> i.setArtist(this));
        }
        this.artistviews = artistViews;
    }

    public Artist artistviews(Set<ArtistView> artistViews) {
        this.setArtistviews(artistViews);
        return this;
    }

    public Artist addArtistviews(ArtistView artistView) {
        this.artistviews.add(artistView);
        artistView.setArtist(this);
        return this;
    }

    public Artist removeArtistviews(ArtistView artistView) {
        this.artistviews.remove(artistView);
        artistView.setArtist(null);
        return this;
    }

    public Set<ArtistLike> getArtistlikes() {
        return this.artistlikes;
    }

    public void setArtistlikes(Set<ArtistLike> artistLikes) {
        if (this.artistlikes != null) {
            this.artistlikes.forEach(i -> i.setArtist(null));
        }
        if (artistLikes != null) {
            artistLikes.forEach(i -> i.setArtist(this));
        }
        this.artistlikes = artistLikes;
    }

    public Artist artistlikes(Set<ArtistLike> artistLikes) {
        this.setArtistlikes(artistLikes);
        return this;
    }

    public Artist addArtistlikes(ArtistLike artistLike) {
        this.artistlikes.add(artistLike);
        artistLike.setArtist(this);
        return this;
    }

    public Artist removeArtistlikes(ArtistLike artistLike) {
        this.artistlikes.remove(artistLike);
        artistLike.setArtist(null);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Artist)) {
            return false;
        }
        return id != null && id.equals(((Artist) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Artist{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", realName='" + getRealName() + "'" +
            ", imgUrl='" + getImgUrl() + "'" +
            ", phone='" + getPhone() + "'" +
            ", career='" + getCareer() + "'" +
            ", voArtwork='" + getVoArtwork() + "'" +
            ", voMember='" + getVoMember() + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }
}
