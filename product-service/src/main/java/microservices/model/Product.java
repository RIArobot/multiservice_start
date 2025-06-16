package microservices.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record Product(
        String id,
        String name,
        Double price
) {}
