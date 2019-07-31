package com.framework.apiworld.entity.parameters;

import java.util.Objects;

/**
 * QueryParameter
 */

public class QueryParameter extends Parameter {
    private String in = "query";

    /**
     * returns the in property from a QueryParameter instance.
     *
     * @return String in
     **/

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

    public QueryParameter in(String in) {
        this.in = in;
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
        QueryParameter queryParameter = (QueryParameter) o;
        return Objects.equals(this.in, queryParameter.in) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(in, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryParameter {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    in: ").append(toIndentedString(in)).append("\n");
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

