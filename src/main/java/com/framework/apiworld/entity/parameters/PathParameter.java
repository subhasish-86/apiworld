package com.framework.apiworld.entity.parameters;

import java.util.Objects;

/**
 * PathParameter
 */

public class PathParameter extends Parameter {
    private String in = "path";
    private Boolean required = true;

    /**
     * returns the in property from a PathParameter instance.
     *
     * @return String in
     **/

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

    public PathParameter in(String in) {
        this.in = in;
        return this;
    }

    /**
     * returns the required property from a PathParameter instance.
     *
     * @return Boolean required
     **/

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public PathParameter required(Boolean required) {
        this.required = required;
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
        PathParameter pathParameter = (PathParameter) o;
        return Objects.equals(this.in, pathParameter.in) &&
                Objects.equals(this.required, pathParameter.required) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(in, required, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PathParameter {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    in: ").append(toIndentedString(in)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
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

