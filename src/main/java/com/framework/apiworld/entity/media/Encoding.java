package com.framework.apiworld.entity.media;

import com.framework.apiworld.entity.headers.Header;

import java.util.Map;
import java.util.Objects;

/**
 * Encoding
 *
 * #encodingObject"
 */

public class Encoding {
    private String contentType;
    private Map<String, Header> headers;
    private StyleEnum style;
    private Boolean explode;
    private Boolean allowReserved;
    private java.util.Map<String, Object> extensions = null;

    public enum StyleEnum {
        FORM("form"),
        SPACE_DELIMITED("spaceDelimited"),
        PIPE_DELIMITED("pipeDelimited"),
        DEEP_OBJECT("deepObject");

        private String value;

        StyleEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    public Encoding() {
    }

    public Encoding contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Encoding headers(Map<String, Header> headers) {
        this.headers = headers;
        return this;
    }

    public Map<String, Header> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, Header> headers) {
        this.headers = headers;
    }

    public Encoding style(StyleEnum style) {
        this.style = style;
        return this;
    }

    public StyleEnum getStyle() {
        return style;
    }

    public void setStyle(StyleEnum style) {
        this.style = style;
    }

    public Encoding explode(Boolean explode) {
        this.explode = explode;
        return this;
    }

    public Boolean getExplode() {
        return explode;
    }

    public void setExplode(Boolean explode) {
        this.explode = explode;
    }

    public Encoding allowReserved(Boolean allowReserved) {
        this.allowReserved = allowReserved;
        return this;
    }

    public Boolean getAllowReserved() {
        return allowReserved;
    }

    public void setAllowReserved(Boolean allowReserved) {
        this.allowReserved = allowReserved;
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

    public Encoding extensions(java.util.Map<String, Object> extensions) {
        this.extensions = extensions;
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
        Encoding encoding = (Encoding) o;
        return Objects.equals(this.contentType, encoding.contentType) &&
                Objects.equals(this.headers, encoding.headers) &&
                Objects.equals(this.style, encoding.style) &&
                Objects.equals(this.explode, encoding.explode) &&
                Objects.equals(this.extensions, encoding.extensions) &&
                Objects.equals(this.allowReserved, encoding.allowReserved);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentType, headers, style, explode, allowReserved, extensions);
    }

    @Override
    public String toString() {
        return "Encoding{" +
                "contentType='" + contentType + '\'' +
                ", headers=" + headers +
                ", style='" + style + '\'' +
                ", explode=" + explode +
                ", allowReserved=" + allowReserved +
                ", extensions=" + extensions +
                '}';
    }
}
