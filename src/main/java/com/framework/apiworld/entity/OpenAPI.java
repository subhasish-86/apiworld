package com.framework.apiworld.entity;

import com.framework.apiworld.entity.info.Info;
import com.framework.apiworld.entity.media.Schema;
import com.framework.apiworld.entity.security.SecurityRequirement;
import com.framework.apiworld.entity.security.SecurityScheme;
import com.framework.apiworld.entity.servers.Server;
import com.framework.apiworld.entity.tags.Tag;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;


import java.util.*;

/**
 * OpenAPI
 *
 * "
 */

//@Document(collection = "apicollection")
public class OpenAPI {


    @Id
    public String  id;

    @Field
    private String openapi = "3.0.1";

    @Field
    private Info info = null;

    @Field
    private ExternalDocumentation externalDocs = null;

    @Field
    private List<Server> servers = null;

    @Field
    private List<SecurityRequirement> security = null;

    @Field
    private List<Tag> tags = null;

    @Field
    private Paths paths = null;

    @Field
    private Components components = null;

    @Field
    private Map<String, Object> extensions = null;

    public String getOpenapi() {
        return openapi;
    }

    public void setOpenapi(String openapi) {
        this.openapi = openapi;
    }

    public OpenAPI openapi(String openapi) {
        this.openapi = openapi;
        return this;
    }

    /**
     * returns the info property from a OpenAPI instance.
     *
     * @return Info info
     **/

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public OpenAPI info(Info info) {
        this.info = info;
        return this;
    }

    /**
     * returns the externalDocs property from a OpenAPI instance.
     *
     * @return ExternalDocumentation externalDocs
     **/

    public ExternalDocumentation getExternalDocs() {
        return externalDocs;
    }

    public void setExternalDocs(ExternalDocumentation externalDocs) {
        this.externalDocs = externalDocs;
    }

    public OpenAPI externalDocs(ExternalDocumentation externalDocs) {
        this.externalDocs = externalDocs;
        return this;
    }

    /**
     * Servers defined in the API
     *
     * @return List&lt;Server&gt; servers
     **/

    public List<Server> getServers() {
        return servers;
    }

    public void setServers(List<Server> servers) {
        this.servers = servers;
    }

    public OpenAPI servers(List<Server> servers) {
        this.servers = servers;
        return this;
    }

    public OpenAPI addServersItem(Server serversItem) {
        if (this.servers == null) {
            this.servers = new ArrayList<Server>();
        }
        this.servers.add(serversItem);
        return this;
    }

    /**
     * returns the security property from a OpenAPI instance.
     *
     * @return List&lt;SecurityRequirement&gt; security
     **/

    public List<SecurityRequirement> getSecurity() {
        return security;
    }

    public void setSecurity(List<SecurityRequirement> security) {
        this.security = security;
    }

    public OpenAPI security(List<SecurityRequirement> security) {
        this.security = security;
        return this;
    }

    public OpenAPI addSecurityItem(SecurityRequirement securityItem) {
        if (this.security == null) {
            this.security = new ArrayList<SecurityRequirement>();
        }
        this.security.add(securityItem);
        return this;
    }

    /**
     * returns the tags property from a OpenAPI instance.
     *
     * @return List&lt;Tag&gt; tags
     **/

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public OpenAPI tags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public OpenAPI addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<Tag>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * returns the paths property from a OpenAPI instance.
     *
     * @return Paths paths
     **/

    public Paths getPaths() {
        return paths;
    }

    public void setPaths(Paths paths) {
        this.paths = paths;
    }

    public OpenAPI paths(Paths paths) {
        this.paths = paths;
        return this;
    }

    /**
     * returns the components property from a OpenAPI instance.
     *
     * @return Components components
     **/

    public Components getComponents() {
        return components;
    }

    public void setComponents(Components components) {
        this.components = components;
    }

    public OpenAPI components(Components components) {
        this.components = components;
        return this;
    }

    /*
     * helpers
     */

    public OpenAPI path(String name, PathItem path) {
        if (this.paths == null) {
            this.paths = new Paths();
        }

        this.paths.addPathItem(name, path);
        return this;
    }

    public OpenAPI schema(String name, Schema schema) {
        if (components == null) {
            this.components = new Components();
        }
        components.addSchemas(name, schema);
        return this;
    }

    public OpenAPI schemaRequirement(String name, SecurityScheme securityScheme) {
        if (components == null) {
            this.components = new Components();
        }
        components.addSecuritySchemes(name, securityScheme);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpenAPI openAPI = (OpenAPI) o;
        return Objects.equals(this.openapi, openAPI.openapi) &&
                Objects.equals(this.info, openAPI.info) &&
                Objects.equals(this.externalDocs, openAPI.externalDocs) &&
                Objects.equals(this.servers, openAPI.servers) &&
                Objects.equals(this.security, openAPI.security) &&
                Objects.equals(this.tags, openAPI.tags) &&
                Objects.equals(this.paths, openAPI.paths) &&
                Objects.equals(this.components, openAPI.components) &&
                Objects.equals(this.extensions, openAPI.extensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(openapi, info, externalDocs, servers, security, tags, paths, components, extensions);
    }

    public Map<String, Object> getExtensions() {
        return extensions;
    }

    public void addExtension(String name, Object value) {
        if (name == null || name.isEmpty() || !name.startsWith("x-")) {
            return;
        }
        if (this.extensions == null) {
            this.extensions = new LinkedHashMap<>();
        }
        this.extensions.put(name, value);
    }

    public void setExtensions(Map<String, Object> extensions) {
        this.extensions = extensions;
    }

    public OpenAPI extensions(Map<String, Object> extensions) {
        this.extensions = extensions;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenAPI {\n");

        sb.append("    openapi: ").append(toIndentedString(openapi)).append("\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
        sb.append("    externalDocs: ").append(toIndentedString(externalDocs)).append("\n");
        sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
        sb.append("    security: ").append(toIndentedString(security)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
        sb.append("    components: ").append(toIndentedString(components)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

