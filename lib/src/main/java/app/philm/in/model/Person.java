package app.philm.in.model;

import com.uwetrottmann.tmdb.entities.Credits;

import java.util.List;

public class Person implements PhilmModel {

    Integer tmdbId;
    String name;
    String pictureUrl;

    String placeOfBirth;
    long dateOfBirth;
    String biography;

    int pictureType;

    transient List<PhilmPersonCredit> castCredits;
    transient List<PhilmPersonCredit> crewCredits;
    transient boolean fetchedCredits;

    public void setFromTmdb(Credits.CrewMember tmdbCrewMember) {
        tmdbId = tmdbCrewMember.id;
        name = tmdbCrewMember.name;
        pictureUrl = tmdbCrewMember.profile_path;
        pictureType = TYPE_TMDB;
    }

    public void setFromTmdb(Credits.CastMember tmdbCastMember) {
        tmdbId = tmdbCastMember.id;
        name = tmdbCastMember.name;
        pictureUrl = tmdbCastMember.profile_path;
        pictureType = TYPE_TMDB;
    }

    public Integer getTmdbId() {
        return tmdbId;
    }

    public String getName() {
        return name;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public int getPictureType() {
        return pictureType;
    }

    public List<PhilmPersonCredit> getCastCredits() {
        return castCredits;
    }

    public void setCastCredits(List<PhilmPersonCredit> castCredits) {
        this.castCredits = castCredits;
    }

    public List<PhilmPersonCredit> getCrewCredits() {
        return crewCredits;
    }

    public void setCrewCredits(List<PhilmPersonCredit> crewCredits) {
        this.crewCredits = crewCredits;
    }

    public boolean hasFetchedCredits() {
        return fetchedCredits;
    }

    public void setFetchedCredits(boolean fetchedCredits) {
        this.fetchedCredits = fetchedCredits;
    }

    public String getBiography() {
        return biography;
    }

    public long getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }
}
