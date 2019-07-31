package com.framework.apiworld.entity.info;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Objects;

/**
 * #infoObject"
 */

//@Document
public class Info {
    @Field
    private String title = null;

    @Field
    private String description = null;

    @Field
    private String termsOfService = null;

    @Field
    private Contact contact = null;

    @Field
    private License license = null;

    @Field
    private String version = null;

    @Field
    private java.util.Map<String, Object> extensions = null;

    /**
     * returns the title property from a Info instance.
     *
     * @return String title
     **/

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Info title(String title) {
        this.title = title;
        return this;
    }

    /**
     * returns the description property from a Info instance.
     *
     * @return String description
     **/

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Info description(String description) {
        this.description = description;
        return this;
    }

    /**
     * returns the termsOfService property from a Info instance.
     *
     * @return String termsOfService
     **/

    public String getTermsOfService() {
        return termsOfService;
    }

    public void setTermsOfService(String termsOfService) {
        this.termsOfService = termsOfService;
    }

    public Info termsOfService(String termsOfService) {
        this.termsOfService = termsOfService;
        return this;
    }

    /**
     * returns the contact property from a Info instance.
     *
     * @return Contact contact
     **/

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Info contact(Contact contact) {
        this.contact = contact;
        return this;
    }

    /**
     * returns the license property from a Info instance.
     *
     * @return License license
     **/

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    public Info license(License license) {
        this.license = license;
        return this;
    }

    /**
     * returns the version property from a Info instance.
     *
     * @return String version
     **/

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Info version(String version) {
        this.version = version;
        return this;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Info info = (Info) o;
        return Objects.equals(this.title, info.title) &&
                Objects.equals(this.description, info.description) &&
                Objects.equals(this.termsOfService, info.termsOfService) &&
                Objects.equals(this.contact, info.contact) &&
                Objects.equals(this.license, info.license) &&
                Objects.equals(this.version, info.version) &&
                Objects.equals(this.extensions, info.extensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, termsOfService, contact, license, version, extensions);
    }

    public java.util.Map<String, Object> getExtensions() {
        return extensions;
    }

    public void addExtension(String name, Object value) {
        if (name == null || name.isEmpty() || !name.startsWith("x-")) {
            return;
        }
        if (this.extensions == null) {
            this.extensions = new java.util.LinkedHashMap<>();
        }
        this.extensions.put(name, value);
    }

    public void setExtensions(java.util.Map<String, Object> extensions) {
        this.extensions = extensions;
    }

    public Info extensions(java.util.Map<String, Object> extensions) {
        this.extensions = extensions;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Info {\n");

        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    termsOfService: ").append(toIndentedString(termsOfService)).append("\n");
        sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
        sb.append("    license: ").append(toIndentedString(license)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

