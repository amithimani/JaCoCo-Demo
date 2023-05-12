package dev.knowledgecafe;

@Generated // This whole Class will be excluded from Jacoco
public class PersonDTO {

    private String name;
    private String contact;

    @Generated // This method will be excluded from Jacoco
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonDTO personDTO = (PersonDTO) o;

        if (name != null ? !name.equals(personDTO.name) : personDTO.name != null) return false;
        return contact != null ? contact.equals(personDTO.contact) : personDTO.contact == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (contact != null ? contact.hashCode() : 0);
        return result;
    }
}
